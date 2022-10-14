# Part one

## Code of the simpest search engine

'''

import java.net.URI;
import java.util.ArrayList;
import java.io.IOException;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    String  inputs ="";
    ArrayList<String> another_inputs= new ArrayList<>();
    ArrayList<String> result= new ArrayList<>();


    public String handleRequest(URI url) {
        
        if (url.getPath().contains("add")){
            String[] things_useful = url.getQuery().split("=");
            another_inputs.add(things_useful[1]);
            String need_to_return = String.format("String added: %s", things_useful[1]);
            return need_to_return;
            
        } else if (url.getPath().contains("search")){
            String[] things_useful = url.getQuery().split("=");
            String exists = things_useful[1];
            String result_to_return = "";
            for(String s: another_inputs){
                
                    result_to_return += s + " "; 
                
            }
            return result_to_return; 
               
        }
        else{
            return "404 Not Found!";
        }
    }
}


class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
'''

## Screenshots one
![Image](https://github.com/Kevinxsn/wavelet/blob/master/Screen%20Shot%202022-10-13%20at%206.59.30%20PM.png)

### Method called, relevent argument 
heandlRequested, the 'else' statement. This is becasue the URL doesn't contain anything excpt the value we give to create the local host. Which means the two 'if' statement will not be runed and the webpage will only tell us that '404 not found'


## Screenshot two
![Image](https://github.com/Kevinxsn/wavelet/blob/master/Screen%20Shot%202022-10-13%20at%206.59.42%20PM.png)

### Method called, relevent argument 
headRequested, the first 'if' statement is used. We can see that the url contains the add and there is some words after the  question mark. What I did is change the words before and after the equal marks into two element in a list and print that the word after the equal mark will be added into a list. 


## Screenshot three
![Image](https://github.com/Kevinxsn/wavelet/blob/master/Screen%20Shot%202022-10-13%20at%207.00.34%20PM.png)
### Method called, relevent argument 
headRequested, the second 'if' statement is used. This URL contains 'search', it means that the second if satement will be called. This if statement will help us to search the content after the equal marks and return the list that contains this content, even just part of it. 

# Part two
## 
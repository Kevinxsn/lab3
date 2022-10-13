import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;


public class ListTests {
    @Test 
	public void testMerge() {
    List<String> input1 = new ArrayList<String> ();
    List<String> input2 = new ArrayList<String>();
    input1.add("a");
    input1.add("b");
    input1.add("c");
    input2.add("d");
    input2.add("e");
    input2.add("f");
    assertArrayEquals(new String[]{"a", "b", "c", "d", "e", "f"}, ListExamples.merge(input1, input2).toArray());
	}
}

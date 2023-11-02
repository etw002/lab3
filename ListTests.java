import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;

public class ListTests {
    @Test 
	public void testFilter() {
        List<String> testList = {"abc","def","ghi"};
        assertArrayEquals(new int[]{ 3 }, input1);
	}


    @Test
    public void testMerge() {
        
        assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    }
}

public class containsA implements StringChecker{
    public boolean checkString(String s){
        return s.contains("a");
    };
}
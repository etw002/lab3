import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2(){
    int[] input1 = {1,2,3,4,5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5,4,3,2,1}, input1);

  }

  @Test
  public void testReversed2() {
    int[] input1 = {1,2,3,7,8};
    assertArrayEquals(new int[]{8,7,3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowestPass() {
    double[] input1 = {1,3,3,3,3};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1),0.1);
  }

  @Test
  public void testAverageWithoutLowestFail() {
    double[] input1 = {2,2,2,3,3,5};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1),0.1);
  }
}

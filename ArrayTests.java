import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	// @Test 
	// public void testReverseInPlace1() {
  //   int[] input1 = { 3 };
  //   ArrayExamples.reverseInPlace(input1);
  //   assertArrayEquals(new int[]{ 3 }, input1);
	// }

  // @Test 
	// public void testReverseInPlace2() {
  //   int[] input1 = { };
  //   ArrayExamples.reverseInPlace(input1);
  //   assertArrayEquals(new int[]{ }, input1);
	// }

  // @Test 
	// public void testReverseInPlace3() {
  //   int[] input1 = {1,2,3};
  //   ArrayExamples.reverseInPlace(input1);
  //   assertArrayEquals(new int[]{3,2,1}, input1);
	// }

  // @Test 
	// public void testReverseInPlace4() {
  //   int[] input1 = {1,2,3,4};
  //   ArrayExamples.reverseInPlace(input1);
  //   assertArrayEquals(new int[]{4,3,2,1}, input1);
	// }


  @Test
  public void testReversed1() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = {0};
    assertArrayEquals(new int[]{0}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed3() {
    int[] input1 = {1,2};
    assertArrayEquals(new int[]{2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed4() {
    int[] input1 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed5() {
    int[] input1 = {1,2,3,4};
    assertArrayEquals(new int[]{4,3,2,1}, ArrayExamples.reversed(input1));
  }



  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = { };
    double output = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(0.0, output, 0.1);
   }
}

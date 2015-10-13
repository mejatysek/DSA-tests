import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by mejty on 12.10.15.
 */
public class Homework1Test {
    @Test
    public void testEmptyArray() {
        Mergesort h = new Homework1();
        int[] i = new int[0];
        assertArrayEquals(i, h.mergesort(i));
    }
    @Test
    public void testOneElementArray() {
        Mergesort h = new Homework1();
        int[] i = {1};
        assertArrayEquals(i, h.mergesort(i));
    }
    @Test
    public void testTwoElementArray() {
        Mergesort h = new Homework1();
        int[] i = {2,1};
        int [] result = h.mergesort(i);
        Arrays.sort(i);
        assertArrayEquals(i, result);
    }
    @Test
    public void testThreeElementArray() {
        Mergesort h = new Homework1();
        int[] i = {2,1,9};
        int [] result = h.mergesort(i);
        Arrays.sort(i);
        assertArrayEquals(i, result);
    }
    @Test
    public void testRandomArray() {
        Mergesort h = new Homework1();
        Random rn = new Random();
        int count = Math.abs(rn.nextInt() % 1000000);
        // count = 100000000;
        System.out.println(count);
        int[] array = new int[count];
        for (int i = 0; i < count; i++){
            array[i] = rn.nextInt();
        }
        long start = System.currentTimeMillis();
        int [] result = h.mergesort(array);
        long merge = System.currentTimeMillis();
        Arrays.sort(array);
        long java = System.currentTimeMillis();
        System.out.format("merge: %d", merge - start);
        System.out.println();
        System.out.format("java quicksort: %d", java - merge);
        assertArrayEquals(array, result);
    }
}

package lesson2;

import org.apache.commons.lang3.RandomUtils;

import java.util.Arrays;

public class ArraysApplication {
    public static void main(String[] args) {
        int arraySize = 10;
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = RandomUtils.nextInt();
            System.out.println(array[i]);
        }
        System.out.println(Arrays.toString(array));

        array[0] = -1;
        System.out.println(Arrays.toString(array));
    }
}

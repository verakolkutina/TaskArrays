package _08022023;
/*Дан массив чисел в котором все числа имеют повторения,
кроме одного числа. Найти это число */

public class Array1 {

    public static int findSingleNumber(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length ; i++) {
            result ^= arr[i];
        }
        return result;
    }

    public static void main(String[] args) {


        int[] arr = new int[]{2,3,4,5,6,7,2,3,4,5,6,7,8};
        int single = findSingleNumber(arr);
        System.out.println("single number" + " " + single);

    }

    }


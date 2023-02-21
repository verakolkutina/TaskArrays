package _08022023;
/*3.Дан массив чисел. Найти число состоящее из собственных делителей.
Например число 128 состоит из 1 2 и 8. 128 % 1 == 0 ,
 128 % 2 == 0 и 128 % 8 == 0. Вот такие числа надо найти.
* */

public class Array3 {


    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 2, 11,10, 128, 18, 28, 76, 89, 38, 496};
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;


            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    count++;
                }
            }
            if (count == num -1) {
    System.out.println(num + " " + " состоит из свои делители");
}
        }


    }

}

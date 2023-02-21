package _08022023;
/*
* Написать метод который
•	генерирует двумерный массив длиной N и высотой H
•	Далее заполняет получившийся массив числами от 1 до W по спирали.
*  Например массив [ ][ ][ ][ ] [ ][ ][ ][ ] [ ][ ][ ][ ]
* имеет N == 4 and H == 3
* и вид [ 1 ][ 2 ][ 3 ][ 4 ]
* [10][11][12 ][ 5 ] [ 9 ][ 8 ][ 7 ][ 6 ]

*
*
*
* */

public class Array4 {
    public int[][] generateArray(int n, int h) {
        int[][] array = new int[n][h];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < h; j++) {
                array[i][j] = 0

                ;
            }
        }


        return array;

    }

    public static void main(String[] args) {

    }
}
package lesson1;

public class Task1 {
//    /* Минимум трех чисел
//    Написать функцию, которая вычисляет минимум из трёх чисел.
//    */
//    public static void main(String[] args) {
//        //System.out.println(min(5,2,3));
//    }
//
//    public static int min(int a, int b, int c) {
//        return 0;
//    }
//}

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 3;
        int min;

        if (a < b && a < c) {
            min=a;
            System.out.println("Min: " + min);
        }
        else if (b < a && b < c) {
            min=b;
            System.out.println("Min: "+ min);
        }
        else {
            min=c;
            System.out.println("Min: " + min);
        }

    }
}

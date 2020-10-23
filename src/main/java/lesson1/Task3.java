package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом while
*/

public class Task3 {

    public static void main(String[] args) {
//        String s = "Vladimir";
//        System.out.println(
//                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
//                        + s);
//        System.out.println(
//                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
//                        + s);
//        System.out.println(
//                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
//                        + s);
//        System.out.println(
//                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
//                        + s);
//        System.out.println(
//                s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " " + s + " "
//                        + s);
//    }
//}


    int y = 1;
    int x = 1;

        while (y < 6) {
        while (x <= 10) {
        System.out.print("Leonid ");
        x++;
        }
        System.out.println();
        x = 1;
        y++;


        }
    }
}
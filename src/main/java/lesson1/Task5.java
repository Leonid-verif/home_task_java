package lesson1;

/**
 * Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
 * например "Hello world!!!" -> "!!!dlrow olleH"
 */
public class Task5 {
//    public static void main(String[] args) {
//        //System.out.println(reverse("Hello world!!!"));
//    }
//
//    public static String reverse(String str) {
//        return "";
//    }
//}


    public static String reverse(String a) {
        int n = a.length();
        System.out.println(n);
        char[] newName = new char[n];
        for (int i = 0; i < a.length(); i++) {
            newName[--n] = a.charAt(i);
        }
        return new String(newName);
    }

    public static void main(String a[]) {

        String name = "Leonid";
        System.out.println(reverse(name));
    }
}
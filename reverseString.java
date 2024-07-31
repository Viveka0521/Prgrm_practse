package String;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        revrseSentnce();
        reverseWord();
    }


    // reversing the sentence
    public static void revrseSentnce() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence to reverse");
        String str2 = sc.nextLine();


        String[] s = str2.split(" ");
        String ans = " ";
        for (int i = s.length - 1; i >= 0; i--) {
            ans = ans + s[i] + " ";
        }
        System.out.println(ans);
    }

    public static void reverseWord() {
        //reversing a word
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the word to reverse");
        String str3 = sc1.nextLine();

        String rvrse = " ";
        for (int i = str3.length() - 1; i >= 0; i--) {
            rvrse = rvrse + str3.charAt(i);
        }
        System.out.println(rvrse);
    }

}

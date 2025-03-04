

import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();  
        sc.close();  

        System.out.println("Reversed sentence: " + reverseWords(str));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");  
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) { 
                result += words[i] + " ";
            }
        }

        return result.trim(); 
    }
}

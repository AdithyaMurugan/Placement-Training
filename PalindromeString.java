
public class PalindromeString {
    public static boolean isPalindromeString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equals(reversed); 
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindromeString(str) ? "Palindrome" : "Not a Palindrome");
    }
}

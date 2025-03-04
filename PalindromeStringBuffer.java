
public class PalindromeStringBuffer {
    public static boolean isPalindromeStringBuffer(String str) {
        return str.equals(new StringBuffer(str).reverse().toString()); 
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindromeStringBuffer(str) ? "Palindrome" : "Not a Palindrome");
    }
}

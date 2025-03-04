
public class PalindromeStringBuilder {
    public static boolean isPalindromeStringBuilder(String str) {
        return str.equals(new StringBuilder(str).reverse().toString()); 
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindromeStringBuilder(str) ? "Palindrome" : "Not a Palindrome");
    }
}

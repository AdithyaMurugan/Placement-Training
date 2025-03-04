class LargenumberAddition {
    public static void main(String[] args) {
        String num1 = "9999999999999";
        String num2 = "444444444444";
        
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0, d1, d2, sumDigit;
        
        StringBuilder sum = new StringBuilder();
        
        
        while (i >= 0 || j >= 0 || carry > 0) {
            d1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            d2 = (j >= 0) ? num2.charAt(j) - '0' : 0; 
            
            int inSum = d1 + d2 + carry;
            sumDigit = inSum % 10; 
            carry = inSum / 10;
            
            sum.append(sumDigit);
            
            i--;
            j--;
        }
        
    
        System.out.println(sum.reverse().toString());
    }
}

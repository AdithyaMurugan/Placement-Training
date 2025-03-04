class Harshadnumber {
    public static void main(String[] args) {
        for (int n = 500; n < 2500; n++) { 
            int sum = 0; 
            int num = n; 

            while (num > 0) {
                int digit = num % 10;
                sum += digit; 
                num /= 10;
            }

            if (n % sum == 0) { 
                System.out.println(n);
            }
        }
    }
}

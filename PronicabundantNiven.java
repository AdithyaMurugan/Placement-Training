class PronicabundantNiven{
    public static void main(String[] args) {
        for (int n = 500; n < 2500; n++) {
            if (isPronic(n)) System.out.println(n + " is Pronic");
            if (isAbundant(n)) System.out.println(n + " is Abundant");
            if (isNiven(n)) System.out.println(n + " is Niven");
        }
    }

  
    static boolean isPronic(int n) {
        for (int i = 0; i * (i + 1) <= n; i++)
            if (i * (i + 1) == n) return true;
        return false;
    }

 
    static boolean isAbundant(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0) sum += i;
        return sum > n;
    }

  
    static boolean isNiven(int n) {
        int sum = 0, num = n;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return (sum != 0) && (n % sum == 0);
    }
}

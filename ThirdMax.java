
	public class ThirdMax {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int arr[][] = { 
            { 5, 4, 7 },
            { 1, 8, 3 },
            { 9, 6, 2 }
        };
        
        int Firstmax = Integer.MIN_VALUE; 
        int secondmax = Integer.MIN_VALUE; 
        int thirdmax = Integer.MIN_VALUE; 
        
        for (int row = 0; row < n; row++) {  
            for (int col = 0; col < m; col++) {  
                if (arr[row][col] > Firstmax) {
                    Firstmax = arr[row][col]; 
                    
                }
            }
        }
        
 for (int row = 0; row < n; row++) {  
            for (int col = 0; col < m; col++) {  
                if (arr[row][col] > secondmax && arr[row][col]<Firstmax) {
                    secondmax= arr[row][col]; 
                    
                }
            }
        }
         for (int row = 0; row < n; row++) {  
            for (int col = 0; col < m; col++) {  
                if (arr[row][col] > thirdmax && arr[row][col]<Firstmax && arr[row][col]<secondmax) {
                    thirdmax= arr[row][col]; 
                    
                }
            }
        } 
        System.out.println(secondmax);
    }
}
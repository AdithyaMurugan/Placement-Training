import java.util.Arrays;

public class sortmatrix{
    public static void main(String[] args) {
        int n = 3, m = 3;
        int arr[][] = { 
            { 5, 4, 7 },
            { 1, 8, 3 },
            { 9, 6, 2 }
        };

        int size = n * m;
        int temp[] = new int[size];

    
        int k = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                temp[k++] = arr[row][col];
            }
        }

        
        Arrays.sort(temp);

        
        k = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                arr[row][col] = temp[k++];
            }
        }

    
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
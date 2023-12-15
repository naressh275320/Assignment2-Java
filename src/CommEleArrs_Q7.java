//7) Write a Java program to find common elements between two integer arrays
import java.util.Scanner;
public class CommEleArrs_Q7 {
    public static void main(String[] args){
        
        //Scanner definition
        Scanner s = new Scanner(System.in);
        int c = -1;

        //Taking input for the length of the array
        System.out.print("Enter the lenght for array 1: ");
        int n = s.nextInt();
        System.out.print("Enter the lenght for array 2: ");
        int m = s.nextInt();

         //Declaration of array with the length 
         int arr1[] = new int[n];
         int arr2[] = new int[m];

         //Taking array input
        for(int i=0; i<n; i++){
            System.out.print("Enter the array 1 element: ");
            arr1[i] = s.nextInt();
        }
        for(int i=0; i<m; i++){
            System.out.print("Enter the array 2 element: ");
            arr2[i] = s.nextInt();
        }

        //Searching for duplicate value with multiple for loops
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i] == arr2[j]){
                    c = 1;
                    System.out.print("The common elements are: ");
                    System.out.println(arr1[i] + " ");
                }
            }
        }
        if(c == -1){
            System.out.println("No common elements");
        }
    }
}

//3) Write a Java program to remove a specific element from an array.

import java.util.Scanner;
public class DelEleArr_Q3{
    public static void main(String[] args){
        
        //Scanner definition
        Scanner s = new Scanner(System.in);
        
        //Taking input for the length of the array
        System.out.print("Enter the lenght of the array: ");
        int n = s.nextInt();
        
        //Declaration of array with the length 
        int arr[] = new int[n];
        int ele, ind = -1, c = 0;
        
        //Taking array input
        for(int i=0; i<n; i++){
            System.out.print("Enter the array element: ");
            arr[i] = s.nextInt();
        }
        
        //Taking input of the element which has to be deleted from the array
        System.out.print("Enter the element to be deleted in the array: ");
        ele = s.nextInt();

        //Traversing the array to find the index of the element to be deleted
        for(int i=0; i<n; i++){
            if(arr[i] == ele){
                ind = i;
                c = 1;
                break;
            }
        }

        if(c == 1){
            //Modifying the array after finding the index which has to be deleted
            for(int i=ind; i<n-1; i++){
                arr[i] = arr[i+1];
            }
        
            //Reducing the length of the array after deleting one array
            n--;

            //Displaying the modified array after the deletion process
            System.out.print("The updated array after deleting the element: ");
            for(int i=0; i<n; i++){
                System.out.print(arr[i]+ " ");
            }
        }
        else{
            System.out.println("Element is not present in the array to delete!");
        }
    }    
}

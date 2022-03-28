import java.util.Scanner; 

public class LinearSearch {
        // Todo 01: - complete the implementation of linear search and test your code  
         //         - prvoide asymptotic analysis of the developed solution
         
    public static int search(int arr[], int x)//Linear search method
    {
        int n = arr.length;//N is set to length of array
        for (int i = 0; i < n; i++)//loop that runs through all the elements in the array
        {
            if (arr[i] == x)//if the element is equal to the varible it returns the index number
                return i;
        }
        return -1;//if the for loop does not reach the if stament then the method returns -1 for use in the main arguemnt
    }
 
    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 2, 3, 4, 10, 40 };//preset array
        Scanner myObj = new Scanner(System.in);//allows user to input a varible
        System.out.println("Plese input a number and we will search for the varible in the array");
        int x = myObj.nextInt();
        
 
        // Function call
        int result = search(arr, x);//calls the method and returns a integer
        if (result == -1)//if -1 is returned then the varbile was no present in the array
            System.out.print("Element is not present in array");
        else//if a verible is return, it will be where it is found in the array and displayed here
            System.out.print("Element is present at index " + result);
    }

         
        }
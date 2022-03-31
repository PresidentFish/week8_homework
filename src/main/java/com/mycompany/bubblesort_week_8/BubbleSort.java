
 //ToDo 3: complete this algorithm, test it, provide its time complexity
//This program is a simple sorting algorithm that reapeats steps through a list to organize data. 
//It compares the elements in order and swaps them if they are wrong
//In this example it will sort the array from the smallest to largest numbers
//The time complexity of this program is 0(n)
public class BubbleSort {

    void bubbleSort(int arr[])
    {
        int n = arr.length; //N equals the length of the array
        for (int i = 0; i < n-1; i++) //runs the length of the array minus 1, 
            for (int j = 0; j < n-i-1; j++)//uses nested for loop the check all the values in the array
                if (arr[j] > arr[j+1])//If the value is higher than the value in front of it in the array
                {
                    int temp = arr[j];//the higher value is saved in temp varible
                    arr[j] = arr[j+1];//J is then first value that was check is set to the smaller value
                    arr[j+1] = temp;//then the larger value takes place of in the array where the smaller one was
                }
    }
    void printArray(int arr[])//function used to print all the values in an array
    {
        int n = arr.length;//sets a value of the length of the array
        for (int i=0; i<n; ++i)//use previous n value to run a foor loop the length of the array
            System.out.print(arr[i] + " ");//prints out every time the array loops, printing out all the values of the array
        System.out.println();
    }
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();//new obejct we can used store value for a bubble sort
        int arr[] = {64, 34, 25, 12, 22, 11, 90};//user created array we use in this example
        ob.bubbleSort(arr);//calls the bubble sort method and changes the values from smallest too largest
        System.out.println("Sorted array");
        ob.printArray(arr);//calls our printArray function
    }
    
    
}
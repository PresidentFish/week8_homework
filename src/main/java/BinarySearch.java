//Kevin Carpenter
//The time complexity of the binary search algorithm is O(log n). If the best possible out come would be 0(1) if the middle value is equal to the value we are looking for

public class BinarySearch {

    public static int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {//while 0 less than or equal to last value
            int mid = low + ((high - low) / 2);//establises the middle value for the array 
            if (sortedArray[mid] < key) {//goes to the middle value of the array
                low = mid + 1;//If the value we are looking for is greater than our middle value we go up in the index
            } else if (sortedArray[mid] > key) {//if the value we are looking for is less than the middle value we go down in the index
                high = mid - 1;
            } else if (sortedArray[mid] == key) {//If the value we are at in the index is the same as the value we are looking for we set the value to where it is in the index
                index = mid;
                break;
            }
        }
        return index;//return the index postion in the array 
    }
    
    public static void main(String[] args) {
       int arr[] = {10,20,30,40,50};//creating the array
        int key = 30; //the value we are looking for 
        int last=arr.length-1;//establishes what the last value in the array is
        System.out.println(runBinarySearchIteratively(arr,key,0,last));//Calls the binary search function and prints out returned value of the index
        
      
      
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 
    
    

}
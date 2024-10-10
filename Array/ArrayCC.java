import java.util.*;
public class ArrayCC {

    public static int linearSearch(int numbers[],int key){
        for(int i =0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }


    public static int getLargest(int number[]){
        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        for(int i= 0;i<number.length;i++){
            if(Largest<number[i]){
                Largest = number[i];
            }
            if(Smallest > number[i]){
                Smallest = number[i];
            }

        }
        System.out.println("Smallest number is " + Smallest);
        return Largest;
    }

    public static int binarySearch(int numbers[],int key){
        int start =0,end=numbers.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if (numbers[mid]==key) {
                return mid;
                
            }
            if(numbers[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
            
        }
        return -1;
    }

    public static void reverse(int numbers[]){
        int first = 0, last = numbers.length-1;
        while (first<last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
            
        }
    }

    public static void printPairs(int numbers[]){
        int tp = 0;
        for(int i= 0;i<numbers.length;i++){
            int curr = numbers[i];
            for(int j = i+1;j<numbers.length;j++){
                System.out.print("(" + curr + "," +numbers[j] + ")");
                tp++;
            }
            System.out.println();

        }
        System.out.println("total pairs = " + tp);
    }


    public static void printSubArrays(int numbers[]){
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    
                }
                ts++;
                System.out.println();
                
            }
            System.out.println();
            
        }
        System.out.println("Total subarrays = " + ts);
    }

    public static void MaxSubArraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += numbers[k];
                    
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
                
            }
            
        }
        System.out.println("max sum = " + maxSum);
    }

    public static void MaxSubArraySumPrefix(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[]  = new int[numbers.length];
        prefix[0] = numbers[0];


        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1]+numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end]:prefix[end]-prefix[start-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
                
            }
            
        }
        System.out.println("max sum = " + maxSum);
    }

    


    public static void main(String[] args) {
        // int numbers[] = {2,4,6,8,10,12,14,16};
        // int key = 20;
        // int index = linearSearch(numbers, key);
        // if(index==-1){
        //     System.out.println("NOT FOUND");
        // }
        // else{
        //     System.out.println("key is at index: " + index);
        // }

        // int number[] = {1,2,6,3,5} ;
        // System.out.println("largest number is " + getLargest(number));

        // int numbers[] = {2,4,6,8,10,12,14,16};
        // int key = 12;
        // System.out.println("element is found at index number : " + binarySearch(numbers, key));



    //     int numbers[] = {2,4,6,8,10};
    //     reverse(numbers);
    //     for(int i=0;i<numbers.length;i++){
    //         System.out.print(numbers[i]+ " ");
    //     }
    //     System.out.println();


    // int numbers[] = {2,4,6,8,10};
    // printPairs(numbers);


    // int numbers[] = {2,4,6,8,10,12,14,16,18,20};
    // printSubArrays(numbers);

    // int numbers[] = {1,-2,6,-1,3};
    // MaxSubArraySum(numbers);
    // }

    int numbers[] = {1,-2,6,-1,3};
    MaxSubArraySumPrefix(numbers);
    }

}
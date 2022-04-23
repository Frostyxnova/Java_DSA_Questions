public class Reverse_the_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverseArray(arr, 0, 4);
        printArray(arr, 5);
    }

    /* Function to reverse arr[] from
       start to end*/
    static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    /* Utility that prints out an
       array on a line */
    static void printArray(int arr[],
                           int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
    // Recursive Java Program to reverse an array

    /* Function to reverse arr[] from start to end*/
    static void recursiveRevArray(int[] arr,int s,int e){
        int temp;
        if (s>=e)
            return;
        temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        recursiveRevArray(arr,s+1,e-1);
    }

}

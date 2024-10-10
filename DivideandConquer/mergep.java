public class mergep {
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {  // Fix the loop condition
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from the first half
        while (i <= mid) {
            temp[k++] = arr[i++];  // Fix index increment
        }

        // Copy remaining elements from the second half
        while (j <= ei) {
            temp[k++] = arr[j++];  // Fix index increment
        }

        // Copy temp array back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 4, 3};
        mergeSort(arr, 0, arr.length - 1);
        printarr(arr);
    }
}

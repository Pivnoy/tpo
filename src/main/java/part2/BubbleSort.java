package part2;

public class BubbleSort {

    private void swap(int [] arr, int j){
        int t = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = t;
    }

    private void bubbleSortImpl(int [] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j);
                }
            }
        }
    }

    public void bubbleSort(int [] arr){
        if (arr != null){
            bubbleSortImpl(arr);
        }
    }
}

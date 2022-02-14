package part2;

public class BubbleSort {

    public void bubbleSort(Integer [] arr) {
        int n = arr.length;
        for (int i = 0; i < n;i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

    }
}

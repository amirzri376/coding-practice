
package quicksort;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = {3, 4, 5, 2, 1};
        quickSort(a, 0, a.length - 1);
        System.out.print("Sorted Result: ");
        print(a);
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            System.out.print("Do partition from " + low + " to " + high + " in : ");
            print(array);
            int p = partition(array, low, high);
            quickSort(array, low, p - 1);
            quickSort(array, p + 1, high);
        }
    }

    public static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, right);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

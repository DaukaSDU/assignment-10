public class QuickSort {

    public static void main(String[] args) {

        String[] arr = new String[]{"A", "B", "A", "ABSB", "CDK", "MAN", "WOMAN"};

        sort(arr, 0, arr.length - 1);

        System.out.println(java.util.Arrays.toString(arr));

    }

    public static void sort(String[] arr, int l, int r) {

        if (l >= r)
            return;

        int pi = partition(arr, l, r);

        sort(arr, l, pi-1);
        sort(arr, pi+1, r);
        //Write commets please. I don't understand your code!!!!!!!!

    }

    public static int partition(String arr[], int l, int r) {
        String pivot = arr[r];
        int pi = l-1;
        for (int i = l; i < r; i++) {
            if (arr[i].compareTo(pivot) < 1) {
                pi++;
                swap(arr, pi, i);
            }
        }
        swap(arr, pi + 1, r);
        return pi + 1;
    }

    public static void swap(String[] arr, int pi, int i) {
        String temp = arr[pi];
        arr[pi] = arr[i];
        arr[i] = temp;
    }

}
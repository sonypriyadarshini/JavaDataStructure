package sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Data implements Comparable<Data> {
    int value, count, index;

    public Data(int value, int count, int index) {
        this.value = value;
        this.count = count;
        this.index = index;
    }

    public int compareTo(Data obj) {
        // If two elements have the different frequencies, then
        // the one which has more frequency should come first
        if (this.count != obj.count) {
            return obj.count - this.count;
        }

        // If two elements have the same frequencies, then the
        // one which has less index should come first
        return this.index - obj.index;
    }
}

public class SortByfrequency {

    // Custom sort by element's frequency and index
    public static void customSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        Map<Integer, Data> hm = new HashMap<>();

        // for each element of the array, insert into map its frequency
        // and index of its first occurrence in the array
        for (int i = 0; i < arr.length; i++) {
            Data data = hm.get(arr[i]);

            // element is seen for the first time
            if (data == null) {
                hm.put(arr[i], new Data(arr[i], 1, i));
            }

            // element is seen before
            else {
                data.count++;
            }
        }

        // sort the values based on custom comparator
        Data[] values = hm.values().toArray(new Data[0]);
        Arrays.sort(values);

//        System.out.println(values[0].value);

        int k = 0;
        for (Data data : values) {
            for (int j = 0; j < data.count; j++) {
                arr[k++] = data.value;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 1, 1, 1, 8, 3, 6, 8, 7, 8};

        customSort(arr);
        System.out.println(Arrays.toString(arr));

//        int[] ar = {3, 3, 1, 1, 1, 8, 3, 6, 8, 7, 8};
//        Arrays.sort(ar);
//        System.out.println(Arrays.toString(ar));
    }
}



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    String names[];
    int length;

    public static void main(String[] args) throws IOException {
        QuickSort sorter = new QuickSort();
        List<String> lines = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader("10knumbers.txt"))) {
        String line = null;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
    }
        String[] words;
        words = lines.toArray(new String[0]);
    
        sorter.sort(words);

        for (String i : words) {
            System.out.print(i);
            System.out.print(" \n");
        }
    }

    void sort(String array[]) {
        if (array == null || array.length == 0) {
            return;
        }
        this.names = array;
        this.length = array.length;
        quickSort(0, length - 1);
    }

    void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        String pivot = this.names[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {
            while (this.names[i].compareToIgnoreCase(pivot) < 0) {
                i++;
            }

            while (this.names[j].compareToIgnoreCase(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                exchangeNames(i, j);
                i++;
                j--;
            }
        }
        //call quickSort recursively
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    void exchangeNames(int i, int j) {
        String temp = this.names[i];
        this.names[i] = this.names[j];
        this.names[j] = temp;
    }
}
//Quick sort taken from Geek2Geek
//Numbers and strings randomly generated using Random.org
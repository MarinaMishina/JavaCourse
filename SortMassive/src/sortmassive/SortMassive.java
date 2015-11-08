
package sortmassive;

// Сортировка массива случайных целых чисел методом "Быстрая сортировка"
public class SortMassive {

    public static void main(String[] args) {
        int n = 50;
        int l = 0;
        int h = 49;
        String unSorted = "Несортированный массив: ";
        String sorted = "Сортированный массив: ";
        int[] array = new int[n];
        System.out.print(unSorted);
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
            System.out.print(String.format("%4d", array[i]));
        }
        System.out.println();
        System.out.print(sorted);
        
        quickSort(array, l, h);

        for (int i = 0; i < array.length; i++) {
            System.out.print(String.format("%4d", array[i]));
        }
        System.out.println();
    }

    public static void quickSort(int[] array, int low, int high) {
        int i = low;
        int j = high;
        //Самый простой и "классический" метод нахождения опорного элемента
        int mid = (low + high) / 2;
        int x = array[mid];

        while (i <= j) {
            while (array[i] < x) {
                i++;
            }
            while (array[j] > x) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        //Рекурсия
        if (low < j) {
            quickSort(array, low, j);
        }
        if (i < high) {
            quickSort(array, i, high);
        }
    }
}

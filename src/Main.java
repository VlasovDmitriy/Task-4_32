import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public class Main {
    /*
Реализовать метод сортировки выбором в варианте, когда в метод передается два
массива: первый массив – массив с объектами, которые необходимо отсортировать, а
второй массив – массив целых чисел, согласно которым необходимо отсортировать
первый массив. Сигнатура метода должна быть:
public static <T> void sort(T[] data, int[] orderValues)
Сортировка должна работать следующим образом:
{ "green", "blue", "red" }, { 5, 8, 1 } –> { "red", "green", "blue" }, { 1, 5, 8 }
Очевидно, что все сравнения надо выполнять над числами из второго массива, а любые
обмены делать одновременно в двух массивах.

     */
    public static void main(String[] args) {
        int[] numbers = {1, 10, 9, 4, 5};
        String[] colours = {"red", "blue", "green", "yellow", "grey"};


        sort(numbers, colours);
    }
    public static <T> void sort(int[] data, String[] colours){
        int size = Math.min(data.length, colours.length);
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (data[j] < data[minIndex]) {  // data[j] < data[minIndex]
                    minIndex = j;
                }
            }

            int tmp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = tmp;
            String smp = colours[i];
            colours[i] = colours[minIndex];
            colours[minIndex] = smp;

        }
        for (int i = 0; i < size; i++) {
            System.out.println(data[i] + " " + colours[i]);
        }
    }

}

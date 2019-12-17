import java.util.Arrays;
import java.util.Scanner;
public class vstavkami {
	void vstavkami1 () {
		int [] array = new int [10];
		Scanner in = new Scanner (System.in);
		System.out.println("Введите 10 элементов массива: ");
		for (int i = 0; i < 10; i = i + 1) {
			int n = in.nextInt();
			array [i] = n;
		}
		in.close();
	System.out.println("Исходный массив: " + Arrays.toString(array));
	for (int left = 0; left < array.length; left++) {
		// Вытаскиваем значение элемента
		int value = array[left];
		// Перемещаемся по элементам, которые перед вытащенным элементом
		int i = left - 1;
		for (; i >= 0; i--) {
			// Если вытащили значение меньшее — передвигаем больший элемент дальше
			if (value < array[i]) {
				array[i + 1] = array[i];
			} else {
				// Если вытащенный элемент больше — останавливаемся
				break;
			}
		}
		// В освободившееся место вставляем вытащенное значение
		array[i + 1] = value;
	}
	System.out.println(Arrays.toString(array));
	}
}
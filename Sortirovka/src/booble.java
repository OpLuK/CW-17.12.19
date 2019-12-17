import java.util.Arrays;
import java.util.Scanner;
public class booble {
	void booble1 () { //public static void main (String [] args){
		int j;
		int i;
		int [] Array = new int [10];
		Scanner in = new Scanner (System.in);
		System.out.println("Введите 10 элементов массива: ");
		for (i = 0; i < 10; i = i + 1) {
			int n = in.nextInt();
			Array [i] = n;
		}
		in.close();
		System.out.println("Исходный массив: " + Arrays.toString(Array));
			for (i = 0; i < Array.length; i++){
				int min_index = i;
				for (j = i + 1; j < Array.length; j++){
					if (Array[j] < Array[i]) {
						min_index = j;
					if (i != min_index){
						int buff = Array[i];
						Array[i] = Array[min_index];
						Array[min_index] = buff;
					}
				System.out.println(Arrays.toString(Array));
				}
			}
				
		}
	}
}

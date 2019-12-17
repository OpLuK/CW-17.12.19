import java.util.Scanner;
import java.util.Arrays;
public class obmen {
	void obmen1 () {
		int  i;
		int buf;
		int [] Array = new int [10];
		Scanner in = new Scanner (System.in);
		System.out.println("Введите 10 элементов массива: ");
		for (i = 0; i < 10; i = i + 1) {
			int n = in.nextInt();
			Array [i] = n;
		}
		in.close();
		System.out.println("Исходный массив: " + Arrays.toString(Array));
		for(i = 0; i < Array.length; i++){
	        for(int j = 0; j < Array.length-1; j++){
	        	if (Array[j] > Array[j+1]) {
					buf = Array[j+1];
					Array[j+1] = Array[j];
					Array[j] = buf;
					System.out.println(Arrays.toString(Array));
					}
	
				}
			}
	}
}


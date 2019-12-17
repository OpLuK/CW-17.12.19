import java.util.Scanner;
public class class1 {
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Выберите способ сортировки: \n" + "1)Пузырьковая\n" + "2)Обменная\n" + "3)Вставками");
		int i = in.nextInt();
		if (i == 1){
			booble arr = new booble();
			arr.booble1();
		}
		if (i == 2){
			obmen arr = new obmen();
			arr.obmen1();
		}
		if (i == 3){
			vstavkami arr = new vstavkami();
			arr.vstavkami1();
		}
		in.close();
	}
}

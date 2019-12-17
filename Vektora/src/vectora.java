import java.util.Scanner;
public class vectora {
	void vichislenia (){
		Scanner in = new Scanner(System.in);
		System.out.println("Введите координату X первого вектора: ");
		double x1 = in.nextDouble();
		System.out.println("Введите координату Y первого вектора: ");
		double y1 = in.nextDouble();
		System.out.println("Введите координату Z первого вектора: ");
		double z1 = in.nextDouble();
		System.out.println("Введите координату X второго вектора: ");
		double x2 = in.nextDouble();
		System.out.println("Введите координату Y второго вектора: ");
		double y2 = in.nextDouble();
		System.out.println("Введите координату Z второго вектора: ");
		double z2 = in.nextDouble();
		in.close();
		String r1 = "(" + x1 + ", " + y1 + ", " + z1 + ")";
		String r2 = "(" + x2 + ", " + y2 + ", " + z2 + ")";
		System.out.println("r1" + " = " + r1 + '\t' + "r2" + " = " + r2);
		double raznx = x1 - x2;
		double razny = y1 - y2;
		double raznz = z1 - z2;
		String razn = "(" + raznx + ", " + razny + ", " + raznz + ")";
		double sumx = x1 + x2;
		double sumy = y1 + y2;
		double sumz = z1 + z2;
		String sum = "(" + sumx + ", " + sumy + ", " + sumz + ")";
		double mulx = x1 * x2;
		double muly = y1 * y2;
		double mulz = z1 * z2;
		String mult = "(" + mulx + ", " + muly + ", " + mulz + ")";
		double d1 = Math.sqrt(x1 * x1 + y1 * y1 + z1* z1);
		double d2 = Math.sqrt(x2 * x2 + y2 * y2 + z2* z2);
		double cos = (mulx + muly + mulz) / (d1 * d2);
		System.out.println("Сумма r1 и r2 равна: " + sum);
		System.out.println("Разность r1 и r2 равно: " + razn);
		System.out.println("Скалярное произведение r1 и r2 равно: " + mult);
		System.out.println("Длина r1 равна: " + Math.round(d1) + '\t' + "Длина r2 равна: " + Math.round(d2));
		System.out.println("Косинус между r1 и r2 равен: " + cos);
	}
}

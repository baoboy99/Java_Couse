package dnhthanh.hueic.edu.vn;

public class GPT {

	public static void thuchien(float a, float b, float c) {
		float delta = b * b - 4 * a * c;
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phương trình vô số nghiệm !");
				} else {
					System.out.println("Phương trình vô nghiệm !");
				}
			} else {
				System.out.println("Phương trình có 1 nghiệm x = " + (-c / b));
			}
		} 
		else {
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm !");
			} else if (delta == 0) {
				System.out.println("Phương trình có nghiệm kép x1 = x2 = " + (-b / (2 * a)));
			} else {
				System.out.println("x1 = " + ((-b + Math.sqrt(delta)) / (2 * a)));
				System.out.println("x2 = " + ((-b - Math.sqrt(delta)) / (2 * a)));
			}
		}
	}
}

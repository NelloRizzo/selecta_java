
public class Program {

	public static String subject = "Corso Java";
	
	public static void saluta() {
		String name = "Nello";
		System.out.printf("Benvenuto in %s, %s!%n", subject, name);
	}
	
	public static void advSaluta(String subject, String name) {
		System.out.printf("Benvenuto in %s, %s!%n", subject, name);
	}
	
	public static double twice(double n) {
		double res = n + n;
		return res;
	}

	public static void main(String[] args) {
		saluta();
		subject = "Corso Programmazione Java";
		saluta();
		advSaluta("Programmazione Java", "Nello");
		advSaluta("questo corso", "gente");
		double r = twice(4);
		double d = twice(4) + 2 + twice(100);
		System.out.println(d);
	}
}

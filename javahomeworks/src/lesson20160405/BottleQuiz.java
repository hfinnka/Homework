package lesson20160405;

public class BottleQuiz {

	public static void main(String[] args) {
		
		int bottle = Integer.parseInt(args[0]);
		
		
		if (bottle == 1) {
			System.out.println("Вот так норм");
		}	else if (bottle == 5) {
			System.out.println("Маловато будет!");
		}	else if (bottle == 2) {
			System.out.println("Нее, дофига");
		}	else if (bottle == (0 | 255)) {
			System.out.println("Не понимаю, о чём тут речь");
		}
		

	}

}

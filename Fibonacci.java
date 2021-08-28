package lviv.lgs.ua;

public class Fibonacci {

	public static synchronized void getFibonacci(int number, boolean order) {
		int number1 = 1;
		int number2 = 2;
		int number3;

		if (number < 1) {
			System.out.println("The entered number is negative or zero equal");
		} else if (number == 1) {
			System.out.println(number1);
		} else if (order == true) {
			System.out.print("Fibonacci numbers by ascending order : " + number1 + " " + number2 + " ");

			for (int i = 3; i <= number - 1; i++) {
				number3 = number1 + number2;

				System.out.print(number3 + " ");

				number1 = number2;
				number2 = number3;
			}

			System.out.println();

		} else {
			Integer[] fibonacci = new Integer[number];
			fibonacci[1] = number1;
			fibonacci[2] = number2;

			System.out.print("Descending series of Fibonacci numbers: ");
			for (int i = 3; i < fibonacci.length; i++) {
				number3 = number1 + number2;
				fibonacci[i] = number3;

				number1 = number2;
				number2 = number3;
			}

			for (int i = fibonacci.length - 1; i >= 3; i--) {
				System.out.print(fibonacci[i] + " ");
			}

			System.out.print(fibonacci[2] + " " + fibonacci[1]);
			System.out.println();
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

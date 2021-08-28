package lviv.lgs.ua;

public class MyThread extends Thread {

	
	int number;

	public MyThread(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		int number = Application.getNumberFibonacci();
		
		int number1 = 1; 
		int number2 = 2;
		int number3;
		
		if (number < 1) {
			System.out.println("The entered number is negative or equal to zero");
		} else if (number == 1) {
			System.out.println(number1);
		} else {
			System.out.println("Fibonacci numbers by ascending order: " + number1 + " " + number2 + " ");
			
			for (int i = 3; i <= number -1; i++) {
				number3 = number1+number2;
				
				System.out.println(number3 + " ");
				
				number1 = number2; 
				number2 = number3;
			}
			
			System.out.println();
			
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}

package lviv.lgs.ua;

public class RunnableThread implements Runnable{
	
	int number;
	private Thread thread;
	
	

	public RunnableThread(int number) {
		
		this.number = number;
		this.thread =  new Thread(this);
		thread.start();
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
			
			Integer [] fibonacci = new Integer [number];
			fibonacci [1] = number1;
			fibonacci [2] = number2;
			
			System.out.println("Descending series of Fibonacci numbers: ");
			
			for (int i = 3; i < fibonacci.length; i++) {
				number3 = number1 + number2;
				fibonacci[i] = number3;
				
				number1=number2;
				number2=number3;
			}
			
			for (int i = fibonacci.length - 2; i>= 3; i--) {
				System.out.println(fibonacci[i] + " ");
			}
			
			System.out.println(fibonacci[2] + " " + fibonacci[1]);
			System.out.println();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}

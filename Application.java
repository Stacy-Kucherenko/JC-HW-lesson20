package lviv.lgs.ua;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {
	
	public static void main(String[] args) {

		int number = getNumberFibonacci();
		
		MyThread myThread = new MyThread(number);
		myThread.start();

		RunnableThread myRunnable = new RunnableThread(number);
		
		System.out.println();
		
		int n2 = getNumberFibonacci();
		ExecutorService executorFTP = Executors.newFixedThreadPool(50);
		ExecutorService executorSTP = Executors.newScheduledThreadPool(50);
		
		executorFTP.execute(new Runnable() {
			@Override
			public void run() {
				Fibonacci.getFibonacci(n2, true);
			}
		});
		
		executorSTP.execute(new Runnable() {
			@Override
			public void run() {
				Fibonacci.getFibonacci(n2, false);
			}
		});
		
		executorFTP.shutdown();
		executorSTP.shutdown();
	}

	public static int getNumberFibonacci() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of numbers in the Fibonacci series: :");
		int number = scanner.nextInt();
		return number;
	}

}

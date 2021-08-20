import java.util.Scanner;

class evenNumRunnable implements Runnable{
	int num;
	public evenNumRunnable(int pNum){
		num=pNum;
	}
	
	public void run(){
		for (int i=2; i<= num ; i+=2){
			System.out.println("Even numbers: "+ i);
			
			// Delay random entre 0.5 sg y 1 sg
			int delay = (int)(Math.random()*(1000-500+1)+500);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class oddNumRunnable implements Runnable{
	int num;
	public oddNumRunnable(int pNum){
		num=pNum;
	}
	
	public void run(){
		for (int i=1; i<= num ; i+=2){
			System.out.println("Odd numbers: "+ i);
			int delay = (int)(Math.random()*(1000-500+1)+500);  
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



public class MainRunnable {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner Input = new Scanner(System.in);
		System.out.println("Ingrese el limite superior: ");
		int pNum = Input.nextInt();
		
		Thread thread1 = new Thread(new evenNumRunnable(pNum));
		Thread thread2 = new Thread (new oddNumRunnable(pNum));
		
		thread1.start();
		thread2.start();
		

	}

}

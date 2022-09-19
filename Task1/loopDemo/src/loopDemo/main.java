package loopDemo;

public class main {

	public static void main(String[] args) {
		//for
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
		for(int i=1;i<10;i+=2) {
			System.out.println(i);
		}
		for(int i=2;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		
		
		//while
		int i=1;
		while(i<10) {
			System.out.println(i);
			i++;
			
		}
	
		System.out.println("While Döngüsü Bitti");
		
		//Do-While
		int j=1; 
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-While Döngüsü Bitti");
	
	}

}

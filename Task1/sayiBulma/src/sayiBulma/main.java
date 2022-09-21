package sayiBulma;

public class main {

	public static void main(String[] args) {
		int[] sayilar= new int[] {1,2,3,4,7,9,0};
		int aranacak =6;
		boolean varMi=false;
		
		for (int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		if(varMi) {
			System.out.println("Sayi mevcuttur");
		}else {
			System.out.println("Sayı mevcut değildir.");
		}
	}

}

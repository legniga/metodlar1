public class main {

	public static void main(String[] args) {
		sayiBulmaca();
		
}

	public static void sayiBulmaca() {

		int[] sayilar =new int [] {1,2,5,7,9,0};
		
		int aranacak=6;
		boolean varMi=false;
		
		for (int sayi:sayilar) {
			if(sayi==aranacak) {
				
				varMi=true;
				break;
			}
		}

		if(varMi) {
			System.out.println("Sayı mevccuttur:"+aranacak);
		}
		else {
			System.out.println("Sayı mevcut değildir:"+aranacak);
		}
	}

	
	}

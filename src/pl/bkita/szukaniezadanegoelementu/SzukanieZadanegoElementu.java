package pl.bkita.szukaniezadanegoelementu;


public class SzukanieZadanegoElementu {
	
	public static void main(String[] args) {
		
		int index = -1;
		
		int[] tab = new int[10];
		tab[0] = 90;
		tab[1] = 2;
		tab[2] = 3;
		tab[3] = 93;
		tab[4] = 5;
		tab[5] = 6;
		tab[6] = 7;
		tab[7] = 8;
		tab[8] = 91;
		tab[9] = 91;
		
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == 91) {
				index = i;
				break; //return
			}
		}
		
		System.out.println(((index > -1) ? "Szukany element jest na pozycji " + index :  "Nie ma takiego elementu"));
	}

}

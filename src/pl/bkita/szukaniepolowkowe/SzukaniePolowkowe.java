package pl.bkita.szukaniepolowkowe;

public class SzukaniePolowkowe {
	
	public static void main(String[] args) {
		
		int[] tab = new int[20];
		tab[0] = 1;
		tab[1] = 2;
		tab[2] = 3;
		tab[3] = 4;
		tab[4] = 5;
		tab[5] = 6;
		tab[6] = 7;
		tab[7] = 8;
		tab[8] = 9;
		tab[9] = 10;
		tab[10] = 11;
		tab[11] = 12;
		tab[12] = 13;
		tab[13] = 14;
		tab[14] = 15;
		tab[15] = 16;
		tab[16] = 17;
		tab[17] = 18;
		tab[18] = 19;
		tab[10] = 20;

		int szukanaLiczba = 7;
		int dlugoscTablicy = tab.length;
		int polowaTablicy = dlugoscTablicy / 2;
		
		if(szukanaLiczba  < polowaTablicy){
			dlugoscTablicy = polowaTablicy;
			polowaTablicy = polowaTablicy / 2;
			System.out.println("mniejsza");
		} else {
			System.out.println("wieksza");
		}
		
		
		//System.out.println(polowaTablicy);
		
	}

}

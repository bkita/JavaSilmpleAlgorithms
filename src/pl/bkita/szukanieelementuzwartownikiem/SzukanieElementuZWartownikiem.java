package pl.bkita.szukanieelementuzwartownikiem;

public class SzukanieElementuZWartownikiem {
	
	public static void main(String[] args) {
		
		int szukanyElement = 20;
		int dlugosTablicy = 11;
		
		int[] tab = new int[dlugosTablicy];
		tab[0] = 0;
		tab[1] = 1;
		tab[2] = 2;
		tab[3] = 3;
		tab[4] = 4;
		tab[5] = 2;
		tab[6] = 6;
		tab[7] = 7;
		tab[8] = 8;
		tab[9] = 9;
		tab[10] = 20;
		
		int index = 0;
		while (tab[index] != szukanyElement){
			index++;
		}
		
		if ((index + 1) == dlugosTablicy){
			System.out.println("Nie znaleziono elementu w tablicy");
		} else {
			System.out.println("Element znajduje sie na pozycji: " + (index + 1));
		}
		
		
		
		
	}

}

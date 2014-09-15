package pl.bkita.iloscwystapienelementuwtablicy;

public class IloscWystapienElementuWTablicy {
	
	public static void main(String[] args) {
		
		int licznik = 0;
		
		int[] tab = new int[10];
		tab[0] = 1;
		tab[1] = 2;
		tab[2] = 3;
		tab[3] = 1;
		tab[4] = 4;
		tab[5] = 5;
		tab[6] = 1;
		tab[7] = 6;
		tab[8] = 7;
		tab[9] = 4;
		
		for (int element : tab) {
			if(element == 1){
				licznik++;
			}
		}
		
		System.out.println(licznik);
		
	}

}

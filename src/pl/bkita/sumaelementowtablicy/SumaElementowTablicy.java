package pl.bkita.sumaelementowtablicy;

public class SumaElementowTablicy {

	public static void main(String[] args) {

		int wynik = 0;

		int[] tab = new int[5];
		tab[0] = 4;
		tab[1] = 10;
		tab[2] = 6;
		tab[3] = 1;
		tab[4] = 3;

		for (int i : tab) {
			wynik += i;
		}
		
		System.out.println(wynik);

	}

}

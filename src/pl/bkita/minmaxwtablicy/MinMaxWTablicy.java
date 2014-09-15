package pl.bkita.minmaxwtablicy;

public class MinMaxWTablicy {
	
	public static void main(String[] args) {
				
		int[] tab = new int[10];
		tab[0] = 11;
		tab[1] = 2;
		tab[2] = 53;
		tab[3] = 1;
		tab[4] = 4;
		tab[5] = 5;
		tab[6] = 0;
		tab[7] = -66;
		tab[8] = 7;
		tab[9] = -4;
		int minElement = tab[0];
		int maxElement = tab[0];

		for (int element : tab) {
			minElement = (element < minElement) ? element : minElement;
			maxElement = (element > maxElement) ? element : maxElement;
		}
				
		System.out.println("Min element: " + minElement);
		System.out.println("Max element: " + maxElement);
	}

}

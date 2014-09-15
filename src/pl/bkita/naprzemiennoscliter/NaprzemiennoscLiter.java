package pl.bkita.naprzemiennoscliter;

public class NaprzemiennoscLiter {

	public static void main(String[] args) {
		
		String zdanie = "To jest bardzo prosty algorytm dzialajacy na tekscie";
		StringBuilder noweZdanie = new StringBuilder();
		char[] tab = zdanie.toCharArray();
		int index = 0;
		
		for (char znak : tab) {
			if (index % 2 == 0) {
				noweZdanie.append(String.valueOf(znak).toUpperCase());
			} else {
				noweZdanie.append(String.valueOf(znak).toLowerCase());
			}
			index++;
		}
		
		System.err.println(noweZdanie);
		
	}
	
}

package pl.bkita.reversename;
public class RevertName {

	public static void main(String[] args) {

		String name = "Bartek";
		StringBuilder reverseName = new StringBuilder();

		for (int i = name.toCharArray().length - 1; i >= 0; i--) {
			reverseName.append(name.toCharArray()[i]);
		}

		System.out.println(reverseName);
	}
}

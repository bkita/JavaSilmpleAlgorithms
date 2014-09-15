package pl.bkita.reversename;
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		String name = "tomek";
		StringBuilder reverseName = new StringBuilder();
		int bartekSize = name.length();
		List<String> nameList = new ArrayList<String>();
		
		for(int i = 0; i < bartekSize; i++){
			nameList.add(name.substring(i, i+1));
		}
		
		for(int j = nameList.size()-1; j >= 0; j--){
			reverseName.append(nameList.get(j));
		}
		
		System.out.println(reverseName);
	}
}

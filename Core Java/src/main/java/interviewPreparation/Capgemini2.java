package interviewPreparation;

import java.util.LinkedHashMap;
import java.util.Map;

public class Capgemini2 {

	public static void main(String[] args) {
		
	//character occurance of string"Automation"
		String str="Automation";
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		for (Character ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		System.out.println(map);
		
	}
	

}

package kr.ac.mjc.java.generic;

public class MultipleTypeParameters {
	
	public static void main(String[] args) {
		Pair<String, Integer> p1 = new Pair<>("Even", 8);
		Pair<String, String> p2 = new Pair<>("hello", "world");

		System.out.format("key=%s, value=%s\n", p1.getKey(), p1.getValue());
		System.out.format("key=%s, value=%s\n", p2.getKey(), p2.getValue());
		
		System.out.println(p1);
		System.out.println(p2);
	}

}

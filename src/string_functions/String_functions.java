package string_functions;

public class String_functions {
	public static void main(String[] args) {
		String s = "Praise the Lord";
		int length = s.length();
		System.out.println("The length is :"+length);
		boolean eq= s.equals("paraise the lord");
		System.out.println("Equal check:"+eq);
		boolean eiq= s.equalsIgnoreCase("Praise the LORD");
		System.out.println("Without case check"+eiq);
		boolean st = s.startsWith("prais");
				System.out.println("Starting check:"+st);
		boolean en = s.endsWith("Lord");
		System.out.println("Ending string:"+en);
		int u= s.indexOf("e");
		System.out.println("e in position :"+u);
		int v = s.lastIndexOf("e");
		System.out.println("E position [last e]:" +v);
		String up= s.toUpperCase();
		System.out.println(up);
		String lc= s.toLowerCase();
		System.out.println(lc);
		char c = s.charAt(5);
		System.out.println("5th position char is  "+c);
		String sub = s.substring(2,10);
		System.out.println("Substring is:"+sub);
		boolean con = s.contains("raise");
		System.out.println("Contains:"+con);
		String rep = s.replace("e", "###");
		System.out.println("After replace of # is:"+rep);
		String [] sp = s.split("");
		for (String i : sp)
		{
			System.out.println(i);
		}
		
	}

}

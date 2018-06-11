package dev.utils;

public class StringUtilsTest {
	
	
	public static void main( String[] args ){
		
		CharSequence premierMot = null;
		CharSequence deuxièmeMot = null;
		
		int res = 0;
		
		//premier test
		System.out.println("Premier Test : premierMot = null et deuxièmeMot = null \n");
		
		res = StringUtils.levenshteinDistance(premierMot, deuxièmeMot);
		
		System.out.println("Resultat du premier test : res = "+res + "\n");
		
		
		
		
		
		
	}
	
	
}

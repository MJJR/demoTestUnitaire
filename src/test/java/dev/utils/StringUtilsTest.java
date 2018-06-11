package dev.utils;

import org.junit.Test;
import org.junit.Assert;

public class StringUtilsTest {

	/*
	 * public static void main( String[] args ){ CharSequence premierMot = null;
	 * CharSequence deuxièmeMot = null;
	 * 
	 * int res = 0;
	 * 
	 * //premier test System.out.
	 * println("Premier Test : premierMot = null et deuxièmeMot = null \n");
	 * 
	 * res = StringUtils.levenshteinDistance(premierMot, deuxièmeMot);
	 * 
	 * System.out.println("Resultat du premier test : res = "+res + "\n"); }
	 */

	@Test
	public void testLevenshteinDistance() throws StringUtilsException {

		// Premier Test
		CharSequence lhs = "Chien";
		CharSequence rhs = "Chine";

		int res = StringUtils.levenshteinDistance(lhs, rhs);

		try {
			Assert.assertEquals("Le Premier test a échoué", 2, res);

			// Deuxième Test
			lhs = "";
			rhs = "";
			res = StringUtils.levenshteinDistance(lhs, rhs);
			Assert.assertEquals("Le Deuxième test a échoué", 0, res);
			
			
		} catch (StringUtilsException e) {
			Assert.fail("Le test n'aurait pas du lever une exeption");
		}

	}
	
	@Test(expected = StringUtilsException.class)
	// Troisième Test
	public void testLevenshteinDistanceCasNonNominal1() throws StringUtilsException{
		StringUtils.levenshteinDistance(null, null);
	}

}

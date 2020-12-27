package com.hemebiotech.analytics;

import java.io.PrintWriter;
import java.util.TreeMap;
/**
 * Create new .out file and write results on it
 * @author Diane L'huillier
 * @version 2.0
 */
public class SymptomsPrinter implements ISymptomPrinter{
	/**
	 * @param occurences : Every symptoms' occurrence	  
	 */
	@Override
	public void output(TreeMap<String, Integer> occurrences) {
		try(PrintWriter writer = new PrintWriter ("results.out", "UTF-8")){
			for (String symptom : occurrences.keySet()) {
				System.out.println(symptom + " : " + occurrences.get(symptom));	// We print out on terminal
				writer.write(symptom + " : " + occurrences.get(symptom) + "\n");	// We write on a file
			}
			System.out.println("Results written in \"results.out\"");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

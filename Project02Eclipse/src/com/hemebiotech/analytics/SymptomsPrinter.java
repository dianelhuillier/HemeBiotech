package com.hemebiotech.analytics;

import java.io.PrintWriter;
import java.util.TreeMap;


public class SymptomsPrinter implements ISymptomsPrinter{



	@Override
	public void output(TreeMap<String, Integer> occurences) {
		try(PrintWriter writer = new PrintWriter ("results.out", "UTF-8")){
			for (String symptom : occurences.keySet()) {
				System.out.println(symptom + " : " + occurences.get(symptom));	// We print out on terminal
				writer.write(symptom + " : " + occurences.get(symptom) + "\n");	// We write on a file
			}
			System.out.println("Results written in \"results.out\"");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * Count the occurrences of a symptom from a file
 * @author Diane L'huillier
 * @version 2.0
 */
public class SymptomsCounter implements ISymptomCounter {

	/**
	 * Class counter, check if a line is already listed, if not then create it, 
	 * if yes then increment the occurrence
	 * 					
	 * @param inputFromFile : list of symptoms from SymptomReader
	 * 				
	 * @return organized list of symptoms (TreeMap) with the account of occurrences 
	 */

	@Override
	public TreeMap<String, Integer> occurrences(List<String> inputFromFile) {
		TreeMap<String, Integer> results = new TreeMap<String, Integer>();

		try {  
			for (int i=0; i<inputFromFile.size(); i++) {		
				if (results.containsKey(inputFromFile.get(i))) {  //Checking if the String is existing
					int count = results.get(inputFromFile.get(i));
					count++;
					results.put(inputFromFile.get(i), count);
				} else {									//If not existing, creating it with count = 1
					results.put(inputFromFile.get(i), 1);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return results;
	}

}
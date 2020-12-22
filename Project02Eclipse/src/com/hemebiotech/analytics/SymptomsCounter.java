package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * <h2>Count the occurrences of a symptom from a file</h2> 
 * @author Diane L'huillier
 * @version 2.0
 */
public class SymptomsCounter implements ISymptomsCounter {

	/**
	 * Class counter, check if a line is already listed, if not then create it, 
	 * if yes then increment the occurrence
	 * 
	 * @param occurences  
	 * 					this variable contains the dictionary of symptoms that was previously entered
	 * @param inputFromFile
	 * 						list from SymptomReader
	 * @param count
	 * 				number of occurrence counted
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
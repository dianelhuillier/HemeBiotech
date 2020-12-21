package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SymptomsCounter implements ISymptomsCounter {

	
	
	
	
	
	
	@Override
	public TreeMap<String, Integer> occurences(List<String> inputFromFile) {
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
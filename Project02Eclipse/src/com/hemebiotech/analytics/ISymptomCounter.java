package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * @author Diane L'huillier
 * @version 2.0
 * @since 20/12/2020
 */
public interface ISymptomCounter {

	/**
	 * @param inputFromFile list of symptoms from SymptomReader
	 * @return the count of occurrences for each symptom
	 */
	TreeMap<String, Integer> occurrences (List<String> inputFromFile);

}

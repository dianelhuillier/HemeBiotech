package com.hemebiotech.analytics;

import java.util.TreeMap;

/**
 * @author Diane L'huillier
 * @version 2.0
 * @since 20/12/2020
 */
public interface ISymptomsPrinter {
	/**
	 * @param occurences 
	 * 					number of duplicates for each symptom
	 */
	void output (TreeMap<String, Integer> occurences);
}

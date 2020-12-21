package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public interface ISymptomsCounter {
	//ce que la fonction va DONNER à l'appelant : un objet de type TreeMap
	TreeMap<String, Integer> occurences (List<String> inputFromFile);
	
}

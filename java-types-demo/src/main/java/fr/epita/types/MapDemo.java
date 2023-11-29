package fr.epita.types;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, Integer> countMap = new LinkedHashMap<>();

        countMap.put("France", 456);
        countMap.put("USA", 899);
        countMap.put("Germany", 677);

        Integer franceCount = countMap.get("France");

        for (Map.Entry<String,Integer> entry : countMap.entrySet()){
            entry.getValue();
            entry.getKey();
        }
    }
}

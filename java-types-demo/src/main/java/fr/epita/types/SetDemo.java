package fr.epita.types;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("A");
        stringSet.add("B");
        stringSet.add("C");
        stringSet.add("A");

        System.out.println(stringSet.size());
        System.out.println(stringSet);

        for (String val : stringSet){
            System.out.println(val);
        }

    }

}

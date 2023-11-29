package fr.epita.types;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Test");
        list.add("of");
        list.add("Content");

        System.out.println(list.size());
        System.out.println(list);

        for (String s : list) {
            System.out.println(s);
        }

        for (int i = 0; i < list.size() ; i ++) {
            System.out.println(list.get(i));
        }

        list.stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}

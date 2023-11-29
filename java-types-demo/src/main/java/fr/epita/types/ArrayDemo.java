package fr.epita.types;

public class ArrayDemo {

    public static void main(String[] args) {
        String[] array = {"test","array"};
        array[0] = "test";

       for (String s : array){
           System.out.println(s);
       }

       for(int i = 0; i < array.length ; i++){
           System.out.println(array[i]);
       }
    }
}

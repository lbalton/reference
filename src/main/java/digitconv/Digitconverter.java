package digitconv;/*Adott egy számokból álló lista, cseréld ki a páros számokat '*'ra.*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Minden páros számot csillagként adjon vissza */

public class Digitconverter {

    public List<String> Converter (List<Integer> numbers){

        List<String> numbersString = new ArrayList<>();

        for (int num : numbers){

            if (num%2 != 0){
                String conv= ""+num;
                numbersString.add(conv);
                continue;
            }
            numbersString.add("*");

    }
        return  numbersString;
    }

    public static void main(String[] args) {

        List<Integer>test = Arrays.asList(0,1,2,3,4,5,6,7,8,9,123213,23232,3423,23,23,23,2,3,23,2,542345,6,67,8567,7,6,4,5,23,53,67,657,6,51,23,3);
        System.out.println(test);

        Digitconverter digitconverter = new Digitconverter();
        System.out.println(digitconverter.Converter(test));


    }

}


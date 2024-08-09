package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class iterateList {

    //Iterate over a list and Print each Element
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Amaa","Nimaa","Yashi","Sama");

        List<String> UpperString = new ArrayList<>();

        stringList.forEach(System.out::println);

    }

}

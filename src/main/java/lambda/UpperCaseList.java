package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperCaseList {

    //Transform a list of strings to uppercase

    public static void main(String[] args) {


        List<String> stringList = Arrays.asList("Amaa","Nimaa","yashi");

        List<String> UpperString = new ArrayList<>();

   //   UpperString = stringList.stream()
   //                  .map(s -> s.toUpperCase()).toList();

        UpperString = stringList.stream()
                      .map(String :: toUpperCase).toList();

        System.out.println(UpperString);


        }

}

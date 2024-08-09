package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseOrder {
        public static void main(String[] args){

       /*
       int[] numbers = {1, 2, 3, 4, 5};

        for(int num : numbers)
        {
            System.out.println(num);
        }
        */

            //List<String> stringsList = new ArrayList<>();
            //stringsList.add("Amaa");
            //stringsList.add("Nimaa");
            //stringsList.add("yashi");

            //list of strings and sort in revers order

            List<String> stringList = Arrays.asList("Amaa","Nimaa","yashi");

            Collections.reverse(stringList);
            System.out.println(stringList);

            //System.out.println(reverseList);

        }


    }


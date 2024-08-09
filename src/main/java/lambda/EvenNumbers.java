package lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

    //Filter a list of integers (Even numbers in the list)

    public static void main(String[] args){

        List<Integer> evenNumber = Arrays.asList(4,5,6,2,5,7,8,9,1);

        List<Integer> even = evenNumber.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());

        System.out.println();


   //     integerList.forEach(Integer -> {
   //         if (integer%2==0) even.add(integer);
   //     });

   //     System.out.println(even);



        even = evenNumber.stream()
                .filter(integer -> integer % 2 == 0).toList();

        System.out.println(even);




    }
}

package lambda;

import java.util.Random;
import java.util.function.Function;

public class RandomNumbers {

    public static void main(String[] args) {

        Function<Integer[], Integer> randomNumberGen = integers -> {          // 2nd method
            int min = integers[0];                                              // 2nd method
            int max = integers[1];                                             // 2nd method
            return new Random().nextInt(((max - min)  + 1)) + min;              // 2nd method
        };


        System.out.println(randomNumberGen.apply(new Integer[]{3,10}));          // 2nd method

    //    System.out.println(new RandomNumbers().genRandom(10,30)); // 1st method

    }

   // public int genRandom(int min, int max){                        //1st method
   //     return new Random().nextInt(((max - min)  + 1)) + min;     //1st method

}


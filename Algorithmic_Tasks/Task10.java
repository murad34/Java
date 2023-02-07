
package Algorithmic_Tasks;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {

        int[] array =
                { 1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456 } ;

        int sum=0;

        for (int i=0; i< array.length; i++) {

            int index = array[i];
            sum+=index;

        }

        System.out.println(sum);

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

    }

}

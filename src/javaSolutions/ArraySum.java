package javaSolutions;

import java.lang.reflect.Array;
import java.util.HashMap;

public class ArraySum {
    public static void main(String[] args) {


        int[] nums = {1,2,3,4};

        int[] n = foundSum(nums,7);

        System.out.println("indexs"+n[0]+" - "+ n[1]);



    }

    public static int[] foundSum(int[] numbers , int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            int complement = target - numbers[i];

            if (map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }

         map.put(numbers[i],i);

        }
        return new int[]{-1,-1};
    }

}

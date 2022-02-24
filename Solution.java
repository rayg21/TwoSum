import java.util.HashMap;
public class Solution {
    
    public static void main(String args[]) {

        int[] array={2,1,11,8};
        int[] return1=twoSum(array,9);
    
        for (int i = 0; i < return1.length; i++){
            System.out.print(return1[i] + " ");
    }

        
    }
    
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){
            Integer requiredNum = (target - numbers[i]);
            if(indexMap.containsKey(requiredNum)){
                int toReturn[] = {indexMap.get(requiredNum), i};
                return toReturn;
            }

            indexMap.put(numbers[i], i);
        }
        return null;
    }
}

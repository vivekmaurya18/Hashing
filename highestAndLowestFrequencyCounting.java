import java.util.*;
public class highestAndLowestFrequencyCounting {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 4, 2, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1); // that for count frequency elements
        }

        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;
        int maxElement = 0;
        int minElement = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) { //used to visit every key-value pair in a HashMap, one by one.

            int element = entry.getKey(); 
            int freq = entry.getValue();

            // Step 2: Find highest and lowest frequency

            if (freq > maxFreq) {
                maxFreq = freq;
                maxElement = element;
            }

            if (freq < minFreq) {
                minFreq = freq;
                minElement = element;
            }
        }

        System.out.println("Highest: " + maxElement +
                           ", Frequency: " + maxFreq);

        System.out.println("Lowest: " + minElement +
                           ", Frequency: " + minFreq);
    }
}
    

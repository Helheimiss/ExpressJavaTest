import java.util.HashMap;
import java.util.Map;

public class DigitCounter {

    public int countDigits(int[] arr) {
        while (arr.length > 1) {
            Map<Integer, Integer> countMap = new HashMap<>();
            for (int num : arr) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
            int[] newArr = new int[countMap.size()];
            int index = 0;
            for (int count : countMap.values()) {
                newArr[index++] = count;
            }
            arr = newArr;
        }
        return arr[0];
    }
}

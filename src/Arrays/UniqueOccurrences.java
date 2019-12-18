package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueOccurrences {
    private static boolean isUnique(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: arr) {
            map.put(i, map.getOrDefault(i, 0) +1);
        }

        Set<Integer> set = new HashSet<>(map.values());
        return map.size() == set.size();
    }

    public static void main(String[] args) {
        int[] arr ={-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(isUnique(arr));
    }
}

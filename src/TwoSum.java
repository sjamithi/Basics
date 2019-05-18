import java.util.*;

class TwoSum {
    List<Integer> list;
    Map<Integer, Integer> map;

    /** Initialize your data structure here. */
    public TwoSum() {
        list = new ArrayList<>();
        map = new HashMap<>();

    }

    /** Add the number to an internal data structure.. */
    public void add(int number) {
        list.add(number);
        map.put(number, 1);
    }

    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        for (int i: list) {
            if (map.containsKey(value - i)) {
                return true;
            } else {
                map.put(i, map.get(i)+1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        twoSum.add(3);
        twoSum.add(2);
        twoSum.add(1);
        System.out.println(twoSum.find(6));
    }
}
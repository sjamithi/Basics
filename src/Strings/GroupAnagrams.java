package Strings;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String ,List<String>> map = new HashMap<>();
        for (String s: strs) {
           char[] arr = s.toCharArray();
           Arrays.sort(arr);
           String temp = String.valueOf(arr);
           map.computeIfAbsent(temp, t -> new ArrayList<>()).add(s);
        }

        result.addAll(map.values());

        return result;
    }

    public static void main(String[] args) {
       String[] Input= new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(Input));
//        Output:
//[
//  ["ate","eat","tea"],
//  ["nat","tan"],
//  ["bat"]
//]
    }

}

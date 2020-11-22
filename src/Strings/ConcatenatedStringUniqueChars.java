package Strings;

import java.util.HashSet;
import java.util.Set;

public class ConcatenatedStringUniqueChars {
    //Return max length of the string formed by concatenating strings so there are unique chars

    private static int maxLength(String[] arr) {
        int j;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< arr.length-1; i++) {
            j = i+1;

            if (shouldConsider(arr[i], arr[j])) {
                if (sb.length() < arr[i].length() + arr[j].length()) {
                    sb = new StringBuilder();
                }
               sb = sb.append(arr[i]).append(arr[j]);
            }
        }

        return sb.length();
    }

    private static boolean shouldConsider(String a, String b) {
        Set<Character> hash = new HashSet<>();

        for (char c: a.toCharArray()) {
            hash.add(c);
        }

        for (char c: b.toCharArray()) {
            if (hash.contains(c)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String[] strArr = {"co","dil","ity"};
        System.out.println(maxLength(strArr));
    }
}


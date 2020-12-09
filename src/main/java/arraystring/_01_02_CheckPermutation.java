package arraystring;

import java.util.HashMap;

/**
 * Given two strings,write a method to decide if one is a permutation of the other.
 */
class _01_02_CheckPermutation {
    boolean check(String a, String b) {

        // Create two hashmaps where we scan each string and store each char as key, and each instance
        // of each char and count it / store as value in hashmap
        if (a.length() != b.length()) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

        for (int i = 0; i < a.length(); i++) {
            if (map1.containsKey(a.charAt(i))) {
                map1.put(a.charAt(i), map1.get(a.charAt(i)) + 1);
            }
            else {
                map1.put(a.charAt(i), 1);
            }
        }
        for (int j = 0; j < b.length(); j++) {
            if (map2.containsKey(b.charAt(j))) {
                map2.put(b.charAt(j), map2.get(b.charAt(j)) + 1);
            }
            else {
                map2.put(b.charAt(j), 1);
            }
        }
        System.out.println(map1);
        System.out.println(map2);

        if (!map1.equals(map2)) {
            return false;
        }

        return true;
    }
}

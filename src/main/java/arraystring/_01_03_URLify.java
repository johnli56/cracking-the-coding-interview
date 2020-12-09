package arraystring;

/**
 * Write a method to replace all spaces in a string with '%20'
 * You may assume that the string has sufficient space at the end to hold the additional characters,
 * and that you are given the "true" length of the string.
 * (Note: If implementing in Java,please use a character array so that you can perform this operation in place.)
 * <p>
 * EXAMPLE
 * Input:  "Mr John Smith    ", 13
 * Output: "Mr%20John%20Smith"
 */
class _01_03_URLify {
    char[] urlify(char[] chars, int trueLength) {

        int index = 0;
        while (index < trueLength - 1) {

            if (chars[index] == ' ') {
                // move all characters two spots over when a space is detected to make room for %20
                chars = moveChars(chars, index);
                chars[index] = '%';
                chars[index + 1] = '2';
                chars[index + 2] = '0';
                index += 3;
            }
            else {
                index += 1;
            }
            //System.out.println(chars);
        }
        return chars;
    }

    char[] moveChars(char[] chars, int start) {
        // Helper function to move characters over two spaces when space is detected
        int end = chars.length - 1;
        while (end != start + 2) {
            chars[end] = chars[end - 2];
            end --;
        }
        return chars;
    }
}

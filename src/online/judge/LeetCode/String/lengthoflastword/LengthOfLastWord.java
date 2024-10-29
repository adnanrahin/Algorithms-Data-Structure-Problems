package online.judge.LeetCode.String.lengthoflastword;

public class LengthOfLastWord {

    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("Hello W                     orld    "));

    }

    public static int lengthOfLastWord(String s) {

        int lengthOfLastWord = 0;
        boolean firstCharSeen = false;
        int ptr = s.length() - 1;

        while (ptr >= 0) {
            if (isChar(s.charAt(ptr))) {
                firstCharSeen = true;
                lengthOfLastWord++;
            } else if (firstCharSeen) {
                return lengthOfLastWord;
            }
            ptr--;
        }

        return lengthOfLastWord;
    }

    public static boolean isChar(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

}

package online.judge.leetcode.string.indexoffirstoccurance;

public class IndexOfStringFirstOccurrence {

    public static void main(String[] args) {

        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetcode", "leeto"));
        System.out.println(strStr("fdfdsleetcode", "leet"));
        System.out.println(strStr("mississippi", "pi"));

        System.out.println("mississippi".length());

    }

    public static int strStr(String haystack, String needle) {

        if (needle.length() > haystack.length()) return -1;

        int firstOccurrenceIndex = -1;
        int needleHash = 0;
        int haystackHash = 0;

        for (int i = 0; i < needle.length(); i++) {
            needleHash += ((1000000007 % 1000383) * needle.charAt(i)) % 1000000007;
        }

        for (int i = 0; i < needle.length(); i++) {
            haystackHash += ((1000000007 % 1000383) * haystack.charAt(i)) % 1000000007;
        }

        if (needleHash == haystackHash) {
            if (isEqualString(needle, haystack.substring(0, needle.length()))) {
                return 0;
            }
        }

        for (int i = needle.length(); i < haystack.length(); i++) {
            haystackHash -= ((1000000007 % 1000383) * haystack.charAt(i - needle.length())) % 1000000007;
            haystackHash += ((1000000007 % 1000383) * haystack.charAt(i)) % 1000000007;

            if (needleHash == haystackHash) {
                String subString = haystack.substring(i - needle.length() + 1, i + 1);
                if (isEqualString(needle, subString)) {
                    return i - needle.length() + 1;
                }
            }
        }

        return firstOccurrenceIndex;
    }

    public static boolean isEqualString(String a, String b) {
        return a.equals(b);
    }

}

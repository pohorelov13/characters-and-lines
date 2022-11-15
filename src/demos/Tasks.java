package demos;

public class Tasks {

    int findSymbolOccurrence(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    String stringReverse(String s) {
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt((s.length() - 1) - i);
        }
        return new String(chars);
    }

    boolean isPalindrome(String s) {
        int c = 0;
        int edge;
        if (s.length() % 2 == 0) {
            edge = s.length() / 2;
        } else edge = (s.length() / 2) + 1;
        for (int i = 0; i < edge; i++) {
            if (s.toLowerCase().charAt(i) == s.toLowerCase().charAt(s.length() - 1 - i)) {
                c++;
            }
        }
        return c == edge;
    }
}
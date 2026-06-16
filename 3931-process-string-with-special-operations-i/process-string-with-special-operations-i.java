class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch >= 'a' && ch <= 'z') {
                result.append(ch);
            } 
            else if (ch == '*') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } 
            else if (ch == '#') {
                int len = result.length();
                for (int i = 0; i < len; i++) {
                    result.append(result.charAt(i));
                }
            } 
            else if (ch == '%') {
                result.reverse();
            }
        }

        return result.toString();
    }
}
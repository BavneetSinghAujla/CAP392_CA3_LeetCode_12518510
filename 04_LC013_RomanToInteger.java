class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (i + 1 < s.length() && c == 'I' && s.charAt(i + 1) == 'V') {
                result += 4;
                i++;
            }
            else if (i + 1 < s.length() && c == 'I' && s.charAt(i + 1) == 'X') {
                result += 9;
                i++;
            }
            else if (i + 1 < s.length() && c == 'X' && s.charAt(i + 1) == 'L') {
                result += 40;
                i++;
            }
            else if (i + 1 < s.length() && c == 'X' && s.charAt(i + 1) == 'C') {
                result += 90;
                i++;
            }
            else if (i + 1 < s.length() && c == 'C' && s.charAt(i + 1) == 'D') {
                result += 400;
                i++;
            }
            else if (i + 1 < s.length() && c == 'C' && s.charAt(i + 1) == 'M') {
                result += 900;
                i++;
            }
            else {
                switch (c) {
                    case 'I': result += 1; break;
                    case 'V': result += 5; break;
                    case 'X': result += 10; break;
                    case 'L': result += 50; break;
                    case 'C': result += 100; break;
                    case 'D': result += 500; break;
                    case 'M': result += 1000; break;
                }
            }
        }

        return result;
    }
}

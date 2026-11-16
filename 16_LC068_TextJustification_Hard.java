class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < words.length) {

            int j = i;
            int lineLength = 0;

            // Find how many words can fit in the current line
            while (j < words.length &&
                   lineLength + words[j].length() + (j - i) <= maxWidth) {

                lineLength += words[j].length();
                j++;
            }

            int gaps = j - i - 1;
            int spaces = maxWidth - lineLength;

            StringBuilder sb = new StringBuilder();

            // Last line or line containing only one word
            if (j == words.length || gaps == 0) {

                for (int k = i; k < j; k++) {
                    sb.append(words[k]);

                    if (k < j - 1) {
                        sb.append(" ");
                    }
                }

                while (sb.length() < maxWidth) {
                    sb.append(" ");
                }
            }

            else {

                int spacePerGap = spaces / gaps;
                int extraSpaces = spaces % gaps;

                for (int k = i; k < j - 1; k++) {

                    sb.append(words[k]);

                    int count = spacePerGap;

                    if (extraSpaces > 0) {
                        count++;
                        extraSpaces--;
                    }

                    for (int x = 0; x < count; x++) {
                        sb.append(" ");
                    }
                }

                sb.append(words[j - 1]);
            }

            result.add(sb.toString());

            i = j;
        }

        return result;
    }

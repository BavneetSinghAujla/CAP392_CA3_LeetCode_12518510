class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String r = new StringBuilder(s).reverse().toString();
        if (s.equals(r)){
            return true;
        } else {
            return false;
        }
    }
}

class Solution {
    public String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        StringBuilder letters = new StringBuilder();
        for (char c : ch) {
            if (Character.isLetter(c)) {
                letters.append(c);
            }
        }
        letters.reverse();  
        int index = 0;
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                ch[i] = letters.charAt(index++);
            }
        }
        return new String(ch);
    }
}
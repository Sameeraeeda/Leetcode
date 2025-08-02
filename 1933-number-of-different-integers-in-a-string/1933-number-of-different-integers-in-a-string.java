class Solution {
    public int numDifferentIntegers(String word) {
        HashSet<String> hs = new HashSet<>();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLetter(c) && !st.isEmpty() && Character.isDigit(st.peek())) {
                StringBuilder num = new StringBuilder();
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    num.append(st.pop());
                }
                num.reverse();
                String normalized = removeLeadingZeros(num.toString());
                hs.add(normalized);
            }
            if (Character.isDigit(c)) {
                st.push(c);
            }
        }
        if (!st.isEmpty()) {
            StringBuilder num = new StringBuilder();
            while (!st.isEmpty() && Character.isDigit(st.peek())) {
                num.append(st.pop());
            }
            num.reverse();
            String normalized = removeLeadingZeros(num.toString());
            hs.add(normalized);
        }

        return hs.size();
    }

    private String removeLeadingZeros(String s) {
        int i = 0;
        while (i < s.length() - 1 && s.charAt(i) == '0') {
            i++;
        }
        return s.substring(i);
    }
}

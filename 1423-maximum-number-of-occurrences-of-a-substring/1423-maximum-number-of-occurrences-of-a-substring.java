class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0, max = 0;
        for (int right = 0; right < s.length(); right++) {
            char in = s.charAt(right);
            window.put(in, window.getOrDefault(in, 0) + 1);
            if (right - left + 1 > minSize) {
                char out = s.charAt(left);
                window.put(out, window.get(out) - 1);
                if (window.get(out) == 0)
                    window.remove(out);
                left++;
            }
            if (right - left + 1 == minSize && window.size() <= maxLetters) {
                String sub = s.substring(left, right + 1);
                map.put(sub, map.getOrDefault(sub, 0) + 1);
                max = Math.max(max, map.get(sub));
            }
        }

        return max;
    }
}

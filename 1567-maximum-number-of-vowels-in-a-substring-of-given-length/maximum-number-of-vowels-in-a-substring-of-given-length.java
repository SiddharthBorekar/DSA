class Solution {
    public int maxVowels(String s, int k) {

        int count = 0;
        int max = 0;

        // First window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        max = count;

        // Sliding window
        int i = k;

        while (i < s.length()) {

            // Remove left character
            if (isVowel(s.charAt(i - k))) {
                count--;
            }

            // Add right character
            if (isVowel(s.charAt(i))) {
                count++;
            }

            max = Math.max(max, count);

            i++;
        }

        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u';
    }
}
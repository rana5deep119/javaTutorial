class Solution {
    public boolean checkPermutation(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int idx = ch - 'a';
            arr1[idx]++;
        }

        int k = s1.length();
        for (int i = 0; i < k; i++) {
            char ch = s2.charAt(i);
            int idx = ch - 'a';
            arr2[idx]++;
        }

        int l = 0;
        for (int r = k; r < s2.length(); r++) {
            if (isMatch(arr1, arr2)) {
                return true;
            }
            arr2[s2.charAt(r) - 'a']++;
            arr2[s2.charAt(l) - 'a']--;
            l++;
        }
        return isMatch(arr1, arr2);
    }

    public boolean isMatch(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}

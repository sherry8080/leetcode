package two_pointers;

public class PermutationString {

    // two pointers
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() >= s1.length()) {
            int[] counts = new int[26];

            // First window
            for (int i = 0; i < s1.length(); ++i) {
                counts[s1.charAt(i) - 'a']++;
                counts[s2.charAt(i) - 'a']--;
            }
            if (allZero(counts)) return true;

            // Traverse other windows
            for (int i = s1.length(); i < s2.length(); ++i) {
                counts[s2.charAt(i) - 'a']--;
                counts[s2.charAt(i - s1.length()) - 'a']++;
                if (allZero(counts)) return true;
            }
        }
        return false;
    }

    public boolean allZero(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) return false;
        }
        return true;
    }

    public static void main(String args[]) {
        PermutationString ps = new PermutationString();
        System.out.println(ps.checkInclusion("abc", "dgcab"));
    }
}

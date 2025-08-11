class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] c = s.toCharArray();
        int n = shifts.length;
        
        
        int totalShift = 0;
        for (int i = n - 1; i >= 0; i--) {
            totalShift = (totalShift + shifts[i]) % 26;
           
            int shiftedChar = ((c[i] - 'a') + totalShift) % 26;
            c[i] = (char) ('a' + shiftedChar);
        }
        
        return new String(c);
    }
}

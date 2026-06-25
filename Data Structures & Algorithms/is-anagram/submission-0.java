class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        if (strCharSum(s) != strCharSum(t)) {
            return false;
        }
        String sortedT = sortStr(t);
        String sortedS = sortStr(s);
        for (int i = 0; i < sortedT.length(); i++) {
            if (sortedT.charAt(i) != sortedS.charAt(i)) {
                return false;
            }
        }
        return true;
    }
 

    public int strCharSum(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i);
        }
        return sum;
    }

    public String sortStr(String str) {
        char[] newCharArr = str.toCharArray();
        Arrays.sort(newCharArr);
        return new String(newCharArr);
    }
}



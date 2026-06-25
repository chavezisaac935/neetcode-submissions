class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> sortedStrs = new HashMap<String, ArrayList<String>>();
        
        for (String str: strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);
            if (sortedStrs.get(sortedStr) == null) {
                ArrayList<String> anagrams = new ArrayList<String>();
                anagrams.add(str);
                sortedStrs.put(sortedStr, anagrams);
            } else {
                sortedStrs.get(sortedStr).add(str);
            }
        }

        List<List<String>> result = new ArrayList<>(sortedStrs.values());

        System.out.println(result);
        return result;
    }
}
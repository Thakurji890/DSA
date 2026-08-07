class Solution {
    public boolean isIsomorphic(String s, String t) {
        return helper(s).equals(helper(t));
    }

    private String helper(String str) {
        HashMap<Character,Integer> index = new HashMap<>();
        StringBuilder builder = new StringBuilder();

        for(int i = 0 ; i < str.length() ; i++) {
            char ch = str.charAt(i);

            if(!index.containsKey(ch)) {
                index.put(ch,i);
            }

            builder.append(index.get(ch)).append(" ");
        }
        return builder.toString();
    }
}

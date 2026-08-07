class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length())
            return false;
        int[] HashTable = new int[26];

        for(char ch : magazine.toCharArray()) {
            HashTable[ch - 'a']++;
        }
        for(char ch : ransomNote.toCharArray()) {
            if(HashTable[ch - 'a'] == 0)
                return false;
            HashTable[ch - 'a']--;
        }
        return true;
    }
}

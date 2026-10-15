class ReverseString {
    String reverse(String inputString) {
        char[] str = inputString.toCharArray();
        int left = 0;
        int right = inputString.length() - 1;
        
        while(left < right) {
            char ch = str[left];
            str[left++] = str[right];
            str[right--] = ch;
        }
        
        return new String(str);
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        int temp = x ;
        int reverse_num = 0;
    
        while(temp > 0){
            int d = temp % 10 ;
            reverse_num = reverse_num * 10 + d ;
            temp = temp / 10 ;
        }
        if (reverse_num == x){
            return true;
        } else{
            return false;
        }
    }
}

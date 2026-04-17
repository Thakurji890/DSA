class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        char[] charArr = s.toCharArray();
        int result = 0 ;
        int i , j;
        for(i = 0 , j = 1 ; j < charArr.length ; i++ , j++) {
            if(map.get(charArr[i]) >= map.get(charArr[j]))
                result += map.get(charArr[i]);
            else
                result -= map.get(charArr[i]);
        } 
        result += map.get(charArr[i]) ;
        return result;
    }
}

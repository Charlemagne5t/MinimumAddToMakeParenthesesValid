class Solution {
    public int minAddToMakeValid(String s) {
        int res = 0;
        int c = 0;
        for(char ch: s.toCharArray()){
            if(ch == '('){
                c++;
            }else {
                if(c > 0){
                    c--;
                }else res++;
            }
        }
        return c + res;
    }
}
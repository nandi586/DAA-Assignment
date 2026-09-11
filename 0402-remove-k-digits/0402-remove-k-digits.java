class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder s= new StringBuilder();
        if(k==num.length()){
            return "0";
        }

        for(char c: num.toCharArray()){
            while(k>0 && s.length()>0 && s.charAt(s.length()-1)>c ){
                s.deleteCharAt(s.length()-1);
                k--;
            }
            s.append(c);
        }
        while(k>0 && s.length()>0){
            s.deleteCharAt(s.length()-1);
            k--;
        }
        while (s.length() > 1 && s.charAt(0) == '0') {
            s.deleteCharAt(0);
        }
       return s.toString();
           
    }
}

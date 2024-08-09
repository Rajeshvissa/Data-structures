class Solution {
    public int strStr(String haystack, String needle) {

        int point=0;
        String temp="";

        if(needle.length()>haystack.length()){

            return -1;
        }

        for(int i=0;i<needle.length();i++){

            temp=temp+haystack.charAt(i);

        }

        if(temp.equals(needle)){
            return point;
        }

        point=needle.length();

        for(int i=0;i<haystack.length()-needle.length();i++){

            temp=haystack.substring(i+1,point+1);
            if(temp.equals(needle)){
                return i+1;
            }
            point++;
        }


        return -1;
        
    }
}
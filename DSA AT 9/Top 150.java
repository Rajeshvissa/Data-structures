class Solution {
    public int lengthOfLastWord(String s) {
        
        int count=0;
        int point=s.length()-1;
        String temp;
        

        for(int i=s.length()-1;i>=0;i--){

            temp=s.charAt(i)+"";
            if(temp.equals(" ")){

                point--;
                continue;
            }

            else{
                break;
            } 
            
        }

        for(int i=point;i>=0;i--){

            temp=s.charAt(i)+"";

            if(temp.equals(" ")){
                return count;
            }

            else{

                count++;
            }
        }

        return count;
    }
}
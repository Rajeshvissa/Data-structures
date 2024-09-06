import java.util.*;

public class IntToWords {


    static String lastZero(int first){

        HashMap<Integer,String>map3=new HashMap<>();

          
        map3.put(0,"Hundred");
        map3.put(1,"Ten");
        map3.put(2,"Twenty");
        map3.put(3,"Thirty");
        map3.put(4,"Fourty");
        map3.put(5,"Fifty");
        map3.put(6,"Sixty");
        map3.put(7,"Seventy");
        map3.put(8,"Eighty");
        map3.put(9,"Ninety");

        // String result="";

        return map3.get(first);

    }


    static String firstOne(int last){

        
        HashMap<Integer,String>map2=new HashMap<>();


        map2.put(0,"Ten");
        map2.put(1,"Eleven");
        map2.put(2,"Twelve");
        map2.put(3,"Thirteen");
        map2.put(4,"Fourteen");
        map2.put(5,"Fifteen");
        map2.put(6,"Sixteen");
        map2.put(7,"Seventeen");
        map2.put(8,"Eighteen");
        map2.put(9,"Nineteen");

        return map2.get(last);
    }

    public static void main(String args[]){

        Scanner in=new Scanner(System.in);

        HashMap<Integer,String>map1=new HashMap<>();

        int input=in.nextInt();

        // HashMap<Integer,String>map2=new HashMap<>();

        // HashMap<Integer,String>map3=new HashMap<>();

        map1.put(0,"Zero");
        map1.put(1,"One");
        map1.put(2,"Two");
        map1.put(3,"Three");
        map1.put(4,"Four");
        map1.put(5,"Five");
        map1.put(6,"Six");
        map1.put(7,"Seven");
        map1.put(8,"Eight");
        map1.put(9,"Nine");

        // map2.put(0,"Ten");
        // map2.put(1,"Eleven");
        // map2.put(2,"Twelve");
        // map2.put(3,"Thirteen");
        // map2.put(4,"Fourteen");
        // map2.put(5,"Fifteen");
        // map2.put(6,"Sixteen");
        // map2.put(7,"Seventeen");
        // map2.put(8,"Eighteen");
        // map2.put(9,"Nineteen");

        
        // map3.put(0,"Hundred");
        // map3.put(1,"one");
        // map3.put(2,"Twenty");
        // map3.put(3,"Thirty");
        // map3.put(4,"Fourty");
        // map3.put(5,"Fifty");
        // map3.put(6,"Sixty");
        // map3.put(7,"Seventy");
        // map3.put(8,"Eighty");
        // map3.put(9,"Ninety");

      
        int last=input%10;
        input=input/10;
        int second=input%10;
        input=input/10;
        int first = input%10;

        String result="";

        if(second==0){

            System.out.println(map1.get(last));
        }

        else{

            if(last==0){

                result=result+lastZero(second);
                
            }

            else if(second==1){

                result=result+" "+firstOne(last);

            }

            else{

                result=result+lastZero(second)+" "+map1.get(last);
            }

            
        }


        if(first>0){


            result= map1.get(first)+" hundred "+result;
        }

        System.out.println(result);





    }
    
}

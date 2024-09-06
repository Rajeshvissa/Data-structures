import java.util.Scanner;

public class Strobogrammatic {
    
    public static void main(String args[]){

        Scanner in =new Scanner(System.in);

        System.out.println("Enter your String");

        String input=in.next();

        char first;
        char last;
        int point1=0;
        int point2=input.length()-1;

        int flag=0;

       while(point1<=point2){

               first=input.charAt(point1);
               last=input.charAt(point2);

            if(first=='1' && last=='1' || first=='8' && last=='8' || first=='6' && last=='9' || first=='0' && last=='0' || first=='9' && last=='6'){

                point1++;
                point2--;
            }

            else{

                flag=1;
                break;

            }
                
        }

        if(flag==0){
            System.out.println("It is a strobogrammatic number");
        }

        else{
            System.out.println("Not a strobogrammatic number");
        }
    }
}

import java.util.Scanner;
public class Euclid {


    // Find the GCD of  two numbers using recursion

    static int findGcd(int a,int b){

        if(b==0){

            return a;
        }

        else{

            return(findGcd(b,a%b));
        }

        
    }
    public static void main(String args[]){

        Scanner in =new Scanner(System.in);
        System.out.println("Enter your number");

        int input=in.nextInt();

        int count=0;

        int gcd;

        for(int i=1;i<input;i++){

            gcd=findGcd(i,input);

            if(gcd==1){
                count++;
            }


        }


        System.out.println(count);

    }
    
}

import java.util.Scanner;
public class KillProblem {

    static int findOne(int[] nums){
        int n=nums.length;
        int rem=n;
        boolean kill;
        int ind=0;
        int j=0;
        while(rem>1){
            if(nums[ind]>=0){
                kill=true;
            }
            else{
                kill=false;
            }
            if(kill){
                j=(ind+1)%n;
                while(nums[j]<0){
                    j=(j+1)%n;
                }
                nums[j]=-1;
                rem--;
            }
            ind=(ind+1)%n;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                return nums[i];
            }
        }
        return -1;

    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your number of soldiers");
        int n=in.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=i+1;
        }
        int result=findOne(nums);
        System.out.println("The one who is alive is");
        System.out.println(result);
    }
    
}

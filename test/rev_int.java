import java.util.*;
class rev_int {
    public static void main(String args[] ) throws Exception {
       Scanner scan  = new Scanner(System.in);
       int n=scan.nextInt();
       check(n);
    }
    public static void check(int n){
        int flag=0;
        if(n<0){
            flag=1;
            n=n*(-1);
        }
        String s=n+"";
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            ans=ans+s.charAt(i);
        }
        int val=Integer.parseInt(ans);
        if(flag==1){
            System.out.println(val*(-1));
        }
         else{
             System.out.println(val);
         }
    }
}

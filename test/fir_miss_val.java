import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
    Scanner scan = new Scanner(System.in);
    int n=scan.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
    }
    System.out.println(check(arr,n));
    }
    public static int check(int arr[],int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(arr[i]);
        }
        for(int i=1;i<n;i++){
            if(!list.contains(i)){
                return i;
            }
        }
        return 0;
    }
}

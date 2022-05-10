import java.util.*;

class gas {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=scan.nextInt();
        }
        int m=scan.nextInt();
        int arr2[]= new int[m];

         for(int i=0;i<m;i++){
            arr2[i]=scan.nextInt();
        }
        int index=-1;
        int key=arr1[0];
        for(int i=0;i<m;i++){
            if(arr2[i]==key){
                index=i;
                break;
            }
        }
        System.out.println(index);

    }
}

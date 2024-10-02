import java.util.*;
class Train {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arrival=new int[n];
        int[] dep=new int[n];
        for(int i=0;i<n;i++){
            arrival[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            dep[i]=arrival[i]+sc.nextInt();
        }
        Arrays.sort(arrival);
        Arrays.sort(dep);
        int maxPlatform=0,currentplatform=0,i=0,j=0;
        while(i<n && j<n){
            if(arrival[i]<=dep[j]){
                currentplatform++;
                i++;
            }else{
                currentplatform--;
                j++;
            }
            maxPlatform=Math.max(maxPlatform,currentplatform);
        }
        System.out.println(maxPlatform);
    }
}
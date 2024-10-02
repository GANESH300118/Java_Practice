import java.util.*;
public class num {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int j=1;
    for(int i=1;i<=n;i++){
      for(int k=0;k<i;k++){
        if(j==n+1){
        break;
      }
        for(int u=0;u<i;u++){
          System.out.print(j+" ");
        }
        j++;
      }
      
    }
  }
}

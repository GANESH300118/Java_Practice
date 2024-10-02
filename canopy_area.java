import java.util.*;
public class canopy_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        float area = 3.14f * (d*d);
        if(area*10%10<=5){
            System.out.println((int)Math.floor(area));
        }
        else{
            System.out.println((int)Math.ceil(area));
        }
    }
}

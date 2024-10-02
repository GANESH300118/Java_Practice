import java.util.*;
public class Game
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int r=sc.nextInt();
	    String s=sc.next();
	    int count=0;
	    String[] parts=s.split("[wgs]");
	    for(int i=1,j=0;i<=r;i++,j+=2){
	        if(parts[j].equals("ater")&&parts[j+1].equals("un")){
	            count+=1;;
	        }
	        else if(parts[j].equals("un")&&parts[j+1].equals("nake")){
	            count+=1;
	        }
	        else if(parts[j].equals("nake")&&parts[j+1].equals("ater")){
	            count+=1;
	        }
	    }
	    System.out.println(count);
	}
}
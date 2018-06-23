
import java.util.*;

class stringposequals {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String temp=s.toUpperCase();
		int i,count=0,u=0;
		int c[]=new int[91];
		for(i=65;i<91;i++){
		    c[u]=i;
		    u++;
		    
		}
		for(i=0;i<temp.length();i++)
		{
		    if(temp.charAt(i)>='A'&&temp.charAt(i)<='Z'){
		       
		        if((int)temp.charAt(i)==c[i]){
		            
		            count++;
		        }
		    }
		}
		System.out.print(count);
	}
}

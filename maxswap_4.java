
import java.util.*;

class maxswap_4{
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	int l1=s1.length();
	int l2=s2.length();
	char c1[]=s1.toCharArray();
	char c2[]=s2.toCharArray();
	int i,j,count=0;
	for(i=0;i<l1;i++)
	{
	   
	        if(c1[i]==c2[i])
	        {
	           
	        }
	        else{
	            count++;
	        }
	    }
	if(count>0)
	System.out.println(count/2);
	else
		System.out.println("-1");
	}
}

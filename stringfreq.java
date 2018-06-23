
import java.util.*;

class stringfreq {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int j;
		int k=7;
		String expand="";
		String temp="";
		int fre=0;
		int l=s.length();
		for(int i=0;i<l;)
		{
		    temp="";
		    fre=0;
		    while(i<l&&s.charAt(i)>='a'&&s.charAt(i)<='z')
		    {
		        temp+=s.charAt(i);
		        i++;
		    }
		    while(i<l&&s.charAt(i)>='0'&&s.charAt(i)<='9')
		    {
		        fre=fre*10+s.charAt(i)-'0';
		        i++;
		    }
		    for(j=0;j<fre;j++)
		    {
		        expand+=temp;
		    }
		    if(fre==0)
		    {
		        expand+=temp;
		    }
		}
			System.out.println(expand);
		System.out.print(expand.charAt(k-1));
	}
}

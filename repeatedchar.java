
import java.util.*;
class repeatedchar {
    static final int ASCII_SIZE=256;
	public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int i;
    String s = "WELCOMETOGUVICORPORATIONS";
    int l=s.length();
    int count[]=new int[ASCII_SIZE];
    for(i=0;i<l;i++)
    {
        count[s.charAt(i)]++;
        
    }
       int max=-1;
       char result=' ';
       for(i=0;i<l;i++)
       {
           if(max<count[s.charAt(i)])
           {
               max=count[s.charAt(i)];
               result=s.charAt(i);
          
           }
       }
             System.out.print(result);
       
	}
	
}

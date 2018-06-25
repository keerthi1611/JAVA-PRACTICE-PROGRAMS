import java.util.*;
class swappalindrome_2{
    public static int palincheck(String x,int l)
    {
        //System.out.println(x);
        String n="";
        for(int i=l-1;i>=0;i--)
        {
            n+=x.charAt(i);
        }
        if(n.equals(x))
        {
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l,i,j,count=0,k=0;
        String s=sc.nextLine();
        
        l=s.length();
        char c[]=s.toCharArray();
       char d[]=new char[l];
        String x="";
        for(i=0;i<l;i++)
        {
            for(j=i+1;j<l;j++)
            {
                char temp=s.charAt(j);
                char a=s.charAt(i);
               
                c[i]=temp;
                c[j]=a;
               for(k=0;k<l;k++)
               {
                  if(k!=i&&k!=j)
                  {
                      c[k]=s.charAt(k);
                  }
                }
                  for(int m=0;m<k;m++)
                    {
                        x+=c[m];
                        
                    } 
                    int v=palincheck(x,l);
                    if(v==1)
                    {
                        
                        count++;
                        x="";
                    }
                    else{
                        x="";
                       
                       
                    }
                   
               }
            }
        if(count>0)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
       
    }
}

import java.util.*;
class panagram_3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,l,u=0;
       String s=sc.nextLine();
       l=s.length();
       char c[]=new char[l];
        
   HashSet<Character> set=new HashSet<Character>();  
       
       for(i=0;i<l;i++)
       {
           
           if(s.charAt(i)==' ')
           {
               continue;
           }
           else
           {
            c[u]=s.charAt(i);
            u++;
            
           }
       }
       String str = new String(c);
        String x=str.toLowerCase();
       
       for(i=0;i<u;i++)
       {
           if(x.charAt(i)>='a'&&x.charAt(i)<='z')
           {
               char v=x.charAt(i);
               
               set.add(v);
           }
           
       }
      
       int m=set.size();
      if(m==26)
      {

    System.out.println("Panagram");
      }
      else{
           System.out.println("Not a Panagram");
      }
 }
    
}

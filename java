import java.util.*;

class search
{

public static void main(String args[])

{

int n,i,x,count=0;
Scanner sc=new Scanner(System.in);

System.out.println("enter array size:");

n=sc.nextInt();

int ar[]=new int[n];

System.out.print("enter array elements:");

for(i=0;i<n;i++)

{

ar[i]=sc.nextInt();

}

System.out.print("enter  element  you want to find");

 x=sc.nextInt();
 for(i=0;i<n-1;i++)

{

if(ar[i]==x)
{
count=1;
break;
}            
else      
{
count=0;
}
}
if(count == 1)
{
System.out.println("element found at position:"+i);
}
else
 {
System.out.println("element not found");
 }
}
}

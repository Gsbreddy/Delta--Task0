import java.util.Scanner;
class ArrayAddition
{
int a[],b[],c[],i,j,k,p;
public ArrayAddition()
{
a=new int[10];
b=new int[10];
c=new int[10];
}
void input()
{
Scanner s1=new Scanner(System.in);
Scanner s2=new Scanner(System.in);
Scanner s3=new Scanner(System.in);
System.out.println("Enter The Length Of Arrays");
k=s3.nextInt();
System.out.println("Enter  First Array");
for(i=0;i<k;i++)
a[i]=s1.nextInt();
System.out.println("Enter  Second Array");
for(j=0;j<k;j++)
b[j]=s2.nextInt();
}
void add()
{
for(i=k-1;i>=0;i--)
{
int sum=0;
sum=sum+p+a[i]+b[i];
if(sum<10||i==0)
c[i]=sum;
else
{
c[i]=sum%10;
p=(sum-c[i])/10;
}
}
for(j=0;j<k;j++)
System.out.print(c[j]);
}
public static void main(String[] args)
{
ArrayAddition a1=new ArrayAddition();
a1.input();
a1.add();
}
}
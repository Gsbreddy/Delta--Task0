import java.util.Scanner;
class ArrayMultiplication
{
int a[],b[],c[],i,j,k,l,p=0,m=0;
public ArrayMultiplication()
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
Scanner s4=new Scanner(System.in);
System.out.println("Enter The Length Of First Array");
k=s3.nextInt();
System.out.println("Enter The Length Of Second Array");
l=s4.nextInt();
System.out.println("Enter  First Array");
for(i=0;i<k;i++)
a[i]=s1.nextInt();
System.out.println("Enter  Second Array");
for(j=0;j<k;j++)
b[j]=s2.nextInt();
}
void mul()
{
for(i=k-1;i>=0;i--)
{
int sum=0,mul=0,v=1,r=0;
for(j=l-1;l>=0;l--)
{
mul=a[j]*b[i];
sum=mul*v+p+sum;
v=v*10;
r=sum%10;
p=sum/10;  
}
c[m++]=r;
System.out.print("poiuy");
System.out.print(c[0]);
}
for(j=m-1;j>=0;j--)
System.out.print(c[j]);
}
public static void main(String[] args)
{
ArrayMultiplication a1=new ArrayMultiplication();
a1.input();
a1.mul();
}
}
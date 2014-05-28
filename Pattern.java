class Pattern
{
int i,j;
void fn()
{
	for(i=1;i<=4;i++)
	{
	for(j=1;j<=i;j++)
	{
		if(i!=j)
		System.out.print("* ");
		else
		System.out.print("*");
	}
System.out.println();
}
}
public static void main(String[] args)
{
Pattern p1=new Pattern();
p1.fn();
}
}
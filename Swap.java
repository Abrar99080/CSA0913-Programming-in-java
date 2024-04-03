class Swap
{
public static void main(String arg[])
{
int x=10,y=5;
x=x+y;
y=x-y;
x=x-y;
System.out.println("After Swapping" + " x = " + x + ", y = " + y);
}
}
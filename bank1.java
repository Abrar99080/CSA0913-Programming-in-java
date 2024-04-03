class R192124048
{
double p,n,sn,icin,axin,sbin;
void get(double p1,double r1)
{
p=p1;
r=r1;
}
void sbi(double r)
{
sbin=(p*r*n)/100;
}
void icici(double r)
{
icin=(p*r*n)/100;
}
void axis(double r)
{
axin=(p*r*n)/100;
}
void display()
{
System.out.println("SBI intrest"+sbin);
System.out.println("ICICI intrest"+icin);
System.out.println("AXIs intrest"+axin);
}
public static void main(String arg[])
{
R192124048 I=new R192124048(100000,3);
I.sbi(4.8);
I.icici(5.9);
I.axis(7.7);
I.display();
}
}
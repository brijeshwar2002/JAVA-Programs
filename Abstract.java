import java.util.Scanner;
interface Dis
{
	public void one();
	public void two();
default void info()
{
System.out.println("\n there are two functions available in this interface \n one \n two");
}
}
class B implements Dis
{
	public void one()
{
info();
System.out.println("Dis one");
}
	public void two()
{
System.out.println("Dis two");
}
}
public class Abstract
{
public static void main(String k[])
{
B a=new B();
a.one();
a.two();

}
}

abstract class Supermen
{
abstract void fly();
}
class Udja extends Supermen
{
void fly()
{
System.out.println("fly high");
}
}
class AbstractMethod
{
public static void main(String args[])
{
Udja u=new Udja();
u.fly();
}
}


abstract class A
{
A()
{
System.out.println("I am A class constructor");
}
};

class B extends A
{
	
}

class AbstractConstructor
{
public static void main(String args[])
{
A a=new B();
}
}
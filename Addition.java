import java.util.Scanner;

class Sum
{
	static int a,b;
	static void input(int a, int b)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter two values");
	a=s.nextInt();
	b=s.nextInt();
	static this.a=a;
	static this.b=b;
	}

	static void show()
	{
		System.out.println("Entered values"+a,b);
	}
}
class Addition
{
	public static void main(String[] args) 
	{
		Sum.input();
		Sum.show();
	}
}

import java.util.*;

abstract class Stack
{
	abstract void push(int x);
	abstract void pop();
	abstract void display();
}

class StaticStack extends Stack
{
	int a[] = new int[30];
	int t;

	StaticStack()
	{
		t = 0;
	}

	void push(int x)
	{	
		a[t] = x;
		t+=1;
	}
	void pop()
	{
		System.out.println("Element Pop: " + a[t-1]);
		t-=1;
	}
	void display()
	{
		for(int i=0; i<t;i++)
		{
			System.out.print(a[i] +" ");
		}
                
		System.out.println();
	}
}

class DyanamicStack extends Stack
{
	ArrayList<Integer> ar = new ArrayList<Integer>();
	void push(int x)
	{
		ar.add(x);
	}
	void pop()
	{
		System.out.println("Element Pop: " + ar.get(ar.size()-1));
		ar.remove(ar.size()-1);
	}
	void display()
	{
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
	}
}

class SecondPrac
{
	public static void main(String[] args) 
	{
		// StaticStack s = new StaticStack();
		DyanamicStack s = new DyanamicStack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.display();
		s.pop();
		s.pop();
		s.display();

	}
}
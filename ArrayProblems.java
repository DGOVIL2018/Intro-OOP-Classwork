import java.util.ArrayList;

public class ArrayProblems
{
	public static void main (String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.println(a.size());
		a.add(3);
		a.add(4);
		System.out.println(a.size());
		System.out.println(a);
		
		Integer i = new Integer(5);
		a.add(i);
		System.out.println(a);
		i = 6;
		a.add(0, -3);
		System.out.println(a);
		a.add(a.size() -1, 6);
		System.out.println(a);
		
		//a.add(9, 1) --> index of out bounds error --> size() is the largest index you can put in
		
		a.remove(0);
		
		System.out.println(a.size());
		System.out.println(a);
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(2);
		b.add(2);
		b.add(2);
		b.add(7);
		b.add(6);
		b.add(1);
		
		int n = 2;
		System.out.println("The original ArrayList was " + b);
		removeElement(b, 2);
		System.out.println("The new ArrayList is " + b);
		
	}

//remove all the elements which contain int n in them	

	public static void removeElement (ArrayList<Integer> b, int n)
	{
		for (int i = 0; i < b.size(); i++)
			if (b.get(i) == n)
			{	b.remove(i);
				i += -1;  //compensate for the previous increment
			}
	}
	

}

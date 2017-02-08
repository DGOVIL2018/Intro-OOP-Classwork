public class Student
{

	private int age;
	private int grade;
	private String name;
	
	private static int numStudents = 0;
	
	public Student()
	{
		this(10, 10, "Bob");
	
	}
	
	public Student (int a, int g)
	{
		this.age = a;
		this.grade = g;
		name = "Jack";
		numStudents++;
	
	}
	
	public Student(int a, int g, String n)
	{
		age = a;
		grade = g;
		name = n;
		numStudents++;
	
	}
	
	
	
	public int getAge()
	{
		return age;
	}
	
	public int getGrade()
	{
		return grade;
	}
	
	public String getName()
	{
		return name;
	}	
	
	public static int getNumStudents()
	{
		return numStudents;
	}
	
	
	public void setAge (int num)
	{
		age = num;
	}
	
	public void setGrade (int num)
	{
		grade = num;
	}
	
	public void setName (String n)
	{
		name = n;
	}
	
	
	
		
	public String toString()
	{
		return name + "(" + age + " years old, " + grade + "th grade)";
	}

	
	public static String findOlder(Student s1, Student s2)
	{
		if (s1.age > s2.age)
		{
			return s1.name;
		}
		
		else 
		{
			return s2.name;
		}
		
	}
	
	public Student findOlder(Student s1)
	{
		if (s1.age > this.age)
		{
			return s1;
		}
		else
		{
			return this;
		}
	
	}
	
	
	
	
}
	
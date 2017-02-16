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
	
	public Student (int a, int g) //default constructor
	{
		this.age = a;
		this.grade = g;
		name = "Jack";
		numStudents++; //increment numStudents class field
	
	}
	
	public Student(int a, int g, String n)
	{
		age = a;
		grade = g;
		name = n;
		numStudents++; //increment numStudens class field
	
	}
	
	
	//accsessors
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
	
	//modifier methods
	public void setAge (int num)
	{
		age = num;
	}
	
	public void setGrade (int num)
	{
		grade = num; //equate input parameter and class field
	}
	
	public void setName (String n)
	{
		name = n;
	}
	
	
	
		
	public String toString() //returns string representation of the class fields (which in turn describe the object)
	{
		return name + "(" + age + " years old, " + grade + "th grade)";
	}

	
	public static String findOlder(Student s1, Student s2)
	{
		if (s1.age > s2.age) //no need for keyword this
		{
			return s1.name;
		}
		
		else 
		{
			return s2.name;
		}
		
	}
	
	public Student findOlder(Student s1) //Takes in Student object and returns the one with the older age (class field comparison)
	{
		if (s1.age > this.age) //need keyword this because the method is non-static
		{
			return s1;
		}
		else
		{
			return this;
		}
	
	}
	
	
	
	
}
	

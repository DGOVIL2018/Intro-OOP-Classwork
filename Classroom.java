public class Classroom
{
	
	private Student[] section;
	private int period;
	

	public Classroom()
	{
		section = new Student[13];  //initializing
		
		for (int i = 0; i < section.length; i ++)
		{
			section[i] = new Student();
		}	
		
		
		period = 0;  //initializes period
		//this(new Sudent(), new Student(14, 9));
	}

	public Classroom(Student[] a, int p)
	{
		section = a;
		period = p;
	}
	
	
	
	//accessors
	public Student[] getSection()
	{
		return section;
	}
	
	public Student getStudent(int i)
	{
		return section[i];
	}	
	
	public int getPeriod()
	{
		return period;
	}
	

	
	
	//modifiers
	public void setStudent(int i, Student s)
	{
		section[i] = s;
	}


	public void setPeriod(int i)
	{
		period = i;
	}




	//toString method
	public String toString()
	{
		String s = "";
		s += "period: " + period + "\n";
		
		for (int i = 0; i < section.length; i ++)
		{
			s+= section[i].toString() + "\n";
		}
		return s;
		
	
	}	
	
	
	public Student findOldest()
	{
		Student oldest = section[0];
		
		for (int i = 1; i < section.length; i ++)
		{
			oldest = oldest.findOlder(section[i]);

		}
		return oldest;
	}	

}
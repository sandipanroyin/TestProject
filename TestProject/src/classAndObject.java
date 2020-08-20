
class emp
{
	int empid;
	String name;
	String grade;
	int salary;
	   emp(){
		 
		 if (grade=="A")
			 salary=90000;
		 else if (grade=="B")
			 salary=70000;
		 else
			 salary=30000;
		 
			 
			 
	 }
	
	
	
}


public class classAndObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       emp obj1=new emp();
       obj1.empid=101;
       obj1.name="sandipan";
       obj1.grade="A";
       
       System.out.println("Salary of "+obj1.name+" is :"+obj1.salary);
		
		
	}

}

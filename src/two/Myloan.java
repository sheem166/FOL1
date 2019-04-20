package two;



class Class_loan {
	public void student_loan()
	{
		System.out.println("i have a student loan");
	}
	public void student_credit_loan()
	{
		System.out.println("i have a student credit loan");
	}
	
}
	
class loan_car extends Class_loan {
	
	public void my_car_payment()
	{
		System.out.println("i have a car payment");
	}
	
}

class loan_mortgage extends loan_car {
	public void mortgage()
	{
		System.out.println("i have a mortgage");
	}
	
	}


public class Myloan {
	
	public static void main(String[] args) {
	
		Class_loan cl = new Class_loan();
		loan_mortgage lm = new loan_mortgage();
		loan_car lc = new loan_car();
	
	lc.student_loan();
	lc.student_credit_loan();
	lc.my_car_payment();
	
	System.out.println("*************");
	
	lm.student_credit_loan();
	lm.student_loan();
	lm.my_car_payment();
	lm.mortgage();
	

	
	
	
	}		

}

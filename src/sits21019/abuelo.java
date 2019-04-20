package sits21019; 

class grandpa{
	
	public void gold() {
		System.out.println("i have gold");
	}
	
	public void house() {
		System.out.println("i have a house");
	}
	
}

class father extends grandpa{
	
	public void car() {
		System.out.println("i have car");
	}
	
	
	
}
class me extends father{
	
	
	public void money() {
		System.out.println("i have money");
	}

}


public class abuelo {

	public static void main(String[] args) {
		
		father f = new father();
		me m = new me();
		
		
		f.gold();
		f.house();
		f.car();
		
		
		System.out.println("***********************");
		
		
		
		
		m.gold();
		m.house();
		m.car();
		m.money();
		
		

		
		
	}

}

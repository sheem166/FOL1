package sits21019;

class ford {
	
	public void start(){
		
		System.out.println("start the car ");
		
	}
	
	public void stop(){
		
		System.out.println("Stop the car ");
	}
	}

class bmw extends ford { 
	public void bmw_spc(){
		
		System.out.println(" Special features of of bmw ");
	}
	
}

class porsche extends bmw {
	
public void porche_spc(){
		
		System.out.println(" Special Features of porsche ");
	}
	
	

	
	
}
public class Hashem {

	public static void main(String[] args) {
		porsche p=new porsche();
		p.bmw_spc();
		p.stop();
		p.start();
		p.porche_spc();
		
	
	}
	
}

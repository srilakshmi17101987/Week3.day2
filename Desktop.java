package HWSW;

public class Desktop implements HardWare,Software{
	public void desktopModel()
	{
		System.out.println("This is my model for desktop - From class");
	}
	
	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("This is my software interface- SW");
		
	}
	
	public void price(int amt) {
		// TODO Auto-generated method stub
		System.out.println("This is my hardware method"+amt);
		
		
	}
	
	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("This is my hardware resources- interface HW");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Desktop obj=new Desktop();
     obj.desktopModel();
     obj.hardwareResources();
     obj.softwareResources();
     obj.price(3000);
     
		
		
	
		
	}

}

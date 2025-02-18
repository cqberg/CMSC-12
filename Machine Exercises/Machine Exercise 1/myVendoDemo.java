package machineexercise1; //CQB, JST

public class myVendoDemo {
	public static void main(String[] args) {
		myVendo mv = new myVendo();
		
		System.out.println("Welcome to my Vendo App");
		
		mv.setMoney(200);
		mv.printOptions();
		mv.myChoice(1);
		
		System.out.println("Thank you for using my Vendo App");
	}
}
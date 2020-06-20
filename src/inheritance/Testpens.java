package inheritance;

public class Testpens {
	
	public static void main(String[] args) { 
		Pen1 p1 =  new Pen1();
		p1.click();
		p1.ink();
		p1.unclick();
		p1.setColor("Black");
		
		Pen2 p2 =  new Pen2();
		p2.click();
		p2.ink();
		p2.unclick();
		p2.type("Ballpoint");
	
   }
}
	
	



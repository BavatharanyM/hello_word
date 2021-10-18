public class Animal_main {

	public static void main(String[] args) {
		
		Lion d = new Lion();
		Lion d2 = new Lion();
		
		
		Object o = d ;
			
		if(d==o) { //true
			System.out.println("true"); 
		}
		else
			System.out.println("false");
		
		if(d==d2) {// false
			System.out.println("true");
		}
		else
			System.out.println("false");
		
		
		
		if(d.equals(d2)) { //false
			System.out.println("true");
		}
		else
			System.out.println("false");
		
		
		
		
		d = d2 ;
		if(d==d2) {// true
			System.out.println("true");
		}
		else
			System.out.println("false");
		
		
		if(d.equals(d2)) { //true
			System.out.println("true");
		}
		else
			System.out.println("false");
		
		
		if(d2==o) {// false
			System.out.println("true");
		}
		else
			System.out.println("false");
		
		
		if(d2.equals(o)) { //false
			System.out.println("true");
		}
		else
			System.out.println("false");
		
		if(d==o) {// false
			System.out.println("true");
		}
		else
			System.out.println("false");
		
		
		if(d.equals(o)) { //false
			System.out.println("true");
		}
		else
			System.out.println("false");
		
		
		

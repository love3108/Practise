package recursion;

public class RecursionMain {

	public static void main(String[] args) {
	
		RecursionClass recur=new RecursionClass();
		/*
		 * recur.headRecur(5); recur.tailRecur(5);
		 * System.out.println(recur.tailFact(5,1));
		 * System.out.println(recur.headFact(5));
		 * System.out.println("fibHead : "+recur.fibHead(5));
		 * System.out.println("fibTail : "+recur.fibTail(5,0));
		 */
		recur.towersOfHanoi(2, 'a', 'b', 'c');
		
	}

}

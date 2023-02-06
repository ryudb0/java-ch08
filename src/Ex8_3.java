
public class Ex8_3 {
	public static void main(String[] args) {
		int number = 100, result = 0;
		
		for(int i=0; i<10; i++) {
			try {
				result = number/(int)(Math.random()*10);
				System.out.println(result);
			} catch (Exception e) {
				System.out.println("0");
			}
		}
	}
}

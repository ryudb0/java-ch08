package example;

public class Ex8_7 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b) System.exit(0);
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}
	
	public static void main(String[] args) {
		method(true);			// 1, 
		method(false);			// 1, 2, 5, 6    //틀림 System.eixt 하면 그냥 프로그램 종료
	}
}

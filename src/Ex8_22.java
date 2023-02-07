public class Ex8_22 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main() 에서 예외 처리되었습니다.");
		}
	}
	
	static void method1() throws Exception {
		try {
			throw new Exception("일부러 예외 발생");
		} catch (Exception e) {
			System.out.println("method1() 에서 예외 처리되었습니다.");
			throw e;
		}
	}
}

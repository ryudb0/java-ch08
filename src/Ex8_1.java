
public class Ex8_1 {
	public static void main(String[] args) {
		try {
			try { } catch (Exception e) { }
		} catch (Exception e) {
			try { } catch(RuntimeException es) { } catch (Exception ex) { } 
		}
		
		
		try {
			
		} catch (Exception e) {
			
		}
		
	}
}

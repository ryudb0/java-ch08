public class Ex8_21 {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			System.out.println("에러 메시지 : "+e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하시길 바랍니다.");
		} catch (MemoryException me) {
			System.out.println("에러 메시지 : "+me.getMessage());
			me.printStackTrace();
			System.gc();
			System.out.println("다시 설치를 시도하세요.");
		} finally {
			deleteTempFiles();
		}
		
	}
	
	static void startInstall() throws SpaceException, MemoryException {
//		프로그램 설치에 필요한 준비를 하는 코드
		if(!enoughSpace()) {
			throw new SpaceException("설치할 공간이 없습니다.");
		}
		if(!enoughMemory()) {
			throw new MemoryException("설치할 메모리가 부족합니다."); 
		}
		
	}
	static void copyFiles() {
//		파일들을 복사하는 코드
	}
	static void deleteTempFiles() {
//		임시파일 삭제코드
	}
	static boolean enoughSpace() {
//		설치하는데 필요한 공간이 있는지 확인하는 코드
		return false;
	}
	static boolean enoughMemory() {
//		설치하는데 필요한 메모리공간이 있는지 확인하는 코드
		return true;
	}
}

class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}

public class Ex8_17i {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFile();
			deleteTempFiles();
		} catch (Exception e) {
			e.printStackTrace();
			deleteTempFiles();
		}
	}
	
	static void startInstall() {
//		프로그램 설치에 필요한 준비코드
	}
	static void copyFile() {
//		파일들을 복사하는 코드
	}
	static void deleteTempFiles() {
//		임시파일 삭제코드
	}
}

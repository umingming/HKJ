package sec04.check;

public class MemberService {
		
//		설계>
//		1. login(String, String) 메소드 생성
//			>id:hong, password:12345 면 true로 리턴
//			>아니면 false로 리턴
//		2. logout(String id) 메소드 생성
//			>로그아웃 되었습니다. 출력
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}


}

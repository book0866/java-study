package map;

import java.util.HashMap;
import java.util.Set;

public class Ex2 {

	public static void main(String[] args) {

		// 회원 목록을 저장하는 map 생성
		HashMap<Integer, Member> map = new HashMap<>();
		
		// 회원 추가
		Member member1 = new Member(1001, "러버덕");
		Member member2 = new Member(1002, "스탠리");
		Member member3 = new Member(1003, "로토무");
		
		map.put(member1.memberID, member1); // 1001, 회원 객체
		map.put(member2.memberID, member2);
		map.put(member3.memberID, member3);
		
		
		// 회원 조회
		System.out.println(map.get(1001)); // get(key값)
		System.out.println(map.get(1002));
		System.out.println(map.get(1003));
		
		
		// 1번째 회원 삭제
		map.remove(1001);
		
		// 전체 회원 수 출력
		System.out.println("전체 회원 수: " + map.size());

		// 전체 회원 목록 출력
		System.out.println(map);

		// 회원 목록 순회하기
		Set<Integer> keyset = map.keySet();

		// 변수 : 자료구조 (배열,리스트,set O map X)
		for (int key : keyset) { // 다음 key가 있으면
			System.out.println("[Key]:" + key + " [Value]:" + map.get(key)); // 키로 회원 조회
		}
		
	}

}


//쇼핑몰 회원
class Member {
	
	int memberID; // 회원 아이디
	String memberName; // 회원 이름
	
	
	public Member(int memberID, String memberName) {
		super();
		this.memberID = memberID;
		this.memberName = memberName;
	}


	@Override
	public String toString() {
		return "회원 ID: " + memberID + ", 회원 이름: " + memberName;
	}
	
	
}











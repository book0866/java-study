package wrapper;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		
		// 리스트는 기초타입을 사용할 수 없기 때문에 'Boolean'과 같은 래퍼클래스를 사용해야 함
		ArrayList<Boolean> list = new ArrayList<Boolean>();
		
		list.add(true); // new Boolean(true) 형태로 변환됨(오토박싱)
		list.add(true);
		list.add(false);
		
		boolean b = list.get(0); // list.get(0);.booleanValue로 변환됨(언박싱)
		
	}

}

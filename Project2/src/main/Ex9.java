package main;

public class Ex9 {

	public static void main(String[] args) {
		
		byte b = 10;
		int i = b; // b변수의 값을 i변수에 복사
		System.out.println(i);
		
		float f = 10.0f; // float: 4byte
		double d = f; // double: 8byte
		System.out.println(d);
		
		// 정수형과 실수형
		int iNum = 1;
		float fNum = iNum; // 둘 다 4byte로 크기는 같지만 실수형인 float이 더 정밀하므로 자동 형변환
		System.out.println(fNum);
		
		// 연산 중에 자동 형변환이 되는 경우
		// 컴퓨터가 더하기 연산을 수행할 때, 두 항을 같은 자료형으로 변환함
		// 이 때 iNum이 float형으로 자동으로 형변환 됨
		System.out.println(iNum + fNum); // int의 자동 형변환으로 float + float(실수값)이 됨
		
	}

}

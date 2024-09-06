package main;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		// 아래 그림은 DBDriver 인터페이스와 하위 클래스의 상속관계를 표현한 것입니다. 
		// 세 클래스에는 데이터베이스 연결하는 기능이 정의되어 있습니다.
		// 1을 입력하면 MySQL, 2를 입력하면 Oracle, 3을 입력하면 Postgres가 연결되도록 클래스를 구현하세요.
		
		System.out.println("드라이버를 선택하세요.");
		System.out.println("1: mysql");
		System.out.println("2: oracle");
		System.out.println("3: postgres");
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		DBDriver dbDriver = null;
		
		// 입력받은 숫자에 따라 데이터베이스 선택
		if(num == 1) {
			dbDriver = new MySqlDBDriver();
		} else if (num == 2) {
			dbDriver = new OracleDBDriver();
		} else if (num == 3) {
			dbDriver = new PostgresDBDriver();
		} else {
			System.out.println("잘못된 숫자를 입력했습니다.");
		}
		
		if(dbDriver != null) {
			dbDriver.dbConnect(); // 실제 인스턴스 메소드 호출
		}
		
	}

}

class MySqlDBDriver implements DBDriver {

	@Override
	public void dbConnect() {
		System.out.println("MySqlDBDriver에 연결합니다.");
	}
	
}


class OracleDBDriver implements DBDriver {

	@Override
	public void dbConnect() {
		System.out.println("OracleDBDriver에 연결합니다.");
	}
	
}


class PostgresDBDriver implements DBDriver {

	@Override
	public void dbConnect() {
		System.out.println("PostgresDBDriver에 연결합니다.");
	}
	
}














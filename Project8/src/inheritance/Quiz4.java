package inheritance;

public class Quiz4 {

	public static void main(String[] args) {
		
		// 아래 그림은 몬스터과 슬라임 클래스의 상속관계를 표현한 것입니다.
		// 다음과 같이 클래스를 구현하고, 객체를 생성하세요.
		Monster monster = new Monster();
		
		monster.power = 10;
		monster.hp = 100;
		
		monster.showInfo();
		monster.hit();
		System.out.println();
		
		
		Slime slime = new Slime();
		
		slime.power = 30;
		slime.hp = 200;
		slime.skill = "마비";
		
		slime.showInfo();
		slime.hit();
		slime.charge();

	}

}

class Monster {
	
	int power;
	int hp;
	
	public void hit() {
		System.out.println("몬스터가 " + power + "만큼 공격했다!");
	}
	
	public void showInfo() {
		System.out.println("몬스터의 공격력은 " + power + "이고 체력은 " + hp + "이다.");
	}
	
}


class Slime extends Monster {
	
	String skill;
	
	public void charge() {
		System.out.println("슬라임이 " + skill + "을(를) 시전했다!");
	}
	
}






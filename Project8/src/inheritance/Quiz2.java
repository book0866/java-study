package inheritance;

public class Quiz2 {

	public static void main(String[] args) {
		
		//  베이직티비 인스턴스를 생성하세요. (전원 상태:on, 채널:7, 볼륨:20)
		BasicTV basicTV = new BasicTV();
		
		basicTV.power = true;
		basicTV.channel = 7;
		basicTV.volume = 20;
		
		
		//  스마트티비 인스턴스를 생성하세요. (전원 상태:on, 채널:11, 볼륨:30, 아이피:192.168.0.111)
		SmartTV smartTV = new SmartTV();
		
		smartTV.power= true;
		smartTV.channel = 11;
		smartTV.volume = 30;
		smartTV.ip = "192.168.0.111";
		
		//  모든 인스턴스의 정보를 출력하세요
		
		basicTV.showInfo();
		smartTV.showInfo();
		
	}

}

//베이직티비(Basic TV)를 정의하는 클래스를 만드세요.
// 속성: 전원 상태, 채널, 볼륨
class BasicTV {
	
	boolean power;
	int channel;
	int volume;
	
	public void showInfo() {
		System.out.println("BasicTV");
		System.out.println("전원 : " + power);
		System.out.println("채널 : " + channel);
		System.out.println("볼륨 : " + volume);
	}
	
}

//  베이직티비 클래스를 상속받는 스마트티비(SmartTV) 클래스를 만드세요.
//  속성: 아이피
class SmartTV extends BasicTV {
	
	String ip;
	
	public void showInfo() {
		System.out.println();
		System.out.println("SmartTV");
		System.out.println("전원 : " + power);
		System.out.println("채널 : " + channel);
		System.out.println("볼륨 : " + volume);
		System.out.println("IP 주소 : " + ip);
	}
	
}






package innerclass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 화면 생성
		Frame frame = new Frame();

		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);
		
		TextArea textArea = new TextArea("너무너무 좋다고 말해.", 10, 50);
		frame.add(textArea);
		
		frame.setVisible(true);
		
		
		// 포커스 이벤트 등록하기
		// 입력 필드를 클릭하면 "포커스 되었습니다."
		// 입력 필드를 벗어나면 "포커스가 벗어났습니다." (프레임 밖을 찍어주세요!)
		
		//1. 구현 클래스를 만들어서 등록
//		textArea.addFocusListener(new FocusHandler());
		
		
		// 2. 익명 클래스를 만들어서 등록
		textArea.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("포커스 되었습니다.");
			}

			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("길을 잃었다. 어딜 가야 할까. 열두 개로 갈린 조각난 골목길. 어딜 가면 너를 다시 만날까.");
			}
			
		});
	}

}



class FocusHandler implements FocusListener {

	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("포커스 되었습니다.");
	}

	@Override
	public void focusLost(FocusEvent e) {
		System.out.println("길을 잃었다. 어딜 가야 할까. 열두 개로 갈린 조각난 골목길. 어딜 가면 너를 다시 만날까.");
	}
	
}



















package generic;

public class Ex2 {

	public static void main(String[] args) {
		
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		Powder p1 = new Powder(); // Powder를 재료로 선택
		
		printer.setMaterial(p1); // 매개변수가 자동으로 형변환됨 //  Object material = new Powder()
		
		Object object = printer.getMaterial(); // 재료를 꺼낼 때는 직접 형변환을 해야 함
		
		Powder p2 = (Powder)object; // object 함수를 원래 타입으로 다운캐스팅 (변수 타입 = 객체 타입 일치)
		
		p2.doPrinting();
		
	}

}


// 파우더와 플라스틱을 재료로 사용하는 프린터 만들기
class ThreeDPrinter3 {
	
	private Object material; // 자료형을 Object로 선언하면 파우더와 플라스틱을 모두 저장할 수 있음

	
	public Object getMaterial() {
		return material;
	}

	public void setMaterial(Object material) {
		this.material = material;
	}
	
}












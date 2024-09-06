package generic;


// 재료로 사용할 파우더 클래스
class Powder {
	
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다.");
	}
	
	public String toString() { // 메소드 원형은 메모리 주소를 반환하지만
		return "재료는 Powder입니다."; // 필요한 정보값을 반환
	}
	
}


// 재료로 사용할 플라스틱 클래스
class Plastic {
	
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다.");
	}
	
	public String toString() {
		return "재료는 Plastic입니다.";
	}
	
}


// 파우더를 재료로 사용하는 프린터 만들기
class ThreeDPrinter1 {
	
	private Powder material; // 변수의 자료형을 Powder로 선언
	

	public Powder getMaterial() {
		return material;
	}

	public void setMaterial(Powder material) {
		this.material = material;
	}
	
}


// 플라스틱을 재료로 하는 프린터 만들기
class ThreeDPrinter2 {
	
	private Plastic material; // 변수의 자료형을 Plastic으로 선언
	

	public Plastic getMaterial() {
		return material;
	}

	public void setMaterial(Plastic material) {
		this.material = material;
	}

}












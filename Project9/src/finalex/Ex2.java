package finalex;



class Parents {
	
	// final 메소드는 재정의(Override) 할 수 없음(변형x)
	final void method1() {
	}
	
	void method2() {
	}
	
}


class Child extends Parents {

	@Override
	void method2() {
	}
	
}














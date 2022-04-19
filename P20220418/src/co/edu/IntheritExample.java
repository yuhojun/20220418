package co.edu;

public class IntheritExample {
	public static void main(String[] args) {
		
		Child1 c1 = new Child1();
		c1.field1 = ""; //부모필드
		c1.field2 = ""; //자식필드
		
		c1.method1();
		c1.method2();
		
		Child2 c2 = new Child2();
		c2.field1 = ""; //부모필드
		c2.field3 = ""; //자식필드
		
		c2.method1();
		c2.method3(); 
		
		//부모의 참조변수에 자식의 인스턴스를 할당.
		Parent p1 = new Parent();
		p1 = new Child1(); // int -> long, double(promotion)
		p1 = new Child2(); // 자동형 변환
		
		p1.field1 = ""; // 부자가 가지고있는드 필드,메소드
		p1.method1(); //부모가 가진 필드 메소드만 가능
		
		c2 = (Child2) p1; //강제형변환 가능
		c2.field1 = "";
		c2.field3 = "";
		
		c2.method1();
		c2.method3();
		
		
	}
}

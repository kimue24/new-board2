package sec06.exam01;

public class VariableScopeEx {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;		
			
			System.out.println(v2);
		}
//		int v3 = v1 + v2 + 5; / v2 변수 사용 불가능 컴파일에러
	}
}
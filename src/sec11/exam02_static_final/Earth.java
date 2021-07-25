package sec11.exam02_static_final;

public class Earth {
	
	// 상수는 객체마다 들어가는 것이 아니고 메소드 영역에 클래스별로 관리되는 불변의 정적 필드
	// static final 로 상수 필드 선언
	static final double EARTH_RADIUS = 6400; // 바로 초기화
	static final double EARTH_SURFACE_AREA; //선언만하고
	// 상수의 이름은 대문자로 하는것이 관례
	
	static { // 상수필드를 static 블록 안에서 초기화
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}

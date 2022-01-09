package earth;

public class EarthExample {
    public static void main(String[] args) {
        System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + " km");
        System.out.println("지구의 표면적: " + Earth.EARTH_SURFACE_AREA + " km^2");


        // final 상수이기 때문에 변수를 변경하려고 시도하면 컴파일 에러
//        Earth.EARTH_RADIUS = 6500 ;

    }
}

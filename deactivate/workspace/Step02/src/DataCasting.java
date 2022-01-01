public class DataCasting {
    /*
     *  데이터 형 변환시에는 리소스가 소모된다. ( 최적화에 방해 ) >> 형변환은 최대한 적게 쓴다.
     *
     *
     *
     */


    public static void main(String[] args) {

        // Auto Casting -> 메모리 비이트수가 큰 곳에 작은곳으로 옮길 때만 가능

        int r = 5;
        double areaPI = r * r * Math.PI;
        double area = r * r * 3.1415;
        System.out.println(area);
        System.out.println(areaPI);


        // 강제로 형변환


        int a = (int)area ;  // 뒤에 있던 소수점은 버려진다. (데이터가 손실된다)
        System.out.println(a);


        String str = "333" ;
        int intStr = Integer.parseInt(str) ;

        System.out.println(intStr);


    }
}

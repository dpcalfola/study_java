package sedanFactory;


import component.Tire;

public class Sedan {
    public static void main(String[] args) {

        Tire compoTire = new Tire();


        // 일반 변수의 경우 초기값을 설정하지 않으면 컴파일 오류가 나지만
        // 외부 클래스 안의 선언값은 생성자가 없어도 초기값이 이미 설정되어 있다
        // 그래도 생성자는 설정 해두자.
//        int n ;
//        System.out.println(n);


        // 생성자로 인해 생성된 size 값
        System.out.println(compoTire.getSize());

//        compoTire.size = 20;
//        System.out.println(compoTire.size);


        compoTire.setSize(20);

        int currentTireSize = compoTire.getSize();

        System.out.println(currentTireSize);


    }
}

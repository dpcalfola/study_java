package object.objectHashCode;

public class KeyExample {
    public static void main(String[] args) {
        Key k1 = new Key(3);
        Key k2 = new Key(5);
        Key k3 = k1;

        System.out.println("k1.hashCode(): " + k1.hashCode());
        System.out.println("k2.hashCode(): " + k2.hashCode());
        System.out.println("k3.hashCode(): " + k3.hashCode());

        // 메모리 주소값이 복제된(객체가 같은) k1 과 k3 는 해시코드 값이 같다.  // 같은 인스턴스라는 의미
        // 힙의 위치가 다른 k1 과 k2 는 해시코드 값이 다른다.
    }
}

package systemClass.classClass;

public class ClassClass {
    public static void main(String[] args) {
        Car car1 = new Car(100);
        Class clazz = car1.getClass();
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getPackage().getName());
    }
}

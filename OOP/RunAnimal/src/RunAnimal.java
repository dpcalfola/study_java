public class RunAnimal {

    public static void main(String[] args) {
        Animal ani1 = new Animal();
//        ani1.name = "Cat";
//        ani1.age = 10 ;

//        System.out.println(ani1.age);
//        System.out.println(ani1.name);
//        System.out.println(ani1);  // Animal@2f7c7260 // 주소값?

        System.out.println(ani1.getAge());

        System.out.println("==========================================");
        System.out.println(ani1.getName());
//        System.out.println(ani1.age);


        System.out.println("==========================================");

        ani1.setName("Dog");
        System.out.println(ani1.getName());
//        System.out.println(ani1.name);


        System.out.println("==========================================");

        ani1.setAge(23);


        // private 이여도 메서드를 이용하면 접근이 가능하다.
        // animal 클래스에서 설정한 메서드의 방식 만으로만 접근할수 있도록 제한
        // 겟셋 메서드 : 아주 기본적인 개념

    }
}

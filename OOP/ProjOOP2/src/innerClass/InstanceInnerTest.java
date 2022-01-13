package innerClass;

public class InstanceInnerTest {
    public static void main(String[] args) {
        OuterClass out1 = new OuterClass();
        OuterClass.InnerClass in1 = out1.new InnerClass();

        in1.printInfo();

        //희안하네 ㅋㅋ
        OuterClass.InnerClass in2 = out1.new InnerClass();

        System.out.println();

    }

}

package accessModifier.package2;

import accessModifier.package1.ClassA;

public class ClassD extends ClassA {
    // import 를 통해 ClassA 를 가져옴
    // extends 를 통해 ClassA 를 상속

    // ClassD constructor
    public ClassD() {

        // super() 가 뭘 의미하시는지요?
        super();
        this.field = "value";
        this.method();

    }

}

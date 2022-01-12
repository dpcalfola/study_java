package instanceOf;

import java.util.TreeMap;

public class InstanceOf {
    public static void main(String[] args) {

        Parent parent = new Parent();
        Child child = new Child();

        TorF(parent instanceof Parent);
        TorF(parent instanceof Child);
        TorF(child instanceof Parent);
        TorF(child instanceof Parent);

        parent = child ;
        parent = parent;
//        child = parent;  //안됨
        child = child ;

    }

    static void TorF(boolean T) {
        if (T) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

}


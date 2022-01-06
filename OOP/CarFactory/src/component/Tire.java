package component;

public class Tire {

    // Constructor == 생성자
    public Tire(){
        System.out.println("Tire Constructor");
        size = 0 ;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private int size ;
}

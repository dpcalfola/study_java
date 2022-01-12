package inheritance2;

public class Tire {
    public int maxRotation; // 최대 회전수(타이어 수명)
    public int accumulateRotation; // 누적 회전수
    public String location; // 타이어의 위치

    public Tire(String location, int maxRotation){
        this.location = location;
        this.maxRotation = maxRotation;
    }

    public boolean roll() {
        ++accumulateRotation;
        if(accumulateRotation<maxRotation){
            System.out.printf("%s Tire 수명 %d 회\n", location, maxRotation - accumulateRotation);
            return true;
        } else {
            System.out.println("*** " + location + "Tire");
            return false;
        }
    }
}
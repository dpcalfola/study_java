package interface1;


// implements: 구현한다
public class Audio implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("System: Turn on the Audio");
    }

    @Override
    public void turnOff() {
        System.out.println("System: Turn Off the Audio");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("Audio volume: " + this.volume);
    }
}

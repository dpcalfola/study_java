package method.tv;

public class Tv {

    boolean power;
    int channel;
    int vol;
    boolean mute;

    Tv() {
        power = false;
        channel = 1;
        vol = 0;
        mute = false;
    }

    void setPowerOnOff() {
        power = !power;
        if (power) {
            System.out.println("System : Power On.");
        } else {
            System.out.println("System : Power Off.");
        }

    }

    void setmute() {
        if (power) {
            mute = !mute;
        }
        if (mute) {

            System.out.println("System : Muted.");

        }

    }


    void channelUp() {
        if(!power) {
            return;  // void 타입에서 return; 넣으면 메소드를 빠져나간다.
        }


        if (channel == 256) {
            channel = 1;
        } else {
            channel++;
        }


    }

    void channelDown() {
        if (power) {

            if (channel == 1) {
                channel = 256;
            } else {
                channel--;
            }


        }

    }

    void volUp() {

        if(mute){
            setmute();
        }
        // 음소거 상태에서 볼륨조작시 음소거가 풀린다


        if (power) {

            if (vol < 50) {
                vol++;
            }

        }

    }

    void volDown() {
        if (power) {

            if (vol > 0) {
                vol--;
            }

        }

    }
}

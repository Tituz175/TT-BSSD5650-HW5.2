public class Television implements ElectronicDevice {

    private int volume = 0;

    @Override
    public void update() {
        System.out.println("Updating from the internet");
    }

    @Override
    public void downgrade() {
        System.out.println("Downgrading OS from Backup");
    }

    public void on() {
        System.out.println("TV is on");

    }

    public void off() {
        System.out.println("TV is off");

    }

    public void volumeUp() {
        volume++;
        System.out.println("TV Volume is at: " + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println("TV Volume is at: " + volume);
    }

}


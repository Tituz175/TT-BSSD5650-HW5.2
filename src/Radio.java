public class Radio implements ElectronicDevice {

    private int volume = 0;

    @Override
    public void update() {
        System.out.println("Updating from the air waves");
    }

    @Override
    public void downgrade() {
        System.out.println("Downgrading OS via SD card");
    }

    public void on() {
        System.out.println("Radio is on");
    }

    public void off() {
        System.out.println("Radio is off");
    }

    public void volumeUp() {
        volume++;
        System.out.println("Radio Volume is at: " + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println("Radio Volume is at: " + volume);
    }
}


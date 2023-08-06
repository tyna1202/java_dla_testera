package Model.computer;

public class Laptop extends Computer implements Music, Video {

    private int batteryLevel;

    public Laptop(String name, String type, Hdd hdd, Ram ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;

    }


    public int volumeUp() {
        return volumeLevel += 5;
    }

    @Override
    public int volumeUp(int newVolumeLevel) {
        volumeLevel = newVolumeLevel + volumeLevel;
        if(volumeLevel >= 100) {
            volumeLevel = 100;
            return volumeLevel;
        } else {
            return volumeLevel;
        }

    }

    @Override
    public void switchOn() {
        System.out.println("Checking battery level");
        if(batteryLevel > 0 ) {
            super.switchOn();
        } else {
            System.out.println("Battery level too low");
        }
    }


    @Override
    public int volumeDown() {
        volumeLevel -= 2;
        if(volumeLevel <= 0){
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeDown(int newVolumeLevel) {
        return 0;
    }


    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }

    @Override
    public void playMusic() {
        System.out.println("PLAY MUSIC");
    }

    @Override
    public void pauseMusic() {
        System.out.println("PAUSE MUSIC");
    }

    @Override
    public void stopMusic() {
        System.out.println("STOP MUSIC");
    }

    @Override
    public void sayHello() {
        Music.super.sayHello();
    }

    @Override
    public void playVideo() {
        System.out.println("PLAY VIDEO");
    }

    @Override
    public void pauseVideo() {
        System.out.println("PAUSE VIDEO");
    }

    @Override
    public void stopVideo() {
        System.out.println("STOP VIDEO");
    }
}

package Model.computer;

public class PC extends Computer {

    private boolean isPowerSupply;


    public PC(String name, String type, Hdd hdd, Ram ram, int powerSuply) {
        super(name, type, hdd, ram);
        isPowerSupply = false;
    }

    public void setPowerSupply(boolean powerSupply) {
        isPowerSupply = powerSupply;
    }

    public void showComputerName(){
        System.out.println(name);
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (isPowerSupply) {
            super.switchOn();
        } else {
            System.out.println("Plug in your computer");
        }

    }

    public int volumeUp() {
        return volumeLevel += 1;
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
    public int volumeDown() {
        volumeLevel -= 1;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public int volumeDown(int newVolumeLevel) {
        volumeLevel = volumeLevel - newVolumeLevel;
        if(volumeLevel <= 0) {
            volumeLevel = 0;
            return volumeLevel;
        } else {
            return volumeLevel;
        }
    }
}

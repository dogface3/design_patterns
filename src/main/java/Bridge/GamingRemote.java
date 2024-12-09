package Bridge;

public class GamingRemote extends AdvancedRemote {
    public GamingRemote(Device device) {
        super(device);
    }
    @Override
    public void power() {
        if (device.isEnabled()) {
            device.disable();
            System.out.println("Remote: power toggle -> Device is now OFF.");
        } else {
            device.enable();
            System.out.println("Remote: power toggle -> Device is now ON.");
        }
    }
    public void startGame(String gameName) {
        if (device instanceof GamingConsole) {
            ((GamingConsole) device).startGame(gameName);
        } else {
            System.out.println("This remote is not compatible with the current device.");
        }
    }

    public void adjustGameSetting(String setting, String value) {
        if (device instanceof GamingConsole) {
            ((GamingConsole) device).adjustSetting(setting, value);
        } else {
            System.out.println("This remote is not compatible with the current device.");
        }
    }
}

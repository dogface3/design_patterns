package Bridge;

public class GamingConsole implements Device {
    private boolean isOn = false;
    private String currentGame = "No game loaded";



    public void startGame(String gameName) {
        if (isOn) {
            currentGame = gameName;
            System.out.println("Starting game: " + currentGame);
        } else {
            System.out.println("Please turn on the console first.");
        }
    }

    public void adjustSetting(String setting, String value) {
        if (isOn) {
            System.out.println("Setting " + setting + " adjusted to: " + value);
        } else {
            System.out.println("Console is off. Unable to adjust settings.");
        }
    }

    @Override
    public boolean isEnabled() {
        return isOn;
    }

    @Override
    public void enable() {
        isOn = true;
    }

    @Override
    public void disable() {
        isOn = false;
    }

    @Override
    public int getVolume() {
        return 0;
    }

    @Override
    public void setVolume(int percent) {

    }

    @Override
    public int getChannel() {
        return 0;
    }

    @Override
    public void setChannel(int channel) {

    }

    @Override
    public void printStatus() {

    }
}

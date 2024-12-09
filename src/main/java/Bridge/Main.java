package Bridge;

public class Main {
    public static void main(String[] args) {
        Device gamingConsole = new GamingConsole();
        GamingRemote gamingRemote = new GamingRemote(gamingConsole);

        // Test power functionality
        gamingRemote.power();

        // Test game-specific functionalities
        gamingRemote.startGame("Cyberpunk 2077");
        gamingRemote.adjustGameSetting("Graphics", "High");
        gamingRemote.adjustGameSetting("Volume", "75%");

        // Test turning off
        gamingRemote.power();
        gamingRemote.startGame("Minecraft");
    }
}

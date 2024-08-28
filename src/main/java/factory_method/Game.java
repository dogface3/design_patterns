package factory_method;


import java.util.Scanner;

public class Game {

    public Map createMap(String type, int width, int hieght){
        return switch (type) {
            case "city" -> new CityMap(width,hieght);
            case "wilderness" -> new WildernessMap(width,hieght);
            default -> throw new IllegalArgumentException("not a map type");
        };
    }
    public static void main(String[] args) {
        Game game = new Game();
        Scanner sc = new Scanner(System.in);
        System.out.println("what map to generate?");
        String mapType = sc.nextLine();
        Map map = game.createMap(mapType, 5,5);
        map.display();


    }
}
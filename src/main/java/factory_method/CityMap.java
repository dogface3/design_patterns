package factory_method;

import factory_method.tiles.Building;
import factory_method.tiles.Forest;
import factory_method.tiles.Road;

import java.util.Random;

class CityMap extends Map {

    public CityMap(int width, int height){
        super(width, height);
    }

    @Override
    public Tile createTile() {
        Random random = new Random();
        int tileType = random.nextInt(3);
        return switch (tileType) {
            case 0 -> new Road();
            case 1 -> new Forest();
            default -> new Building();
        };
    }
}
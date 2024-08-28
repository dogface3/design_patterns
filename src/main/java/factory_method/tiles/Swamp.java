package factory_method.tiles;

import factory_method.Tile;

public class Swamp implements Tile {
    @Override
    public char getCharacter() {
        return 'S';
    }

    @Override
    public String getDiscription() {
        return "swapm";
    }
}

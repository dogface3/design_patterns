package factory_method.tiles;

import factory_method.Tile;

public class Road implements Tile {
    @Override
    public char getCharacter() {
        return 'R';
    }

    @Override
    public String getDiscription() {
        return "road";
    }
}

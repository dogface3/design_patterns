package factory_method.tiles;

import factory_method.Tile;

public class Building implements Tile {
    @Override
    public char getCharacter() {
        return 'B';
    }

    @Override
    public String getDiscription() {
        return "Building";
    }
}

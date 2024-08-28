package factory_method.tiles;

import factory_method.Tile;

public class Forest implements Tile {
    @Override
    public char getCharacter() {
        return 'F';
    }

    @Override
    public String getDiscription() {
        return "forest";
    }
}

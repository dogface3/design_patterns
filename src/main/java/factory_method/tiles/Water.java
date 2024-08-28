package factory_method.tiles;

import factory_method.Tile;

public class Water implements Tile {
    @Override
    public char getCharacter() {
        return 'W';
    }

    @Override
    public String getDiscription() {
        return "water";
    }
}

package factory_method;

import java.util.ArrayList;
import java.util.List;

abstract class Map {
    public List<List<Tile>> tiles;
    public int width;
    public int height;

    public Map(int width, int height) {
        this.height = height;
        this.width = width;
        tiles = new ArrayList<>();
        generateMap();

    }


    public abstract Tile createTile();

    private void generateMap() {
        for (int h = 0; h< height; h++){
            List<Tile> row = new ArrayList<>();
            for (int w = 0; w<width; w++) {
                row.add(createTile());
            }
            tiles.add(row);
        }
    }
    public void display() {
        for (List<Tile> row : tiles){
            for (Tile tile : row) {
                System.out.print(tile.getCharacter() + " ");
            }
            System.out.println();
        }
    }
}
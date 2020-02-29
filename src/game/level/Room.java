package game.level;

import engine.maths.Vector2i;
import engine.maths.Vector3i;
import engine.objects.GameObject;
import engine.objects.Symbol;
import engine.objects.modifiers.Modifier;
import game.Game;

import java.util.ArrayList;

public class Room {

    private Vector2i dimensions;
    private GameObject[][] room;

    public Room(Vector2i dimensions, Symbol roomFill) {
        this.dimensions = dimensions;
        room = new GameObject[this.dimensions.getX()][this.dimensions.getY()];
        for(int i = 0; i < this.dimensions.getX(); i++) {
            for(int j = 0; j < this.dimensions.getY(); j++) {
                room[i][j] = new GameObject(new Vector3i(i, j, 0), roomFill, this, new ArrayList<Modifier>());
            }
        }
    }

    public GameObject get(Vector2i position) {
        return room[position.getX()][position.getY()];
    }

    public int getWidth() {
        return dimensions.getX();
    }
    public int getHeight() { return dimensions.getY(); }

}

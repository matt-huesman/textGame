package engine.objects;

import engine.core.GameRegistery;
import engine.maths.Vector3i;
import engine.objects.modifiers.Modifier;
import game.level.Room;

import java.util.ArrayList;

public class GameObject {

    private Vector3i position;
    private Symbol symbol;
    private Room currentRoom;
    private ArrayList<Modifier> modifiers;

    public GameObject(Vector3i position, Symbol symbol, Room room, ArrayList<Modifier> modifiers) {
        this.position = position;
        this.symbol = symbol;
        this.modifiers = modifiers;
        this.currentRoom = room;
        GameRegistery.addGameObject(this);
    }

    public void addModifier(Modifier modifier) {
        modifiers.add(modifier);
    }

    public Vector3i getPosition() {
        return position;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

}

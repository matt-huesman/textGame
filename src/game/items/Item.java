package game.items;

import engine.maths.Vector3i;
import engine.objects.GameObject;
import engine.objects.Symbol;
import engine.objects.modifiers.Modifier;
import game.level.Room;

import java.util.ArrayList;

public class Item extends GameObject {

    public Item(Vector3i position, Symbol symbol, Room room, ArrayList<Modifier> modifiers) {
        super(position, symbol, room, modifiers);
    }
}

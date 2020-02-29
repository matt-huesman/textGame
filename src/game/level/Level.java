package game.level;

import engine.maths.Vector2i;
import engine.maths.Vector3i;
import engine.objects.Symbol;

import java.util.ArrayList;

public class Level {

    private ArrayList<Room> roomList;
    private Room currentRoom;

    public Level(int roomCount, Symbol roomFill) {
        roomList = new ArrayList<Room>();
        for(int i = 0; i < roomCount; i++) {
            roomList.add(new Room(new Vector2i(10, 10), roomFill));
        }
        currentRoom = roomList.get(0);
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

}

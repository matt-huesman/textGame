package engine.core;

import engine.maths.Vector2i;
import engine.maths.Vector3i;
import engine.objects.GameObject;
import engine.objects.Symbol;
import engine.objects.modifiers.Modifier;
import engine.utils.ConsoleUtils;
import game.level.Room;

import java.util.ArrayList;

public class GameRegistery {

    private static ArrayList<GameObject> gameRegistery = new ArrayList<GameObject>();

    public static void addGameObject(GameObject object) {
        gameRegistery.add(object);
    }

    public static ArrayList<GameObject> getObjectsAtPosition(Vector2i position, Room room) {
        ArrayList<GameObject> objects = new ArrayList<GameObject>();
        for(int i = 0; i < gameRegistery.size(); i++) {
            if(gameRegistery.get(i).getCurrentRoom() == room) {
                if (gameRegistery.get(i).getPosition().getX() == position.getX() && gameRegistery.get(i).getPosition().getY() == position.getY())
                    objects.add(gameRegistery.get(i));
            }
        }
        return objects;
    }

    public static GameObject getObjectAtPosition(Vector2i position, Room room) {
        ArrayList<GameObject> objects = getObjectsAtPosition(position, room);
        GameObject topObject;
        if(!objects.isEmpty()) {
            topObject = objects.get(0);
            for (int i = 0; i < objects.size(); i++) {
                if (objects.get(i).getCurrentRoom() == room) {
                    if (objects.get(i).getPosition().getZ() >= topObject.getPosition().getZ())
                        topObject = objects.get(i);
                }
            }
            return topObject;
        } else {
            return new GameObject(new Vector3i(position.getX(), position.getY(),0), new Symbol('#'), room, new ArrayList<Modifier>());
        }
    }

    public static void destroyObject(GameObject object) {
        gameRegistery.remove(object);
    }

    public static int size() {
        return gameRegistery.size();
    }

}

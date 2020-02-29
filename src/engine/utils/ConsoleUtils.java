package engine.utils;

import engine.core.GameRegistery;
import engine.maths.Vector2i;
import engine.objects.GameObject;
import game.level.Room;

public class ConsoleUtils {

    public static void print(Room room) {
        for(int i = 0; i < room.getHeight(); i++) {
            for(int j = 0; j < room.getWidth(); j++) {
                print(GameRegistery.getObjectAtPosition(new Vector2i(j, i), room).getSymbol().getValue());
                print(" ");
            }
            println("");
        }
    }

    public static void print(String value) {System.out.print(value);}
    public static void println(String value) {System.out.println(value);}
    public static void print(int value) {System.out.print(value);}
    public static void println(int value) {System.out.println(value);}
    public static void print(char value) {System.out.print(value);}
    public static void println(char value) {System.out.println(value);}

}

package game;

import engine.core.GameCore;
import engine.core.GameRegistery;
import engine.maths.Vector2i;
import engine.maths.Vector3i;
import engine.objects.Symbol;
import engine.objects.modifiers.Collision;
import engine.objects.modifiers.Modifier;
import engine.utils.ConsoleUtils;
import game.entities.Player;
import game.level.Level;

import java.util.ArrayList;

public class Game extends GameCore {

    Player player;
    Level level;

    @Override
    public void start() {
        level = new Level(5, new Symbol('∎'));
        player = new Player(new Vector3i(1, 1, 1), new Symbol('▢'), level.getCurrentRoom(), new ArrayList<Modifier>());
        player.addModifier(new Collision());
        GameRegistery.destroyObject(level.getCurrentRoom().get(new Vector2i(0,0)));
        ConsoleUtils.print(level.getCurrentRoom());
        ConsoleUtils.println(GameRegistery.size());
    }

    @Override
    public void update() {

    }

    @Override
    public void end() {

    }

    public Level getLevel() {
        return level;
    }

}

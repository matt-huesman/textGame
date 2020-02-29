package engine.core;

import engine.objects.modifiers.Modifier;
import game.Game;

public abstract class GameCore {

    public GameCore() {
        this.startCore();
        this.updateCore();
        this.endCore();
    }

    private void startCore() {
        start();
    }
    private void updateCore() {
        while(true) {
            Modifier.update();
            update();
        }
    }
    private void endCore() {
        end();
    }

    protected void start() { }
    protected void update() { }
    protected void end() { }

    public static void main(String[] args) {
        GameCore core = new Game();
    }
}

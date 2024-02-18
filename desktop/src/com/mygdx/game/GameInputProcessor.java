package com.mygdx.game;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;

public class GameInputProcessor implements InputProcessor {
    private GameStateManager gsm;

    public GameInputProcessor(GameStateManager gsm) {
        this.gsm = gsm;
    }

    @Override
    public boolean keyDown(int keycode) {
        // Delegate the handling of the key press to the current game state
        gsm.getCurrentState().handleInput(keycode);
        return true;
    }
    
    @Override
    public boolean touchCancelled(int screenX, int screenY, int pointer, int button) {
        // Handle touch cancel event if necessary
        return false;
    }

    // Implement other necessary methods from InputProcessor interface
    // For simplicity, returning false to indicate the event was not handled

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        return false;
    }
}

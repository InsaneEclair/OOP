package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public interface GameState {
    void handleInput(); // Process user input
    void update(float dt); // Update game state
    void render(SpriteBatch sb); // Render the state to the screen
    void dispose(); // Free resources when switching states
    
    public abstract void handleInput(int keycode);
}

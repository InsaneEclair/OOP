package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainMenuState extends GameState {
    private GameStateManager gsm;
    private SpriteBatch batch;
    // Add other fields for menu items, textures, etc.

    public MainMenuState(GameStateManager gsm) {
        this.gsm = gsm;
        batch = new SpriteBatch();
        // Initialize menu items, textures, etc.
    }

    @Override
    public void handleInput() {
        if (Gdx.input.justTouched()) {
            // Determine which menu item was selected and transition to the appropriate game state
            // Example: if the "Game 1" menu item is selected
            gsm.set(new GameOneState(gsm));
            // Similarly, for "Game 2"
            // gsm.set(new GameTwoState(gsm));
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        // Render the main menu UI here
    }

    @Override
    public void dispose() {
        // Dispose of resources
    }
}

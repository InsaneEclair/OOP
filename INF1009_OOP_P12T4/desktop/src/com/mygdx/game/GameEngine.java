package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class GameEngine extends ApplicationAdapter {
    private GameStateManager gsm;
    private SpriteBatch batch;

	@Override
	public void create() {
        batch = new SpriteBatch();
        gsm = new GameStateManager();
        gsm.push(new InitialState(gsm)); // Replace InitialState with your starting game state
	    Gdx.input.setInputProcessor(new GameInputProcessor(gsm));
	}
	
	@Override
	public void render() {
		ScreenUtils.clear(0, 0, 0.2f, 1);
        gsm.update(Gdx.graphics.getDeltaTime());
        gsm.render(batch);
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
}
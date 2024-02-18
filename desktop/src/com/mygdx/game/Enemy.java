package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public abstract class Enemy {
    public abstract void update();
    public abstract void draw(SpriteBatch batch);
    public abstract Rectangle getBound();
    public abstract boolean isOutOfScreen();
}
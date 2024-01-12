package com.mygdx.game;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.MathUtils;

public class GameMaster extends ApplicationAdapter{
    private Texture dropImage;
    private Texture bucketImage;
    private SpriteBatch batch;
    private Rectangle drop;
    private Rectangle bucket;
    private float dropSpeed = 2;
    
    @Override
    public void create()
    {
    	dropImage = new Texture(Gdx.files.internal("droplet.png"));
        bucketImage = new Texture(Gdx.files.internal("bucket.png"));
        batch = new SpriteBatch();
        drop = new Rectangle();
        
        int screenWidth = Gdx.graphics.getWidth();
        
        drop.x = MathUtils.random(0, screenWidth - dropImage.getWidth());
        drop.y = 400;
        drop.width = dropImage.getWidth();
        drop.height = dropImage.getHeight();
        bucket = new Rectangle();
        bucket.x = (screenWidth / 2) - (bucketImage.getWidth()/2);
        bucket.y = 0;
        bucket.width = bucketImage.getWidth();
        bucket.height = bucketImage.getHeight();
    }

    @Override
    public void render()
    {
        ScreenUtils.clear(0,0,0.2f,1);
        batch.begin();
            batch.draw(dropImage, drop.x,drop.y, drop.width, drop.height);
            batch.draw(bucketImage, bucket.x, bucket.y, bucket.width, bucket.height);
        batch.end();
        drop.y -= dropSpeed;
        
        if (drop.y <= 0){
            drop.y = 400;
            drop.x = MathUtils.random(0, Gdx.graphics.getWidth() - dropImage.getWidth());
            if (dropSpeed < 10) {
                dropSpeed += 2;
            }
        }
        if (Gdx.input.isKeyPressed(Keys.LEFT)) bucket.x -= 400 * Gdx.graphics.getDeltaTime();
            if(Gdx.input.isKeyPressed(Keys.RIGHT)) bucket.x += 400 * Gdx.graphics.getDeltaTime();
    }
    
    @Override
    public void dispose()
    {
        batch.dispose();
        dropImage.dispose();
        bucketImage.dispose();
    }
}
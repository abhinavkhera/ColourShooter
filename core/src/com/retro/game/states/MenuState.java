package com.retro.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MenuState extends State{
    private Texture background;
    private Texture title;
    private Texture playMenu;
    private Texture instrMenu;
    private Texture skinsMenu;
    private Texture returnMenu;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("background.jpg");
        title = new Texture("title.png");
        playMenu = new Texture("m1.png");
        instrMenu = new Texture("m2.png");
        skinsMenu = new Texture("m3.png");
        returnMenu = new Texture("m4.png");
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        sb.draw(playMenu, (Gdx.graphics.getWidth() / 2) - (playMenu.getWidth() / 2),
                (Gdx.graphics.getHeight() / 2) - (playMenu.getHeight() / 2));
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        playMenu.dispose();
    }
}

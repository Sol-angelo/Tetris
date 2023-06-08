// 
// Decompiled by Procyon v0.5.36
// 

package com.solace.main.objects;

import com.solace.main.Game;
import com.solace.main.util.*;
import com.solace.main.util.enums.ID;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Player extends GameObject
{
    Random r;
    Handler handler;
    HUD hud;
    private Game game;
    private BufferedImage player_image;
    public float speed = 1;

    public Player(final float x, final float y, final ID id, final Handler handler, final Game game) {
        super(x, y, id);
        this.r = new Random();
        this.handler = handler;
        this.game = game;
        this.hud = new HUD(game, handler);
        final SpriteSheet ss = new SpriteSheet(Game.sprite_sheet);
        this.player_image = ss.grabImage(1, 1, 32, 32);
    }
    
    @Override
    public Rectangle getBounds() {
        return new Rectangle((int)this.x, (int)this.y, 32, 32);
    }
    
    @Override
    public void tick() {
        this.x += this.velX * speed;
        this.y += this.velY * speed;
        this.x = Game.clamp(this.x, 0.0f, 600.0f);
        this.y = Game.clamp(this.y, 0.0f, 420.0f);
        if (hud.getLevel() == 20) {
            this.x = Game.clamp(this.x, 64.0f, 548.0f);
            this.y = Game.clamp(this.y, 64.0f, 448.0f);
        }
        this.collision();
    }
    
    private void collision() {
        for (int i = 0; i < this.handler.object.size(); ++i) {
            final GameObject tempObject = this.handler.object.get(i);

        }
    }
    
    @Override
    public void render(final Graphics g) {
        g.drawImage(this.player_image, (int)this.x, (int)this.y, null);
    }
}

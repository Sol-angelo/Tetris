// 
// Decompiled by Procyon v0.5.36
// 

package com.solace.main.util;

import com.solace.main.Game;
import com.solace.main.objects.Player;
import com.solace.main.util.enums.ID;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.util.LinkedList;
import java.util.Random;

public class Handler extends MouseAdapter
{
    private Game game;
    private Random r;
    private HUD hud;
    public LinkedList<GameObject> object;
    
    public Handler(final Game game) {
        this.object = new LinkedList<GameObject>();
        this.game = game;
        this.r = new Random();
    }
    
    public void tick() {
        for (int i = 0; i < this.object.size(); ++i) {
            final GameObject tempObject = this.object.get(i);
            tempObject.tick();

        }
    }
    
    public void render(final Graphics g) {
        for (int i = 0; i < this.object.size(); ++i) {
            final GameObject tempObject = this.object.get(i);
            tempObject.render(g);
        }
    }
    
    public void clearAll() {
        for (int i = 0; i < this.object.size(); ++i) {
            final GameObject tempObject = this.object.get(i);
            if (tempObject.getId() != ID.MenuParticle) {
                this.object.clear();
            }
        }
    }
    
    public void addObject(final GameObject object) {
        this.object.add(object);
    }
    
    public void removeObject(final GameObject object) {
        this.object.remove(object);
    }
}

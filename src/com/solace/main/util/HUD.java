// 
// Decompiled by Procyon v0.5.36
// 

package com.solace.main.util;

import com.solace.main.Game;
import com.solace.main.objects.MenuParticle;
import com.solace.main.util.enums.ID;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import static com.solace.main.Game.gameState;

public class HUD
{
    private Game game;
    private final Handler handler;
    private Random r;
    private static int score;
    private static int level;
    private int timerh;
    private static int levelTest;
    
    public HUD(final Game game, final Handler handler) {
        score = 0;
        level = 1;
        this.timerh = 0;
        this.game = game;
        this.handler = handler;
    }
    
    public void tick() {

    }
    
    public void render(final Graphics g) {
        g.setColor(Color.WHITE);
        g.drawRect(15, 15, 200, 32);
        g.drawString(("Score: "+score), 15, 64);
        g.drawString(("Level: "+level), 15, 80);
    }
    
    public static void setScore(final int tScore) {
        score = tScore;
    }
    public int getScore() {
        return score;
    }

    public static int getStaticScore() {
        return score;
    }
    public int getLevel() {
        return level;
    }
    public static int getStaticLevel() {
        if (score <= 499) {
            levelTest = 1;
        } else if (score <= 999) {
            levelTest = 2;
        } else if (score <= 1499) {
            levelTest = 3;
        } else if (score <= 1999) {
            levelTest = 4;
        } else if (score <= 2499) {
            levelTest = 5;
        } else if (score <= 2999) {
            levelTest = 6;
        } else if (score <= 3499) {
            levelTest = 7;
        } else if (score <= 3999) {
            levelTest = 8;
        } else if (score <= 4499) {
            levelTest = 9;
        } else if (score <= 4499 + 2180) {
            levelTest = 10;
        } else if (score <= 4999 + 2180) {
            levelTest = 11;
        } else if (score <= 5499 + 2180) {
            levelTest = 12;
        } else if (score <= 5999 + 2180) {
            levelTest = 13;
        } else if (score <= 6499 + 2180) {
            levelTest = 14;
        } else if (score <= 6999 + 2180) {
            levelTest = 15;
        }
        return levelTest;
    }
    
    public static void setLevel(final int tLevel) {
        level = tLevel;
    }
}

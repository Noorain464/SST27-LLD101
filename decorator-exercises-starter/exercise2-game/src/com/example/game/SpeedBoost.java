package com.example.game;

public class SpeedBoost extends CharacterDecorator {
    int boostAmount;
    public SpeedBoost(Character character, int boostAmount) {
        super(character);
        this.boostAmount = boostAmount;
    }

    @Override
    public void move() {
        System.out.println("Moving with boosted speed of " + getSpeed());
    }

    @Override
    public int getSpeed() {
        return character.getSpeed() + boostAmount;
    }

    @Override
    public String getSprite() {
        return character.getSprite() + " with Speed Boost";
    }
    
}

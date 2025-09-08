package com.example.game;

public class GoldenAura extends CharacterDecorator {
    public GoldenAura(Character character) {
        super(character);
    }

    @Override
    public void move() {
        System.out.println("A golden aura surrounds you as you move.");
        super.move();
    }

    @Override
    public void attack() {
        System.out.println("A golden aura empowers your attack.");
        super.attack();
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() + 2; // Small speed buff
    }

    @Override
    public int getDamage() {
        return super.getDamage() + 5; // Small damage buff
    }

    @Override
    public String getSprite() {
        return "Golden " + super.getSprite(); // Change sprite to indicate golden aura
    }
}

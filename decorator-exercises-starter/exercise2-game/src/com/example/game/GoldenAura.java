package com.example.game;

public class GoldenAura extends CharacterDecorator {
    public GoldenAura(Character character) {
        super(character);
    }

    @Override
    public void move() {
        System.out.println("A golden aura surrounds you as you move.");
        character.move();
    }

    @Override
    public void attack() {
        System.out.println("A golden aura empowers your attack.");
        character.attack();
    }

    @Override
    public int getSpeed() {
        return character.getSpeed() + 2; // Small speed buff
    }

    @Override
    public int getDamage() {
        return character.getDamage() + 5; // Small damage buff
    }

    @Override
    public String getSprite() {
        return "Golden " + character.getSprite(); // Change sprite to indicate golden aura
    }
}

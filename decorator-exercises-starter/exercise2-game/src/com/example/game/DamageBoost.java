package com.example.game;

public class DamageBoost extends CharacterDecorator {
    int damageAmount;
    public DamageBoost(Character character, int damageAmount) {
        super(character);
        this.damageAmount = damageAmount;
    }

    @Override
    public void attack() {
        System.out.println("Attacking with boosted damage of " + getDamage());
    }

    @Override
    public int getDamage() {
        return super.getDamage() + damageAmount;
    }

    @Override
    public String getSprite() {
        return super.getSprite() + " with Damage Boost";
    }
    
}

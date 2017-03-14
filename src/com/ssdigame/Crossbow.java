package com.ssdigame;

/**
 * Created by Mithun on 2/21/2017.
 */
public class Crossbow implements Weapon {
    @Override
    public void Attack() {
        System.out.println("Player attacked using a crossbow");
    }

    @Override
    public void Show() {
        System.out.println("Crossbow is being shown in the gameplay");
    }
}

package com.ssdigame;

/**
 * Created by Mithun on 2/21/2017.
 */
public class Sword implements Weapon {
    @Override
    public void Attack() {
        System.out.println("Player attacked using a Sword.");
    }

    @Override
    public void Show() {
        System.out.println("Sword is being shown in the gameplay");
    }
}
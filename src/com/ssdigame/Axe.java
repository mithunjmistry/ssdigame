package com.ssdigame;

/**
 * Created by Mithun on 2/21/2017.
 */
public class Axe implements Weapon {
    @Override
    public void Attack() {
        System.out.println("Player attacked using a Axe");
    }

    @Override
    public void Show() {
        System.out.println("Axe is being shown in the gameplay");
    }
}
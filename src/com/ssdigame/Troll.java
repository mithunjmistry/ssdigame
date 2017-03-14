package com.ssdigame;

/**
 * Created by Mithun on 2/21/2017.
 */
public class Troll implements Character {
    WeaponFactory weaponFactory = new WeaponFactory();
    Weapon w;
    String player_name = null;

    Troll(String firstWeapon, String name){
        w = weaponFactory.selectWeapon(firstWeapon);
        player_name = name;
        System.out.println("The name of the player is - ".concat(name));
        w.Show();
    }

    @Override
    public void Walk(int number_of_steps){
        String toDisplay = "The Troll character named ".concat(player_name).concat(" walked ").concat(String.valueOf(number_of_steps).concat(" steps"));
        System.out.println(toDisplay);
    }

    @Override
    public void Attack(){
        w.Attack();
    }

    @Override
    public void ChangeWeapon(String weapon_name){
        w = weaponFactory.selectWeapon(weapon_name);
        w.Show();
    }
}
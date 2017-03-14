package com.ssdigame;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    //This is not a part of design in actual game. It is only here because wanted to make this program interactive.
    private static Character NewChar(String player_name, String player_character, String player_weapon){
        String[] weapon_list = {"knife", "axe", "sword", "crossbow"}; //check if user choose a correct weapon
        if(Arrays.asList(weapon_list).contains(player_weapon.toLowerCase())) {
            switch (player_character.toLowerCase()) {
                case "king":
                    return new King(player_weapon, player_name);
                case "queen":
                    return new King(player_weapon, player_name);
                case "troll":
                    return new King(player_weapon, player_name);
                case "knight":
                    return new King(player_weapon, player_name);
                default:
                    return null;
            }
        }
        else{
            return null;
        }
    }

    public static void main(String[] args) {

        //We have made 3 functions in Character in design : Walk, Attack and ChangeWeapon
        //We have made 2 functions in Weapon : Show and Attack

        System.out.println("Welcome to Encounter game.");
        //Let's create a character King with name Mithun, and first weapon as crossbow
        Character king = new King("Crossbow", "Mithun"); //Will make a new character king. (Can create character based on what player choose)
        //Above line will also show the name of the player. It also displays the weapon selected through Show() function of weapon.
        //Let our character walk now.
        king.Walk(5); //King will walk 5 steps.
        //Above is demonstration of Walk function.
        //Let's make character attack with the weapon he chose
        king.Attack();
        //Above is demonstration of attack function.
        //Let's change the weapon.
        king.ChangeWeapon("Sword"); //After changing weapon, it again displays new weapon via Show() function of weapon.
        //Above is demonstration of ChangeWeapon function
        //Let's attack with a new weapon
        king.Attack();
        //The function Show and Attack are also being demonstrated. Show function is executed by character when object is created
        //or player changes the weapon. Demo of attack function of Weapon is also demonstrated via Attack function of character.

        //All created functions, classes, interface designed and demonstrated as per our design.

        //In design, we have created special features for all weapons like number of arrows and all.
        //We could implement it by using TypeFace in this program. But I talked to Prof. Harini Mam in Thursday class.
        //She explained that implementing different function for each weapon is currently out of scope for this assignment, so it's not needed to be implemented and shown.

        //Let's also demonstrate little interactively
        Scanner scanner = new Scanner(System.in);
        String player_name = null;
        Character c;
        while(true) {
            System.out.println("\nEnter your name in console: ");
            player_name = scanner.nextLine();

            System.out.println("Enter character full name: King, Queen, Knight, Troll");
            String player_character = scanner.next();
            System.out.println("Enter weapon full name: Axe, Sword, Crossbow, Knife");
            String player_weapon = scanner.next();
            c = NewChar(player_name, player_character, player_weapon);
            if (c == null) {
                System.out.println("Invalid inputs! Please try again.");
            } else {
                System.out.println("Welcome ".concat(player_name));
                break;
            }
        }
        
        while(true){
                System.out.println("What you want to do? (choose number) 1.Walk 2.Attack 3.Change weapon 4.Exit");
                String i = scanner.next();

                if(i.equals("1") || i.equalsIgnoreCase("walk")){
                    System.out.println("How many steps you want to walk?");
                    String steps = scanner.next();
                    c.Walk(Integer.parseInt(steps));
                }
                else if (i.equals("2") || i.equalsIgnoreCase("attack")){
                    c.Attack();
                }
                else if (i.equals("3") || i.contains("change")){
                    System.out.println("Select new weapon (enter full name) : Knife, Sword, Axe, Crossbow");
                    String changed_weapon = scanner.next();
                    c.ChangeWeapon(changed_weapon);
                }
                else if (i.equalsIgnoreCase("exit") || i.equals("4")) {
                    break;
                }
                else{
                    System.out.println("Invalid input. Please try again.");
                }
            }
        }
    }

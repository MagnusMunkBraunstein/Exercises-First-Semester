package DicemanPrograms;

import javax.swing.*;
import java.util.Random;

public class Diceman1_loop {
    public static void main(String[]args) {

        Random gen = new Random();
        int dice;
        int answer;
        String activity = "";
        boolean keepgoing=true;
        System.out.println("DicemanPrograms.Diceman1");

        while (keepgoing) {
            dice=gen.nextInt(6)+1;

            if (dice == 1) {
                activity = "Breakfest";
            } else if (dice == 2) {
                activity = "Study";
            } else if (dice == 3) {
                activity = "Swim";
            } else if (dice == 4) {
                activity = "Go Fishing";
            } else if (dice == 5) {
                activity = "Call MoM";
            }
            /*if (dice == 6) {
                activity = "Back to bed";*/
                System.out.println(activity);
                //if (dice==6) keepgoing=false;
                answer=JOptionPane.showConfirmDialog(null, activity+"\n try again ?"," diceman_loop", JOptionPane.YES_NO_OPTION);
                if (answer==JOptionPane.NO_OPTION) keepgoing=false;
            }
        System.out.println("goodbye");
        }
    }

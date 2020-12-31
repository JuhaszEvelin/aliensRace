package main;

import creature.*;

import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        String days = "nffeeennf";

        Creature[] racers = createRacers();
        simulateDays(racers, 50);
        printResults(racers);
    }

    private static void printResults(Creature[] racers){
        Integer maxDistance = 0;
        for (int i = 0; i < racers.length; i++){
            if (racers[i].isAlive() && racers[i].getDistance() > maxDistance) maxDistance = racers[i].getDistance();

            System.out.println(racers[i]);
        }

        System.out.println("The winner is: ");
        for (int i = 0; i < racers.length; i++){
            if (maxDistance.equals(racers[i].getDistance())) System.out.println(racers[i].getName() + " wins with " + racers[i].getDistance() + "km");
        }
    }

    private static void simulateDays(Creature[] racers, String days){
        for (int i = 0; i < days.length(); i++){
            for (int j = 0; j < racers.length; j++){
                racers[j].oneDay("" + days.charAt(i));
            }
        }
    }
    private static void simulateDays(Creature[] racers, Integer daysOfRun){
        for (int i = 0; i < daysOfRun; i++){
            String day = generateDay();
            for (int j = 0; j < racers.length; j++){
                racers[j].oneDay(day);
            }
        }
    }


    public static Creature[] createRacers(){
        Creature[] creatures = new Creature[4];
        creatures[0] = new SandWalker("Vándor", generateStartWater());
        creatures[1] = new Stepper("Séta", generateStartWater());
        creatures[2] = new Sponge("Csúszó", generateStartWater());
        creatures[3] = new Sponge("Sikló", generateStartWater());
        
        return creatures;
    }

    public static Integer generateStartWater(){
        return (int) (Math.random() * 28) + 3;
    }
    public static String generateDay(){
        int day = (int) (Math.random() * 3);
        if (day == 0) return "n";
        if (day == 1) return "f";
        return "e";
    }
}

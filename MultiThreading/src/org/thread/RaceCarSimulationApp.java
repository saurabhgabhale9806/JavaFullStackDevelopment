/*Question2
 Race Car Simulation (Multiple Cars Racing)
In this scenario, multiple race cars (threads) race toward the finish line. Each car moves randomly with a
 different speed, and the first car to reach the finish line wins.
Scenario Overview:
Multiple cars (threads) race to the finish line. The car that reaches the finish line first wins.
*/
package org.thread;

class Car implements Runnable {
    private String name;
    private int position = 0;
    private final int FINISH_LINE = 100;
    private static boolean raceWon = false;

    public Car(String name) {
        this.name = name;
    }

    public void run() {
        int speed = 2;

        while (position < FINISH_LINE && !raceWon) {
            position += speed;
            System.out.println(name + " is at position " + position);

            if (position >= FINISH_LINE && !raceWon) {
                raceWon = true;
                System.out.println(name + " wins the race!");
            }

            try {
                Thread.sleep(200);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class RaceCarSimulationApp {
    public static void main(String[] args) {
        int numberOfCars = 5;
        Thread[] cars = new Thread[numberOfCars];

        for (int i = 0; i < numberOfCars; i++) {
            cars[i] = new Thread(new Car("Car-" + (i + 1)));
        }

        for (Thread car : cars) {
            car.start();
        }

        for (Thread car : cars) {
            try {
                car.join();
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


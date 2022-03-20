package factory;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static final int SLEEP_NIGHT = 100;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Dump dump = new Dump();
        Night night = new Night();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Scientific firstSci = new Scientific(dump, night);
        Scientific secondSci = new Scientific(dump, night);

        Future<Integer> firstSciRobots = executor.submit(firstSci);
        Future<Integer> secondSciRobots = executor.submit(secondSci);

        startNight(dump, night);

        executor.shutdown();

        Integer numberFirst = firstSciRobots.get();
        System.out.println("First Sci  " + numberFirst);
        Integer numberSecond = secondSciRobots.get();
        System.out.println("Second Sci " + numberSecond);

        if (numberFirst > numberSecond) {
            System.out.println("First Sci win");
        } else if (numberFirst < numberSecond) {
            System.out.println("Second Sci win");
        } else {
            System.out.println("Draw");
        }
    }

    private static void startNight(Dump dump, Night night) {
        do {
            night.nextNight();
            dump.getSpare();
            try {
                Thread.sleep(SLEEP_NIGHT);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!night.isLastNight());
    }
}

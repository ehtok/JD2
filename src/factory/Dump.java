package factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Dump {
    public static final int FIRST_NIGHT_COUNT = 20;
    Random random = new Random();
    public static final int RANDOM = (int) (Math.random() * 4) + 1;
    List<Spares> spares;

    public Dump() {
        spares = new ArrayList<>();
        firstNight(FIRST_NIGHT_COUNT);
    }

    public synchronized void firstNight(int number) {
        for (int i = 0; i < number; i++) {
            spares.add(Spares.getRandomSpares());
        }
    }

    public synchronized void getSpare() {
        for (int i = 0; i < RANDOM; i++) {
            spares.add(Spares.getRandomSpares());
        }
    }


    public synchronized List<Spares> giveSpare() {
        if (spares.isEmpty()) {
            return Collections.emptyList();
        }
        List<Spares> minions = new ArrayList<>();
        for (int i = 0; i < RANDOM; i++) {
            minions.add(spares.remove(random.nextInt(spares.size())));
        }

        return minions;

    }
}


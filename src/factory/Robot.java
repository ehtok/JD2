package factory;

import java.util.*;

public class Robot {


    public static final int ONE = 1;

    //создание робота из коллекции запчастей
    public static Integer build(Collection<Spares> parts) {
        final Map<Spares, Integer> robot = new HashMap<>();
        parts.forEach(spares -> {
            if (robot.containsKey(spares)) {
                robot.put(spares, robot.get(spares) + ONE);
            } else {
                robot.put(spares, ONE);
            }
        });
        List<Integer> robots = new ArrayList<>(robot.values());

        return Collections.min(robots);
    }
}

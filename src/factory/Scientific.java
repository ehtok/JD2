package factory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Scientific implements Callable<Integer> {


    private Dump dump;
    private Night night;

    public Scientific(Dump dump, Night night) {
        this.dump = dump;
        this.night = night;
    }

    @Override
    public Integer call() throws Exception {
        List<Spares> sparesList = new ArrayList<>();
        while (true) {
            night.waitForNight();
            sparesList.addAll(dump.giveSpare());
            if (night.isLastNight()) {
                return Robot.build(sparesList);
            }
        }
    }
}

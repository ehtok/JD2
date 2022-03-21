package factory;

import java.util.concurrent.CyclicBarrier;

public class Night {
    private CyclicBarrier barrier = new CyclicBarrier(3);
    private int i = 0;
    private static final int NUMBER_NIGHTS = 100;

    //ожидание пока все потоки закончат работу
    public void waitForNight() {
        try {
            barrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //увеличить значение ночи на 1 и запустить след ночь
    public void nextNight() {
        i++;
        waitForNight();
    }

    //проверка на кол-во ночей
    public boolean isLastNight() {
        return i == NUMBER_NIGHTS;
    }
}

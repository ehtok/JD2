package factory;

import java.util.Random;


//создали enum с запчастями
public enum Spares {
    HEAD, BODY, LEFT_ARM, RIGHT_ARM, LEFT_LEG, RIGHT_LEG, CPU, RAM, HDD;

    //выбираем рандомно запчасть
    public static Spares getRandomSpares() {
        Random random = new Random();
        Spares[] takeSpare = Spares.values();
        return takeSpare[random.nextInt(takeSpare.length)];
    }

}

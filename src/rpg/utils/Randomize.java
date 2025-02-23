package rpg.utils;

import java.util.Random;

public class Randomize {
    private static Random random = new Random();

    public static int getRandomInt(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    public static boolean getRandomBoolean() {
        return random.nextBoolean();
    }
}

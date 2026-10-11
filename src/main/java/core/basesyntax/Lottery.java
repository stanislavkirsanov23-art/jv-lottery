package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String randomColor = colorSupplier.getRandomColor();
        int randomBall = random.nextInt(100);

        return new Ball(randomColor, randomBall);







    }
}

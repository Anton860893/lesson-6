public class Cat extends Animals {
    private int runLength = 200;
    private double jumpHeight = 2;

    @Override
    void run(int Length) {
        if ((Length >= 0) && (Length <= runLength)) {
            System.out.println("Забег у кота был успешен.");
        } else {
            System.out.println("Кот не пробежал эту дистанцию.");
        }
    }

    @Override
    void swim(int Length) {
        System.out.println("Кот не умеет плавать.");
    }

    @Override
    void jump(double Height) {
        if ((Height >= 0) && (Height <= jumpHeight)) {
            System.out.println("Прыжок у кота был успешен.");
        } else {
            System.out.println("Кот не смог так высоко прыгнуть.");
        }
    }
}
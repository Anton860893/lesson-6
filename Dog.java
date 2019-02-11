public class Dog extends Animals {
    private int runLength = 200;
    private double jumpHeight = 0.5;
    private int swimLength = 10;

    @Override
    void run(int Length) {
        if ((Length >= 0) && (Length <= runLength)) {
            System.out.println("Забег у собаки был успешен.");
        } else {
            System.out.println("Собака не пробежала эту дистанцию.");
        }
    }

    @Override
    void swim(int Length) {
        if ((Length >= 0) && (Length <= swimLength)) {
            System.out.println("Заплыв у собаки был успешен.");
        } else {
            System.out.println("Собака не доплыла...");
        }
    }

    @Override
    void jump(double Height) {
        if ((Height >= 0) && (Height <= jumpHeight)) {
            System.out.println("Прыжок у собаки был успешен.");
        } else {
            System.out.println("Собака не смогла так высоко прыгнуть.");
        }
    }
}
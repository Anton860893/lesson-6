public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.run(100);
        cat.swim(5);
        cat.jump(3);

        dog.run(123);
        dog.swim(10);
        dog.jump(0);
    }
}
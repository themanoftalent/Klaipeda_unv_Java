public class DogRunner {
    public static void main(String[] args) {
        InhertenceContainer.Animal.Dog putty = new InhertenceContainer().new Animal().new Dog();
        putty.eat();
        putty.sleep();
        putty.move();
        putty.bark();
        putty.run();
    }


}


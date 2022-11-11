public class BirdRunner {
    public static void main(String[] args) {
        InhertenceContainer.Animal.Bird tweety = new InhertenceContainer().new Animal().new Bird();
        tweety.eat();
        tweety.sleep();
        tweety.move();
        tweety.fly();
        tweety.prey();


    }
}



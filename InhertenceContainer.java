public class InhertenceContainer {
    class Animal {
        // methods and fields
        public void eat() {
            System.out.println("Animal is eating");
        }

        public void sleep() {
            System.out.println("Animal is sleeping");
        }

        public void move() {
            System.out.println("Animal is moving");
        }

        class Dog extends Animal {
            // methods and fields
            public void bark() { // new method for Dog, not in Animal
                System.out.println("Dog is barking");
            }

            public void run() {
                System.out.println("Dog is running");
            }
        }

        class Bird extends Animal {
            // methods and fields
            public void fly() { // new method for Cat, not in Animal
                System.out.println("Bird is flying");
            }

            public void prey() {
                System.out.println("Bird is preying");
            }
        }
    }
}


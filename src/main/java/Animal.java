public class Animal {

    private static Pig pig;

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    static class Pig extends Animal {
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

    static class Dog extends Animal {
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }
}

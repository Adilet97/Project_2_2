import java.awt.print.Printable;

public class Main {
    public static void main(String[] args) {
        Corporation[] corporations = new Corporation[3];
        corporations[0] = createObject("Apple", "Steve Jobs", "Consumer Electronics");
        corporations[1] = createObject("Google", "Larry Page", "Internet services");
        corporations[2] = createObject("Microsoft", "Bill Gates", "Software");


        for (Corporation corporation : corporations) {
            if (corporation instanceof Apple) {
                Apple apple = (Apple) corporation;
                System.out.println("Apple:");
                System.out.println("Founder: " + apple.founder);
                System.out.println("Industry: " + apple.industry);
            } else if (corporation instanceof Google) {
                Google google = (Google) corporation;
                System.out.println("Google:");
                System.out.println("Founder: " + google.founder);
                System.out.println("Services: " + google.services);
            } else if (corporation instanceof Microsoft) {
                Microsoft microsoft = (Microsoft) corporation;
                System.out.println("Microsoft:");
                System.out.println("Founder: " + microsoft.founder);
                System.out.println("Subsidiaries: " + microsoft.subsidiaries);
            }
            System.out.println();
        }
    }

    public static Corporation createObject(String className, String founder, String property) {
        switch (className) {
            case "Apple":
                return new Apple(founder, property);
            case "Google":
                return new Google(founder, property);
            case "Microsoft":
                return new Microsoft(founder, property);
            default:
                throw new IllegalArgumentException("Unknown class name: " + className);
        }
    }
}
import java.util.Random;
public class random_values {
    public static void main(String[]args){

        Random random = new Random();

        int a = random.nextInt(); // -2 billion to 2 billion
        int b = random.nextInt(6); // 0 - 5
        int c = random.nextInt(6)+1; // 1 - 6

        double d = random.nextDouble(); // random value between o and 1

        boolean e = random.nextBoolean(); // Ture or False

        System.out.println("a : "+ a);
        System.out.println("b : "+ b);
        System.out.println("c : "+ c);
        System.out.println("d : "+ d);
        System.out.println("e : "+ e);

    }
}

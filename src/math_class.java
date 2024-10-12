public class math_class {
    public static void main(String[] args) {
        double x = 10.3;
        double y = 5.0;

        double a = Math.max(x, y);
        System.out.println("Maximum value: " + a);

        double b = Math.min(x, y);
        System.out.println("Minimum value: " + b);

        double z = -10;
        double c = Math.abs(z);
        System.out.println(c);

        double t = 16;
        double d = Math.sqrt(t);
        System.out.println(d);

        double s = 46.237;
        double e = Math.round(s);
        double f = Math.ceil(s);
        double g = Math.floor(s);
        System.out.println("round: "+e);
        System.out.println("ceil: "+f);
        System.out.println("floor: "+g);


    }
}
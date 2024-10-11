public class swap_two_variables {
    public static void main(String[]args){

        String x = "Water";
        String y = "Kool-Aid";

        System.out.println("x : "+x);
        System.out.println("y : "+y);

        String temp ;   // String temp = null;
        temp = x;
        x = y;
        y = temp;

        System.out.println("x : "+x);
        System.out.println("y : "+y);
    }
}

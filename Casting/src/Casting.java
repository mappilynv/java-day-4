public class Casting {
    public static void main(String[] args) {
        double first = 112.35;
        int second = (int) first;
        System.out.println("Double: " + first);
        System.out.println("int: " + second);

        String third = "49";
        int fourth = Integer.parseInt(third);
        System.out.println("The string value is: "+ third);
        System.out.println("The integer value is: "+ fourth);
    }
}

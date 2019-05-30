public class Application {
    public static void main(String[] args) {
        System.out.println(sqrt(-9));
    }
    public static double sqrt (double x)  {
           double sqr = 0;
        if (x < 0){
             throw new IllegalArgumentException("Expected non-negative number, got " + x);

        }
        try{ sqr = Math.sqrt(x);}
        catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
        return sqr;
    }
}

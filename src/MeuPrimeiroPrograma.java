import java.util.Locale;

public class MeuPrimeiroPrograma {

    public static void main(String[] args) {
        int y = 32;
        double x = 10.32434;

        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.println("You're welcome!");

        // Setting the separator to U.S. standard dot(.)
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);

        // Concatenating several elements
        System.out.println("RESULT = " + x + " Meters");
        System.out.printf("Result = %.2f meters%n", x);
    }

}

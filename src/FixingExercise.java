import java.util.Locale;

public class FixingExercise {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        // First data output
        System.out.println("Products: ");
        System.out.printf("%s, which price is $ %.2f\n", product1, price1);
        System.out.printf("%s, which price is $ %.2f\n", product2, price2);

        // Second data output
        System.out.printf("%d years old, code %d and gender: %s%n", age, code, gender);

        // Third data output
        System.out.println("Measure with eight decimal places: " + measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}

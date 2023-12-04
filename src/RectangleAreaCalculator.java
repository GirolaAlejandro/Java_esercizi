// Esercizio Calcolo area rettangolo

public class RectangleAreaCalculator {

    public static double calculateRectangleArea(double length, double width) {
        // Calcolo l'area del rettangolo usando la formula: area = lunghezza * larghezza
        double area = length * width;
        return area;
    }

    public static void main(String[] args) {
        // Chiamo il metodo calculateRectangleArea con lunghezza e larghezza appropriate
        double length = 5.0;
        double width = 3.0;

        double area = calculateRectangleArea(length, width);

        // Mostro l'area calcolata del rettangolo
        System.out.println("L'area del rettangolo è: " + area);
    }
}

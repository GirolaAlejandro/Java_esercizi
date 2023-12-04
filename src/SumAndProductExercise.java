
// Implementa due funzioni che sommino e moltiplichino tra loro due variabili di tipo intero. La prima funzione deve restituire la somma delle due variabili intere. La seconda funzione dovrebbe restituire il prodotto delle due variabili intere.
public  class SumAndProductExercise {

    int var1 = 5;
    int var2 = 10;

    public static void main(String[] args) {
        // istanzio l'oggetto calculator
        SumAndProductExercise calculator = new SumAndProductExercise();

        // chiamo le funzioni e stampo i risultati
        int sumResult = calculator.returnSum();
        int productResult = calculator.returnProduct();

        System.out.println("Sum: " + sumResult);
        System.out.println("Product: " + productResult);

    }

    // creo i metodi di somma e moltiplicazione
    public int returnSum(){
        return var1 + var2;
    }

    public int returnProduct(){
        return var1*var2;
    }

}

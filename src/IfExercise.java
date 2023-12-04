
// Esercizio IF Statement: Implementare una funzione che ritorna 1 se la variabile 'number' è maggiore di 10. Se la condizione non è rispettata, ritorna 2.

public class IfExercise {
    int number = 15;

    public static void main(String[] args) {
        IfExercise exercise = new IfExercise(); // creo un'istanza della classe IfExercise e quindi il metodo checkNumber
        int result = exercise.checkNumber();    // può essere chiamato su quell'istanza per eseguire la verifica
        System.out.println(result);
    }

    public int checkNumber(){
        if (number > 10) {
            return 1;
        } else {
            return 2;
        }
    }
}

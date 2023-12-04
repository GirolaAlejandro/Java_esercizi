import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inserisci il tuo nome: ");
        String nome = scanner.nextLine();
        System.out.print("Inserisci la tua eta: ");
        Integer eta = scanner.nextInt();
        System.out.print("ti chiami " + nome + " e hai " + eta + " anni.");

    }
}

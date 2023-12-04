import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

/* Esercizio Generics: In questo esercizio, lavorerai con "generics" in Java. Pensali come segnaposto.
 Ci consentono di scrivere codice in grado di gestire diversi tipi di dati. In questo modo, puoi creare un singolo metodo
o classe in grado di lavorare con molti tipi di dati, mantenendo il tuo codice flessibile e sicuro dal punto di vista dei tipi. */

public class Bookshelf <T>{
    private List<T> items;

    public Bookshelf() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public List<T> getItems() {
        return items;
    }

    public List<T> searchItems(String keyword, Function <T,String> fieldExtractor ) {
        List<T> results = new ArrayList<>();
        for (T item : items) {
            if (fieldExtractor.apply(item).contains(keyword)) {
                results.add(item);
            }
        }
        return results;
    }
}
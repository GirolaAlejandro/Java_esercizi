
  // Esercizio con il metodo toString()
    public class Book {

        // aggiungo due campi privati
        private String title;
        private  int pageCount;

        // creo costruttore che inizializza title e pageCount
        public Book( String title, int pageCount){
            this.title = title;
            this.pageCount = pageCount;
        }

        // faccio l'override del metodo toString
        @Override
        public String toString() {
            return String.format("Book{title='%s', pageCount=%d}", title, pageCount);
        }

        public static void main(String[] args) {

            // istanzio nuovo libro per testare la funzionalità del metodo toString
            Book book = new Book("Il piccolo principe", 245);
            System.out.println(book);
        }
    }

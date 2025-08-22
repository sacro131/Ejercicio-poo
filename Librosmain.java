import java.util.ArrayList;

public class Librosmain {
    public static void main(String[] args) {
        ArrayList<Libro> listaLibros = new ArrayList<>();
        Libro libro = new Libro("", "", "");

        libro.ingresarInformacion(listaLibros, libro);
        libro.actualizarInformacion(listaLibros, libro);
    }
}

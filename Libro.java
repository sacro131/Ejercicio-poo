import java.util.ArrayList;
import java.util.Scanner;

public class Libro {
    Scanner sc = new Scanner(System.in);
    private String titulo, autor, fechaPublicacion;

    public Libro(String titulo, String autor, String fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
    }

    public void ingresarInformacion(ArrayList<Libro> listaLibros, Libro libro) {
        String validacion;
        do {
            libro = new Libro("", "", "");

            System.out.println("Digite el título del libro:");
            libro.setTitle(sc.nextLine());

            System.out.println("Digite la fecha de publicación:");
            libro.setDatePublication(sc.nextLine());

            System.out.println("Digite el autor del libro:");
            libro.setAuthorName(sc.nextLine());

            listaLibros.add(libro);

            System.out.println("¿Quieres agregar otro libro? (si/no)");
            validacion = sc.nextLine();
        } while (validacion.equals("si"));

        for (Libro l : listaLibros) {
            System.out.println(l.getTitle() + " | " + l.getDatePublication() + " | " + l.getAuthorName());
        }
    }

    public void actualizarInformacion(ArrayList<Libro> listaLibros, Libro libro) {
        System.out.println("¿Quieres cambiar datos de un libro? (si/no)");
        String cambio = sc.nextLine();

        if (cambio.equals("si")) {
            String validacion;

            do {
                System.out.println("¿Cuál es el índice del libro a cambiar?");
                int indice = sc.nextInt();
                sc.nextLine();

                System.out.println("Digite el nuevo título:");
                listaLibros.get(indice).setTitle(sc.nextLine());

                System.out.println("Digite la nueva fecha de publicación:");
                listaLibros.get(indice).setDatePublication(sc.nextLine());

                System.out.println("Digite el nuevo autor:");
                listaLibros.get(indice).setAuthorName(sc.nextLine());

                System.out.println("¿Cambiar datos de otro libro? (si/no)");
                validacion = sc.nextLine();

            } while (validacion.equals("si"));

            for (Libro l : listaLibros) {
                System.out.println(l.getTitle() + " | " + l.getDatePublication() + " | " + l.getAuthorName());
            }

        } else {
            System.out.println("Sin cambios.");
        }
    }

    public String getTitle() {
        return titulo;
    }

    public void setTitle(String titulo) {
        this.titulo = titulo;
    }

    public String getAuthorName() {
        return autor;
    }

    public void setAuthorName(String autor) {
        this.autor = autor;
    }

    public String getDatePublication() {
        return fechaPublicacion;
    }

    public void setDatePublication(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
}

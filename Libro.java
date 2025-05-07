package src.com.poo.modelo;


/**
* Clase que representa un libro con sus características básicas.
* Permite almacenar información sobre título, autor y páginas.
*
* @author Fernanda Navarro
* @version 1.0
*/

public class Libro{

    private String titulo;
    private String autor;
    private String ISBN;
    private int ejemplaresDisponibles;


/**
 * Constructor completo para crear un libro con todos sus atributos.
 *
 * @param titulo El título del libro
 * @param autor El autor del libro
 * @param ISBN El número ISBN del libro
 * @param ejemplares La cantidad de ejemplares disponibles
 */


// Constructor
public Libro(String titulo, String autor, String ISBN, int ejemplares) {
    this.titulo = titulo;
    this.autor = autor;
    this.ISBN = ISBN;
    this.ejemplaresDisponibles = ejemplares;
}

// Métodos
public boolean prestarEjemplar() {
    if (ejemplaresDisponibles > 0) {
        ejemplaresDisponibles--;
        return true;
    }
    return false;
}

public void devolverEjemplar() {
    ejemplaresDisponibles++;
}

public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getAutor() {
    return autor;
}

public void setAutor(String autor) {
    this.autor = autor;
}

public String getISBN() {
    return ISBN;
}

public void setISBN(String iSBN) {
    ISBN = iSBN;
}

public int getEjemplaresDisponibles() {
    return ejemplaresDisponibles;
}

public void setEjemplaresDisponibles(int ejemplaresDisponibles) {
    this.ejemplaresDisponibles = ejemplaresDisponibles;
}

 // Getters

/**
     * Compara este libro con otro objeto para determinar igualdad.
     * Dos libros se consideran iguales si tienen el mismo ISBN.
     *
     * @param obj El objeto a comparar
     * @return true si son iguales, false en caso contrario
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Libro otroLibro = (Libro) obj;
        return ISBN != null && ISBN.equals(otroLibro.getISBN());
    }

    /**
     * Devuelve una representación en cadena del libro.
     *
     * @return Cadena con la información del libro formateada
     */
    @Override
    public String toString() {
        return "Libro [Título: " + titulo + ", Autor: " + autor + ", ISBN: " + ISBN +
            ", Ejemplares disponibles: " + ejemplaresDisponibles + "]";
    }
}



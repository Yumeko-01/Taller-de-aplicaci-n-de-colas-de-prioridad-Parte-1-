package co.edu.unipiloto.estdatos.tallerheap.mundo;

public class Pedido {

    // ----------------------------------
    // Atributos
    // ----------------------------------
    /**
     * Precio del pedido
     */
    private double precio;

    /**
     * Autor del pedido
     */
    private String autorPedido;

    /**
     * Cercania del pedido
     */
    private int cercania;

    // ----------------------------------
    // Constructor
    // ----------------------------------
    /**
     * Constructor del pedido TODO Defina el constructor de la clase
     */
    public Pedido() {
    }

    public Pedido(double precio, String autorPedido, int cercania) {
        this.precio = precio;
        this.autorPedido = autorPedido;
        this.cercania = cercania;
    }

    // ----------------------------------
    // Métodos
    // ----------------------------------
    /**
     * Getter del precio del pedido
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Getter del autor del pedido
     */
    public String getAutorPedido() {
        return autorPedido;
    }

    /**
     * Getter de la cercania del pedido
     */
    public int getCercania() {
        return cercania;
    }

    // TODO 
    /**
     * setter del precio del pedido
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * setter del autor del pedido
     */
    public void setAutorPedido(String autorPedido) {
        this.autorPedido = autorPedido;
    }

    /**
     * setter de la cercania del pedido
     */
    public void setCercania(int cercania) {
        this.cercania = cercania;
    }

}

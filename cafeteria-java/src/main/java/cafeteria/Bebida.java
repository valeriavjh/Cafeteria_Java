package cafeteria;

public class Bebida extends Producto{


    public enum Tamanio{
        PEQUENIO, MEDIANO, GRANDE
    }
    private Tamanio tamanio;


    public Bebida(String nombre, String categoria, Double precio, Tamanio tamanio) {
        super(nombre, categoria, precio);
        this.tamanio = tamanio;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bebida{");
        sb.append("precio=").append(precio);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", categoria='").append(categoria).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

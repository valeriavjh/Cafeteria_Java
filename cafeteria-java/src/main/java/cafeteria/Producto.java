package cafeteria;

public abstract class Producto {

    protected String nombre;
    protected Double precio;
    protected String categoria;

    public Producto(String nombre, String categoria, Double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio(){
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Producto{");
        sb.append("categoria='").append(categoria).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}

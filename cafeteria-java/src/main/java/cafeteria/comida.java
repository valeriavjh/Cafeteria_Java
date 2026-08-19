package cafeteria;

public class comida extends Producto {

    private boolean esCaliente;
    private boolean esDulce;
    private String mensaje;

    public comida(String nombre, String categoria, Double precio, boolean esDulce, boolean esCaliente) {
        super(nombre, categoria, precio);
        this.esDulce = esDulce;
        this.esCaliente = esCaliente;
    }

    public boolean isEsDulce(boolean esDulce) {
        if (esDulce){
            String mensaje  = "Plato dulce";
        }else{
            String mensaje  = "Plato salado";
        }
        return mensaje;
    }

    public boolean isEsCaliente() {
        return esCaliente;
    }

    public void setEsDulce(boolean esDulce) {
        this.esDulce = esDulce;
    }

    public void setEsCaliente(boolean esCaliente) {
        this.esCaliente = esCaliente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("comida{");
        sb.append("precio=").append(precio);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", categoria='").append(categoria).append('\'');
        sb.append(", Plato Dulce=").append(esDulce);
        sb.append(", Plato Caliente=").append(esCaliente);
        sb.append('}');
        return sb.toString();
    }
}




public class Compra {
    //Atributes
    private int cantidadProductos;
    private double precioTotal;
    private double descuentoTotal;
    private double precioFinal;

    private String fecha;


    //Constructeres
    public Compra(String fecha) {
        this.fecha = fecha;
        this.cantidadProductos = 0;
        this.precioTotal = 0.0;
        this.descuentoTotal = 0.0;
        this.precioFinal = 0.0;
    }

    public Compra() {
        this.cantidadProductos = 0;
        this.precioTotal = 0.0;
        this.descuentoTotal = 0.0;
        this.precioFinal = 0.0;
    }



    //Getter y setter
    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal += precioTotal;
    }

    public double getDescuentoTotal() {
        return descuentoTotal;
    }

    public void setDescuentoTotal(double descuentoTotal) {
        this.descuentoTotal = descuentoTotal;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }


}

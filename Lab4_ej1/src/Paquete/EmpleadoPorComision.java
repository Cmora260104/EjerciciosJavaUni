
package Paquete;

public class EmpleadoPorComision extends Empleado {
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(double ventasBrutas, double tarifaComision, String nombre, String apellido, String seguroSocial) {
        super(nombre, apellido, seguroSocial);
        if (ventasBrutas < 0.0) {
            throw new IllegalArgumentException("ventas brutas deben ser mayor que 0.0");
        }
        if (tarifaComision <= 0.0 || tarifaComision > 1.0) {
             throw new IllegalArgumentException("La tarifa de comision debe de estar entre 0 y 1");
        }
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public void setVentasBrutas(double ventasBrutas) {
        if (ventasBrutas < 0.0) {
             throw new IllegalArgumentException("ventas brutas deben ser mayor que 0.0");
        }
        this.ventasBrutas = ventasBrutas;
    }

    public void setTarifaComision(double tarifaComision) {
        if (tarifaComision <= 0.0 || tarifaComision > 1.1) {
             throw new IllegalArgumentException("La tarifa de comision debe de estar entre 0 y 1");
        }
        this.tarifaComision = tarifaComision;
    }
    
    public double ingresos(){
        return ventasBrutas * tarifaComision;
    }
    
    @Override
    public String toString(){
        return super.toString() + String.format("%n%s: %.2f%n%s: %.2f","ventas brutas: ",ventasBrutas,
                "Tarifa por comision: ",tarifaComision);
    }
    
    
    
    
    
}

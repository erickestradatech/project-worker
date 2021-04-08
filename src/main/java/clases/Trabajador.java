package clases;

import java.text.DecimalFormat;

public class Trabajador {

    private String codigo; // Generar desde T001
    private String nombre;
    private double sueldoBruto;

    static int cuenta = 1;

    public Trabajador(String nombre, double sueldoBruto) {

        DecimalFormat sd = new DecimalFormat("0000");
        this.codigo = "T" + sd.format(cuenta);
        this.nombre = nombre;
        this.sueldoBruto = sueldoBruto;
        cuenta++;
    }

    public double sueldoNeto() {

        return 0.75 * sueldoBruto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

}

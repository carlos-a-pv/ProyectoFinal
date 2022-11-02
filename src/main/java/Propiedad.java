import java.util.List;

public class Propiedad {

    private String dirrecion;
    private double valor;
    private float area;
    private Propietario propietario;

    public Propiedad(String dirrecion, double valor, float area, Propietario propietario) {
        this.dirrecion = dirrecion;
        this.valor = valor;
        this.area = area;
        this.propietario = propietario;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

}

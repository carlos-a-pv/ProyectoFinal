import java.util.List;

public class Empleado extends Usuario {

	private boolean estado = true;
    public Empleado(String nombre, String userId, String password, boolean estado) {
        super(nombre, userId, password);
        this.estado=estado;
    }

	@Override
	public String toString() {
		return "Empleado [getNombre()=" + getNombre() + ", getUserId()=" + getUserId() + ", getPassword()="
				+ getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}


}

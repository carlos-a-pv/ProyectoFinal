import java.util.List;

public class Empleado extends Usuario {

    public Empleado(String nombre, String userId, String password) {
        super(nombre, userId, password);

    }
	private  boolean estado = true;

	public Empleado(String nombre, String userId, String password, boolean estado) {
		super(nombre, userId, password);
		this.estado = estado;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Empleado [getNombre()=" + getNombre() + ", getUserId()=" + getUserId() + ", getPassword()="
				+ getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


}

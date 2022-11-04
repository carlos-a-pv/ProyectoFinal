import java.util.List;

public class Empleado extends Usuario {

    public Empleado(String nombre, String userId, String password,Rol cargo) {
        super(nombre, userId, password,cargo);
    }

	@Override
	public String toString() {
		return "Empleado [getNombre()=" + getNombre() + ", getUserId()=" + getUserId() + ", getPassword()="
				+ getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


}

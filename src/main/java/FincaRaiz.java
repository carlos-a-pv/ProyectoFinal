import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class FincaRaiz {

    private List<Propiedad> propiedades;
    private List <Cliente> clientes;
    private List <Empleado> empleados;
    private List <Administrador> administradores;

    private List <Transaccion> transacciones;

    public FincaRaiz(){
        propiedades = new ArrayList<>();
        empleados = new ArrayList<>();
        clientes = new ArrayList<>();
        administradores = new ArrayList<>();
        transacciones = new ArrayList<>();
    }

    public List<Propiedad> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(List<Propiedad> propiedades) {
        this.propiedades = propiedades;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(List<Administrador> administradores) {
        this.administradores = administradores;
    }
    public void registrarPropiedad(Propiedad propiedad, Usuario usuario) throws Exception {

        if (usuario instanceof Empleado) {
            String dirrecion1 = propiedad.getDirecion();
            Propiedad propiedaAux = propiedades.stream().filter(propiedades -> propiedades.getDirecion() == dirrecion1).findFirst().orElse(null);
            if (propiedaAux != null) {
                throw new Exception("La propiedad ya existe");
            } else if (propiedad != null) {

                propiedades.add(propiedad);
            
            } else {
                throw new Exception("Datos invalidos");
            }
        }
        else {
            throw new Exception("Solo los empleados pueden registrar propiedades");

        }
        }
    public void registrarPropietarioPropietarios(Propietario propietario,Exception e){


    }
    public void registrarCliente (Cliente cliente,Exception e){


    }
    public void alquilar (Propiedad propiedad,Exception e){


    }
    public void vender (Propiedad propiedad,Exception e){


    }
    public void retirarPropiedad (Propiedad propiedad){
    	
    	


    }

    public void registrarTransacciones (Transaccion transaccion) throws Exception {
        if (transaccion.estadoTransaccion == true) {
            transacciones.add(transaccion);
        }else {
            throw new Exception("La transaccion no se ha realizado");
        }
    }
    public List<String> buscarPropiedad(String propiedad){
    	
        return propiedades.stream().map( (propiedad1) -> {
            return propiedad1.getClass().getSimpleName();
        }).filter( (propiedad1)-> {
            return propiedad1.equalsIgnoreCase(propiedad);
        }).collect(Collectors.toList());
        
        //lista.stream

    	// switch (propiedad) {
		// case "Parqueadero":
		// 	return	propiedades.stream().filter(propiedad1 ->propiedad1 instanceof Parqueadero).collect(Collectors.toList());

		// case "Bodega":
		// 	return	propiedades.stream().filter(propiedad1 ->propiedad1 instanceof Bodega).collect(Collectors.toList());

		// case "Edificio":
		// 	return	propiedades.stream().filter(propiedad1 ->propiedad1 instanceof Edificio).collect(Collectors.toList());

		// case "Vivienda":
		// 	return	propiedades.stream().filter(propiedad1 ->propiedad1 instanceof Vivienda).collect(Collectors.toList());

		// case "Lote":
		// 	return	propiedades.stream().filter(propiedad1 ->propiedad1 instanceof Lote).collect(Collectors.toList());
		// default:
		// 	break;
		// }

    	// 	return null;
    }
    public void alquilar(){



    }
    public void comprar(Propiedad propiedad){

    	propiedades.remove(propiedad);
    	
    }
    public void registrarEmpleado(Empleado empleado, Exception e){

    	empleados.add(empleado);


    }
    public void visualizarReportes (DateFormat periodo, Exception e){


    }
    public void bloquearCuenta(Usuario usuario,Empleado empleado){
    	
    		if (usuario instanceof Administrador) {
                Empleado empleadoAux = empleado;
                empleado = empleados.stream().filter(empleados -> empleados.getUserId() == empleadoAux.getUserId()).findFirst().orElse(null);
                if (empleado != null) {
                    empleado.setEstado(false);
                }else {
                    System.out.println("Datos invalidos.");
                }
    		}
    		else {
    			System.out.println("Solo los administradores pueden bloquear cuentas");
    		}
    }



    public void actualizarDatosEmpleado(Usuario usuario, Empleado empleado, String nombre, String userId, String password, boolean estado) throws Exception {

        if (usuario instanceof Administrador) {
            Empleado empleadoAux = empleado;
            empleado = empleados.stream().filter(empleados -> empleados.getUserId() == empleadoAux.getUserId()).findFirst().orElse(null);
            if (empleado != null) {
                empleado.setNombre(nombre);
                empleado.setUserId(userId);
                empleado.setPassword(password);
                empleado.setEstado(estado);
            }
        } else {
            throw new Exception("Solo los administradores pueden actualizar empleados");
        }
    }


}

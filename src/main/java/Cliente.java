import java.util.List;

public class Cliente extends Usuario {

    public Cliente(String nombre, String userId, String password) {
        super(nombre, userId, password);
    }

    public List <Propiedad>  buscarPropiedad(Propiedad propiedad){

        //Esta clase segun eso es facil, es un filtro que se aplica la lista de propiedades que esta en finca raiz
        //para hacer una nueva lista de las propiedades con el tipo de propiedad que vengan por parametro
        return null;
    }
    public void alquilar(){


    }
    public void comprar(){


    }
}

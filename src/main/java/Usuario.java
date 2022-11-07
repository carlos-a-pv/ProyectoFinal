public class Usuario {
    private String nombre;
    private String userId;
    private String password;

    public Usuario(String nombre, String userId, String password) {
        this.nombre = nombre;
        this.userId = userId;
        this.password = password;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

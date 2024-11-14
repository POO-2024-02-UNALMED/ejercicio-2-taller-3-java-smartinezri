package **;     //gestionHumana

public class Empleado {

    ** final long cedula;       //public
    ** String nombre;       //public
    ** String cargo;        //public
    
    public Empleado(long cedula, String nombre, String cargo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    ** boolean tengoPermiso() {     //public
        return cargo.contains("Administrador");
    }
}
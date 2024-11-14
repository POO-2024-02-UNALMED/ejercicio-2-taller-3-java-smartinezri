package compras;

public class Producto {
    
    ** final int codigo;        //private
    ** String nombre;       //private
    ** String tipo;     //public
    ** static int totalProductosPedidos;    //private

    ** Producto(int codigo, String nombre, String tipo) {       //public
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    ** void imprimirNombre() {      //public
        System.out.print(nombre);
    }

    public void setCodigo(int codigo) {
        **      //this.codigo = codigo;
    }

    public ** getCodigo() {     //int
        return codigo;
    }

    ** static int getTotalProductosPedidos() {      //public
        return totalProductosPedidos;
    }
}
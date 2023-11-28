public class Perro extends Mascota{
    private String amistoso;

    //Metodos

    //Constructor
    public Perro(String codigoMascota, String nombre, String fechaNacimiento, String amistoso) {
        super (codigoMascota, nombre,fechaNacimiento);
        this.amistoso=amistoso;
    }

    public String getAmistoso() {
        return  amistoso;
    }
    public void setAmistoso(String amistoso) {
        this.amistoso=amistoso;
    }

}

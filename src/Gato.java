public class Gato extends Mascota{
    private String leucemia;

    //Metodos

    //Constructor
    public Gato(String codigoMascota, String nombre, String fechaNacimiento, String leucemia) {
        super(codigoMascota, nombre, fechaNacimiento);
        this.leucemia = leucemia;
    }
    public String getLeucemia() {
        return leucemia;
    }
    public void setLeucemia(String leucemia) {
        this.leucemia=leucemia;
    }
}

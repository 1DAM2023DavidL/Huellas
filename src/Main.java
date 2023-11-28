public class Main {
    //Perros
    Perro perro1 = new Perro("001","Perro1","27/11/2023","Si");
    Perro perro2 = new Perro("003","Perro2","27/11/2023","No");

    //Gatos
    Gato gato1 = new Gato("002","Gato1","27/11/2023","No tiene");
    Gato gato2 = new Gato("004","Gato2","27/11/2023","Si tiene");

    //Personas
    Persona persona1 = new Persona("Marcos","persona1","12345678A","123456789");
    Persona persona2 = new Persona("Sara","persona2","98765432F","456781293");

    //Adopciones
    Adopcion adopcion1 = new Adopcion("001","28/11/2023",perro1,null,persona1);
    Adopcion adopcion2 = new Adopcion("002","28/11/2023",null,gato2,persona2);
}
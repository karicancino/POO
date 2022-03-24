
public class Profesor extends Persona{
    public int idprofesor;
    public String profesion;
    
    public Profesor()
    {
        idprofesor=0;
        profesion=null;
    }
    
    public void imprimir() 
    {
        System.out.println("Es un profesor.");
    }
    
    public void listarProfesores()
    {
        System.out.println(idprofesor);
        System.out.println(nombre);
        System.out.println(direccion);
        System.out.println(genero);
        System.out.println(profesion);
    }
}

public class ProfesorTitular extends Profesor{
    int anios=0;
    
    @Override
    public void imprimir() 
    {
        System.out.println("Es un profesor titular.");
    }
    
    public void imprimirAnios() 
    {
        System.out.println("Años = " + anios);
    }
}

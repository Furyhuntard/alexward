package tareadeprogra;
import java.util.Scanner;
/**
 * 
 * @author Alumno
 *
 */
import java.util.Scanner;
/**
 * 
 * @author Alumno
 *
 */
public class EstacionClimatica
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int a�o;
    private TempHumDia mediciones[];  // Tabla de mediciones
    private int diasMeses[] = {30,28,30,31,30,31,31,31,30,31,30,31};
    private int nummediciones;      // N�mero de mediciones almacenadas
    /**
     * Constructor for objects of class EstacionClimatica
     */
    public EstacionClimatica()
    {
         this.nombre = "";
         this.a�o = 2018;  
         mediciones = new TempHumDia[366];  // Por si el a�o es bisiesto.  
         nummediciones = 0;
    }
    /**
     * 
     * @param nombre
     * @param a�o
     */
    
    
    public EstacionClimatica( String nombre, int a�o)
    {
         this(); // Llamo al constructor por defecto
         this.nombre = nombre;
         this.a�o = a�o;
         
    }
 
    /**
     * @param medida
     * @return
     */
    public boolean addDia (TempHumDia medida){
    	boolean diaDevuelto = false;
    	if (medida.getA�o()!=a�o)
    	{
    		System.out.println("Error al insertar fecha");
    		return false;
    		
    	}
    	else
    	{
    		for (int i=0;i<mediciones.length;i++)
        	{
        		if (mediciones[i] == null)
        		{
        			mediciones[i] = medida;
        			diaDevuelto = true;
        			System.out.println("Fecha insertada");
        			break;
        		}
        	}
    		
    	}
  
    	
        return diaDevuelto; 
        
    } /**
     * @param media
     * @return
     */
    public boolean delDia ( TempHumDia media){
    	boolean diaBorrado = false;
    	for (int i=0;i<mediciones.length;i++) {
    		if (mediciones[i]!=null) {
    			
    			if (mediciones[i].getA�o()==media.getA�o() && mediciones[i].getMes()==media.getMes() && mediciones[i].getDia()==media.getDia())
    			{
    				mediciones[i] = null;
    				diaBorrado = true;
    			}
    		}
    	}
        return diaBorrado; 
    }
    
  
    public void listarDias(){
        for (int i = 0;i<mediciones.length;i++)
        {
        	if(mediciones[i]!=null)
        	{
        		System.out.println(mediciones[i]);
        	}
        }
    }

	/**
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return
	 */
	public int getA�o() {
		return a�o;
	}

	/**
	 * @param a�o
	 */
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	
	/**
	 * @param dia
	 * @param mes
	 * @param a�o
	 * @return
	 */
	public boolean fechaOK ( int dia, int mes, int a�o) {
	if (dia<=0 || mes <=0 || a�o <=0 || mes>12)
	{
		return false;
	}
	if (mes==2)
	{
		if (a�o %400 == 0 && dia >29)
		{
			return false;
		}
		if (a�o %100==0 && dia >28)
		{
			return false;
		}
		if (a�o %4 ==0 && dia>29)
		{
			return false;
		}
	}
	else
	{
		if(dia>diasMeses[mes-1])
		{
			return false;
		}
	}
	return true;
	}

	/**
	 * @return
	 */
	public TempHumDia leerMedida () {

        Scanner leer = new Scanner(System.in);
        int dia,mes,a�o, tempmax, tempmin, hummax, hummin;
        TempHumDia  medicion = null;
        
       boolean error = true;
       do {
       System.out.println("D�a:"); dia = leer.nextInt();
       System.out.println("Mes:");  mes = leer.nextInt();
       System.out.println("A�o:");  a�o = leer.nextInt();
 
       if ( fechaOK( dia,mes,a�o) ) {
            System.out.println ( " T� M�xima:"); tempmax = leer.nextInt();
            System.out.println ( " T� M�nima:"); tempmin = leer.nextInt();
            System.out.println ( " H� M�xima:"); hummax = leer.nextInt();
            System.out.println ( " H� M�nima:"); hummin = leer.nextInt();
            medicion = new TempHumDia ( dia,mes,a�o, tempmax, tempmin, hummax, hummin);
            error = false;
           }
       else
       {
           System.out.println(" Fecha �rronea");
       }
   
   } while (  error);
   
   return medicion;
}

}


    

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
    private int año;
    private TempHumDia mediciones[];  // Tabla de mediciones
    private int diasMeses[] = {30,28,30,31,30,31,31,31,30,31,30,31};
    private int nummediciones;      // Número de mediciones almacenadas
    /**
     * Constructor for objects of class EstacionClimatica
     */
    public EstacionClimatica()
    {
         this.nombre = "";
         this.año = 2018;  
         mediciones = new TempHumDia[366];  // Por si el año es bisiesto.  
         nummediciones = 0;
    }
    /**
     * 
     * @param nombre
     * @param año
     */
    
    
    public EstacionClimatica( String nombre, int año)
    {
         this(); // Llamo al constructor por defecto
         this.nombre = nombre;
         this.año = año;
         
    }
 
    /**
     * @param medida
     * @return
     */
    public boolean addDia (TempHumDia medida){
    	boolean diaDevuelto = false;
    	if (medida.getAño()!=año)
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
    			
    			if (mediciones[i].getAño()==media.getAño() && mediciones[i].getMes()==media.getMes() && mediciones[i].getDia()==media.getDia())
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
	public int getAño() {
		return año;
	}

	/**
	 * @param año
	 */
	public void setAño(int año) {
		this.año = año;
	}
	
	/**
	 * @param dia
	 * @param mes
	 * @param año
	 * @return
	 */
	public boolean fechaOK ( int dia, int mes, int año) {
	if (dia<=0 || mes <=0 || año <=0 || mes>12)
	{
		return false;
	}
	if (mes==2)
	{
		if (año %400 == 0 && dia >29)
		{
			return false;
		}
		if (año %100==0 && dia >28)
		{
			return false;
		}
		if (año %4 ==0 && dia>29)
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
        int dia,mes,año, tempmax, tempmin, hummax, hummin;
        TempHumDia  medicion = null;
        
       boolean error = true;
       do {
       System.out.println("Día:"); dia = leer.nextInt();
       System.out.println("Mes:");  mes = leer.nextInt();
       System.out.println("Año:");  año = leer.nextInt();
 
       if ( fechaOK( dia,mes,año) ) {
            System.out.println ( " Tº Máxima:"); tempmax = leer.nextInt();
            System.out.println ( " Tº Mínima:"); tempmin = leer.nextInt();
            System.out.println ( " Hº Máxima:"); hummax = leer.nextInt();
            System.out.println ( " Hº Mínima:"); hummin = leer.nextInt();
            medicion = new TempHumDia ( dia,mes,año, tempmax, tempmin, hummax, hummin);
            error = false;
           }
       else
       {
           System.out.println(" Fecha érronea");
       }
   
   } while (  error);
   
   return medicion;
}

}


    

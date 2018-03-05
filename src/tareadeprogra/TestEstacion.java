package tareadeprogra;

class TestEstacion {
public static void main (  String [] argv ){
    
    EstacionClimatica estación  = new EstacionClimatica("Burgos",2017);
   

    System.out.println(" Introducir 5 medidas :");
    for (int i=0; i< 1; i++){
        TempHumDia  medicion = estación.leerMedida ();
        estación.addDia( medicion);
   }
   
  estación.listarDias();
   
  System.out.println("Introduca 2 medidas a Borrar:");
  TempHumDia  medida1 = estación.leerMedida();
  TempHumDia  medida2 = estación.leerMedida();
  
  estación.delDia(medida1);
  estación.delDia(medida2);

  
  estación.listarDias();      
        
    }
    
        
}
package tareadeprogra;

class TestEstacion {
public static void main (  String [] argv ){
    
    EstacionClimatica estaci�n  = new EstacionClimatica("Burgos",2017);
   

    System.out.println(" Introducir 5 medidas :");
    for (int i=0; i< 1; i++){
        TempHumDia  medicion = estaci�n.leerMedida ();
        estaci�n.addDia( medicion);
   }
   
  estaci�n.listarDias();
   
  System.out.println("Introduca 2 medidas a Borrar:");
  TempHumDia  medida1 = estaci�n.leerMedida();
  TempHumDia  medida2 = estaci�n.leerMedida();
  
  estaci�n.delDia(medida1);
  estaci�n.delDia(medida2);

  
  estaci�n.listarDias();      
        
    }
    
        
}
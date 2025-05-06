package aplicacion;

import libProceso.JavaProceso;

public class Aplicacion{

    //Declaramos un objeto que represente a la biblioteca
    JavaProceso proceso_SJF = null;

    static{
      System.loadLibrary("sjf");
    }

    public Aplicacion(){
      this.proceso_SJF = new JavaProceso();

      String json = "{"
                + "  \"procesos\": ["
                + "    { \"id\": 1, \"llegada\": 0, \"rafaga\": 10, \"prioridad\": 3 },"
                + "    { \"id\": 2, \"llegada\": 2, \"rafaga\": 8, \"prioridad\": 2 },"
                + "    { \"id\": 3, \"llegada\": 4, \"rafaga\": 6, \"prioridad\": 1 },"
                + "    { \"id\": 4, \"llegada\": 6, \"rafaga\": 4, \"prioridad\": 1 },"
                + "    { \"id\": 5, \"llegada\": 8, \"rafaga\": 2, \"prioridad\": 1 }"
                + "  ]"
                + "}";

      System.out.println("Algoritmo primero el trabajo mas corto no expulsivo:" + proceso_SJF.algoritmo_SJF_no_expulsivo(json));
      System.out.println("Algoritmo primero el trabajo mas corto expulsivo:" + proceso_SJF.algoritmo_SJF_expulsivo(json));

    }
   public static void main (String[] args){
     new Aplicacion();
   }
}

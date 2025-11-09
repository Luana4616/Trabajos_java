
package tp_1;
import java.util.Scanner;


public class Ejercicio3 {
  
    public static void main(String[] args) {
        double sumaTotal = 0;
        double precio = 0;
         Scanner ingresor = new Scanner(System.in);
         System.out.print("ingrese la cantidad total de los productos");
         int limite = ingresor.nextInt();
          int[] cantidades = new int[limite];
          double[] costos = new double[limite];
          double[] preciostot = new double[limite];
          for (int i=0; i< limite;i++){
              System.out.print("ingrese la cantidad de producto: "+(i+1)+":");
              cantidades[i]= ingresor.nextInt();
              System.out.print("ingrese el costo unitario del producto"+(i+1)+":");
              costos[i]= ingresor.nextDouble();
              preciostot[i] = cantidades[i]*costos[i];
              sumaTotal+=preciostot[i];
              if(preciostot[i]> precio){
                  precio = preciostot[i];
              }
              
          }
          System.out.println("RESULTADOS");
          for(int i = 0; i<limite; i++){
              System.out.println("producto"+(i+1)+":"+preciostot[i]);
          }
          System.out.println("Precio total de todoss los productos:"+sumaTotal);
         System.out.println("Productos que superan los 1000: ");
         boolean hayMayores=false;
         for(int i=0; i<limite;i++){
             if(preciostot[i]>1000){
                 System.out.println("Producto"+(i+1)+""+preciostot[i]);
                 hayMayores= true;
             }
         }
         if(!hayMayores){
             System.out.println("Ninguno supera los 1000.");
         }
    }
    
}
 


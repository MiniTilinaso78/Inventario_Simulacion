public class Producto {
   int codigo;
   String nombre;
   double precioUnitario;
   int stock;
   public void reabastecer(int cantidad){
       this.stock+=cantidad;
   }
   public boolean vender(int cantidad){
       String reporte= """
               Producto: %s
               Cantidad: %d
               Total: %f
               """;
       if (this.stock>=cantidad){
           this.stock-=cantidad;
           System.out.println(reporte.formatted(this.nombre,cantidad,cantidad*this.precioUnitario));
           return true;
       }else{
           System.out.println("Stock insuficiente ");
           return false;
       }
   }
   public double calcularValorInventario(){
       return this.stock*this.precioUnitario;
   }
}

public class MainProducto {
    public static void main(String[] args){
        Producto p1 = new Producto();
        Producto p2 = new Producto();
        p1.nombre="Café";
        p2.nombre="Pan";
        p1.precioUnitario=15.5;
        p2.precioUnitario=10.7;
        p1.stock=39;
        p2.stock=40;
        p1.vender(27);
        p2.vender(19);
        p1.reabastecer(16);
        p2.reabastecer(30);
        String reporte = """
                La del valor de inventari es: %f
                de los productos: %s y %s
                  """;
        System.out.println(reporte.formatted(p1.calcularValorInventario()+ p2.calcularValorInventario(),p1.nombre,p2.nombre));

    }
}

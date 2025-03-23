public class Prueba {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Dole");
        empresa.agregarProducto(new Producto(0, "Banana", 10000));
        empresa.agregarProducto(new Producto(1, "Manzana", 15000));
        empresa.agregarEmpleado(new Empleado("Andres", "(223) 520-3442", "andres.efstratiadis@gmail.com"));
        empresa.agregarPedido(new Pedido("1/4/2025"));
        empresa.getPedidos().get(0).setResponsable(empresa.getPersonal().get(0));
        empresa.getPedidos().get(0).agregarLineaDePedido(new LineaDePedido(empresa.getProductos().get(0), 5));
        empresa.getPedidos().get(0).agregarLineaDePedido(new LineaDePedido(empresa.getProductos().get(1), 7));
        System.out.println(empresa.getPersonal().get(0).getCostoTotal(empresa.getPedidos().get(0)));
    }
}

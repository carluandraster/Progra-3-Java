public class Prueba {
    public static void main(String[] args) {
        Empresa empresa = Empresa.getInstancia();
        Departamento d1, d2;
        Intermedio e1, e7;
        EmpleadoTemporario e2, e3;
        Experto e4;
        Principiante e5, e6;

        // Departamento de Mantenimiento
        d1 = new Departamento("Departamento de Mantenimiento");
        empresa.agregarDepartamento(d1);
        e1 = new Intermedio("Juan Perez", 1234, "Matheu 2343");
        e1.setAntiguedad(7);
        e1.setSueldoBase(12000);
        d1.agregarEmpleado(e1);
        e2 = new EmpleadoTemporario("Julio Garcia", 3209, "Colon 5561");
        e2.setSueldoPorHora(80);
        e2.setHorasTrabajadas(160);
        d1.agregarEmpleado(e2);
        e3 = new EmpleadoTemporario("Martin Roriguez", 3210, "Mitre 3451");
        e3.setSueldoPorHora(70);
        e3.setHorasTrabajadas(100);
        d1.agregarEmpleado(e3);

        // Departamento de Contabilidad
        d2 = new Departamento("Departamento de Contabilidad");
        empresa.agregarDepartamento(d2);
        e4 = new Experto("Mara Anchorena", 9876, "Luro 3489");
        e4.setAntiguedad(18);
        e4.setSueldoBase(13000);
        d2.agregarEmpleado(e4);
        e5 = new Principiante("Sandra Fernandez", 1276, "Cordoba 3843");
        e5.setAntiguedad(6);
        e5.setSueldoBase(11500);
        d2.agregarEmpleado(e5);
        e6 = new Principiante("Luis Gomez", 1544, "Formosa 2354");
        e6.setAntiguedad(2);
        e6.setSueldoBase(10500);
        d2.agregarEmpleado(e6);
        e7 = new Intermedio("Lucas Benitez", 1634, "Castelli 4563");
        e7.setAntiguedad(12);
        d2.agregarEmpleado(e7);

        System.out.println(empresa);
    }
}

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate todaysDate = LocalDate.now();
        //instancias
        Empresa minTic_G5=new Empresa();
        Empleado emp =  new Empleado();
        movimientoDinero mov = new movimientoDinero();

        //set values class empresa
        minTic_G5.setNombre("Desarrolladores G5");
        minTic_G5.setDireccion("Cra 4 122-78");
        minTic_G5.setTelefono("3173797793");
        minTic_G5.setNit("9005644-1");

        //set values class empleado
        emp.setNombre("juan");
        emp.setCorreo("juan@decsg5.com");
        emp.setRol("dev junior");
        emp.setEmpresaPertenece("Desarolladores G5");


        //set values class moviento dinero
        mov.setMovimientoMonto(100.000);
        mov.setMontonNegativo(10.000);
        mov.setMontoPositivo(30.000);
        mov.setconceptoMovimiento("Pago nomina");

        System.out.println("*** BIENVENIDO A "+ minTic_G5.getNombre()+"***");
        System.out.println("EMPRESA : ");
        System.out.println("La empresa "+ minTic_G5.getNombre() + " ubicada en la ciudad de Medellin " + " en la direccion : " + minTic_G5.getDireccion() +
                " con NIT "+ minTic_G5.getNit() + " se dedica a la produccion de software de calidad " + " Tel. contacto " + minTic_G5.getTelefono());

        System.out.println();

        System.out.println("EMPLEADO :");
        System.out.println("el empleado "+emp.getNombre()+" con el correo "+emp.getCorreo() + " en el cargo "+emp.getRol()
        + " de la empresa " + emp.getEmpresaPertenece());

        System.out.println();

        System.out.println("MOVIMIENTOS :");
        System.out.println("La consignacion realizada " +todaysDate + " por un valor de " + mov.getMontoPositivo() +
                "\n" + " para un saldo total de " +  mov.getMovimientoMonto() +  " realizado por " + emp.getNombre());
        System.out.println();
        System.out.println(" El retiro realizado el día " + todaysDate + " por un valor de "+ mov.getMontonNegativo());
        System.out.println();
        System.out.println(" Concepto : " +mov.getconceptoMovimiento() + " Realizado el " + todaysDate + " por un valor de "
                + mov.getMontoPositivo() +  " realizado por " + emp.getNombre());


        //set values class empresa
        minTic_G5.setNombre("MintTic G5");
        minTic_G5.setDireccion("Calle 45 # 90 - 49");
        minTic_G5.setTelefono("3192988918");
        minTic_G5.setNit("900969726-3");

        //set values class empleado
        emp.setNombre("Carlos");
        emp.setCorreo("Carlos@correo.com");
        emp.setRol("Dev Senior");
        emp.setEmpresaPertenece("MinTic G5");


        //set values class moviento dinero
        mov.setMovimientoMonto(100.000);
        mov.setMontonNegativo(10.000);
        mov.setMontoPositivo(30.000);
        mov.setconceptoMovimiento("Pago de vacaciones");

        System.out.println("*** BIENVENIDO A "+ minTic_G5.getNombre()+"***");
        System.out.println("EMPRESA : ");
        System.out.println("La empresa "+ minTic_G5.getNombre() + " ubicada en la ciudad de Medellin " + " en la direccion : " + minTic_G5.getDireccion() +
                " con NIT "+ minTic_G5.getNit() + " se dedica a la produccion de software de calidad " + " Tel. contacto " + minTic_G5.getTelefono());

        System.out.println();

        System.out.println("EMPLEADO :");
        System.out.println("el empleado "+emp.getNombre()+" con el correo "+emp.getCorreo() + " en el cargo "+emp.getRol()
                + " de la empresa " + emp.getEmpresaPertenece());

        System.out.println();

        System.out.println("MOVIMIENTOS :");
        System.out.println("La consignacion realizada " +todaysDate + " por un valor de " + mov.getMontoPositivo() +
                "\n" + " para un saldo total de " +  mov.getMovimientoMonto() +  " realizado por " + emp.getNombre());
        System.out.println();
        System.out.println(" El retiro realizado el día " + todaysDate + " por un valor de "+ mov.getMontonNegativo());
        System.out.println();
        System.out.println(" Concepto : " +mov.getconceptoMovimiento() + " Realizado el " + todaysDate + " por un valor de "
                + mov.getMontoPositivo() +  " realizado por " + emp.getNombre());

    }
}
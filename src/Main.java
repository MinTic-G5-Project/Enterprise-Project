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

        System.out.println("***BIENVENIDO A "+ minTic_G5.getNombre()+"***");
        System.out.println("EMPRESA : ");
        System.out.println("La empresa "+ minTic_G5.getNombre() + " ubicada en la ciudad de Medellin, con NIT "
                            + minTic_G5.getNit() + "se dedica a la produccion de software de calidad");

        System.out.println("EMPLEADO :");
        System.out.println("el empleado"+emp.getNombre()+" con el correo"+emp.getCorreo() + " en el cargo"+emp.getRol()
        + " de la empresa" + emp.getEmpresaPertenece());

        System.out.println("MOVIMIENTOS :");
        System.out.println("El movimiento realizado" +todaysDate + " con un valor de " + mov.getMontonNegativo() +
                "\n" + " para un saldo toltal de " +  mov.getMovimientoMonto() +  " realizado por " + emp.getNombre());

        System.out.println("El giro relizado el día " + todaysDate + " con un valor de "+ mov.getMontonNegativo());
        System.out.println("Pago nomima " + todaysDate + "  valor de " + mov.getMontoPositivo() +  " realizado por " + emp.getNombre())
        ;


    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("This is a test");

        Empresa minTic_G5=new Empresa();
        minTic_G5.setDireccion("Cra 4 122-78");
        minTic_G5.setNombre("Desarrolladores G5");
        minTic_G5.setTelefono("3173797793");
        minTic_G5.setNit("9005644-1");

        System.out.println("La empresa "+ minTic_G5.getNombre() + " ubicada en la ciudad de Medellin, con NIT "
                            + minTic_G5.getNit() + "se dedica a la produccion de software de calidad");

    }
}
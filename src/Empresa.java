public class Empresa {
        private String nombre;
        private String direccion;
        private int telefono;
        private String nit;

        /* Constructor de la clase empresa*/
        public Empresa(String nombre, String direccion, int telefono, String nit) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.telefono = telefono;
            this.nit = nit;
        }

        public Empresa() {
        }

        /*Getters y setters de la clase */

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {

            this.nombre = nombre;
        }

        public String getDireccion() {

            return direccion;
        }

        public void setDireccion(String direccion) {

            this.direccion = direccion;
        }

        public int getTelefono() {

            return telefono;
        }

        public void setTelefono(int telefono) {

            this.telefono = telefono;
        }

        public String getNit() {

            return nit;
        }

        public void setNit(String nit) {

            this.nit = nit;
        }
    }



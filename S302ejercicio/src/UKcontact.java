public class UKcontact implements Agentcontact{

        private String address;
        private String phone;


        @java.lang.Override
        public void createAddress(String newAddress) {
            this.address=newAddress;
        }

        @java.lang.Override
        public void createPhone(String newPhone) {
            this.phone=newPhone;

        }
        public String toString() {
            return "-Contacto UK: " + "Dirección: " + address + " Teléfono: " + phone;
        }
}

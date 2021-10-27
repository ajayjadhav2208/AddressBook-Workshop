
    public class Contact {
        private String name;
        private String lastname;
        private String address;
        private String email;
        private String city;
        private String zip;
        private String state;
        private String phone;

        public Contact(String name, String surname, String address, String email, String city, String zip, String state, String phone) {
            this.name = name;
            this.lastname = surname;
            this.address = address;
            this.email = email;
            this.city = city;
            this.zip = zip;
            this.state = state;
            this.phone = phone;
        }

        public String toString(){
            return ("First name: " + name + "\n Last name: " + lastname + "\n Address: " + address + "\n city: " + city
                    + "\n state: " +state + "\n email: " + email + "\n zip: " + zip + "\n phone number:" + phone + "");
        }
    }



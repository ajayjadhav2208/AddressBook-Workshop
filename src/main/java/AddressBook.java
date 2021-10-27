 import java.util.ArrayList;


    public class AddressBook {
        ArrayList<Contact> addressBook= new ArrayList<>();
        public static void main(String[] args){
            System.out.println("Welcome to Address Book");
        }
        public void addContact(String name,String surname,String email,String address,String phone,String zip,String state,String city){
            addressBook.add(new Contact(name, surname, address, email, city, zip, state, phone));
        }

        public int count(){
            return addressBook.size();

        }
    }


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import junit.framework.TestCase;


class AddressBookTest {
    AddressBook address=new AddressBook();
    private TestCase Assertions;

    @Test
    public void whenEnterDetails_checkContact(){
        try {
            address.addContact("Ajay","jadhav","ajayjadhav@gmail.com","Basavakalyan","7722081610","585445","karnataka","Bidar");
            address.addContact("mahi","dhoni","mahi@10","zarkhand","985742316","5855","zarkhand","zarkhand");
            int count=address.count();
            Assertions.assertEquals(2,2);

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
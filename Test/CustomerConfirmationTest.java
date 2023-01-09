import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerConfirmationTest {

    @Test
    void setCustName() {
        CustomerConfirmation custConfirmation = new CustomerConfirmation("Alfredo", "James");
        assertEquals("Alfredo", custConfirmation.getCustName());
        assertEquals("James", custConfirmation.getCustConfirmation());

        custConfirmation.setCustName("Robert");
        custConfirmation.setCustConfirmation("ABCDAF");

        assertEquals("Robert", custConfirmation.getCustName());
        assertEquals("ABCDAF", custConfirmation.getCustConfirmation());
    }

    @Test
    void testConstructorPreCondition(){
        CustomerConfirmation cc =  new CustomerConfirmation("", "James");
    }

}
/**Mardi Hem
 * CS-320
 * Professor Jeff Philips
 * 03/29/2026
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {

    private ContactService service;

    @BeforeEach
    void setUp() {
        service = new ContactService();
    }

    private Contact makeContact(String id) {
        return new Contact(id, "John", "Doe", "1234567890", "123 Main St");
    }

    @Test
    void testAddContact() {
        service.addContact(makeContact("001"));
        assertNotNull(service.getContact("001"));
    }

    @Test
    void testAddDuplicateIdThrows() {
        service.addContact(makeContact("001"));
        assertThrows(IllegalArgumentException.class, () -> service.addContact(makeContact("001")));
    }

    @Test
    void testAddNullContactThrows() {
        assertThrows(IllegalArgumentException.class, () -> service.addContact(null));
    }

    @Test
    void testDeleteContact() {
        service.addContact(makeContact("001"));
        service.deleteContact("001");
        assertThrows(IllegalArgumentException.class, () -> service.getContact("001"));
    }

    @Test
    void testDeleteContactNotFoundThrows() {
        assertThrows(IllegalArgumentException.class, () -> service.deleteContact("999"));
    }

    @Test
    void testUpdateFirstName() {
        service.addContact(makeContact("001"));
        service.updateFirstName("001", "Jane");
        assertEquals("Jane", service.getContact("001").getFirstName());
    }

    @Test
    void testUpdateFirstNameNotFoundThrows() {
        assertThrows(IllegalArgumentException.class, () -> service.updateFirstName("999", "Jane"));
    }

    @Test
    void testUpdateLastName() {
        service.addContact(makeContact("001"));
        service.updateLastName("001", "Smith");
        assertEquals("Smith", service.getContact("001").getLastName());
    }

    @Test
    void testUpdateLastNameNotFoundThrows() {
        assertThrows(IllegalArgumentException.class, () -> service.updateLastName("999", "Smith"));
    }

    @Test
    void testUpdatePhone() {
        service.addContact(makeContact("001"));
        service.updatePhone("001", "0987654321");
        assertEquals("0987654321", service.getContact("001").getPhone());
    }

    @Test
    void testUpdatePhoneNotFoundThrows() {
        assertThrows(IllegalArgumentException.class, () -> service.updatePhone("999", "0987654321"));
    }

    @Test
    void testUpdateAddress() {
        service.addContact(makeContact("001"));
        service.updateAddress("001", "456 Oak Ave");
        assertEquals("456 Oak Ave", service.getContact("001").getAddress());
    }

    @Test
    void testUpdateAddressNotFoundThrows() {
        assertThrows(IllegalArgumentException.class, () -> service.updateAddress("999", "456 Oak Ave"));
    }
}

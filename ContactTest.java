/**Mardi Hem
 * CS-320
 * Professor Jeff Philips
 * 03/29/2026
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    // Helper to create a basic valid contact
    private Contact makeContact() {
        return new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
    }

    @Test
    void testValidContact() {
        Contact c = makeContact();
        assertEquals("12345", c.getContactId());
        assertEquals("John", c.getFirstName());
        assertEquals("Doe", c.getLastName());
        assertEquals("1234567890", c.getPhone());
        assertEquals("123 Main St", c.getAddress());
    }

    @Test
    void testContactIdNull() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact(null, "John", "Doe", "1234567890", "123 Main St"));
    }

    @Test
    void testContactIdTooLong() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345678901", "John", "Doe", "1234567890", "123 Main St"));
    }

    @Test
    void testFirstNameNull() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345", null, "Doe", "1234567890", "123 Main St"));
    }

    @Test
    void testFirstNameTooLong() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345", "FirstNameTooLong", "Doe", "1234567890", "123 Main St"));
    }

    @Test
    void testLastNameNull() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345", "John", null, "1234567890", "123 Main St"));
    }

    @Test
    void testLastNameTooLong() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345", "John", "LastNameTooLong", "1234567890", "123 Main St"));
    }

    @Test
    void testPhoneNull() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345", "John", "Doe", null, "123 Main St"));
    }

    @Test
    void testPhoneWrongLength() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345", "John", "Doe", "123", "123 Main St"));
    }

    @Test
    void testPhoneNotDigits() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345", "John", "Doe", "123456789A", "123 Main St"));
    }

    @Test
    void testAddressNull() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345", "John", "Doe", "1234567890", null));
    }

    @Test
    void testAddressTooLong() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345", "John", "Doe", "1234567890", "1234567890123456789012345678901"));
    }

    @Test
    void testUpdateFirstName() {
        Contact c = makeContact();
        c.setFirstName("Jane");
        assertEquals("Jane", c.getFirstName());
    }

    @Test
    void testUpdateFirstNameInvalid() {
        Contact c = makeContact();
        assertThrows(IllegalArgumentException.class, () -> c.setFirstName(null));
    }

    @Test
    void testUpdateLastName() {
        Contact c = makeContact();
        c.setLastName("Smith");
        assertEquals("Smith", c.getLastName());
    }

    @Test
    void testUpdatePhone() {
        Contact c = makeContact();
        c.setPhone("0987654321");
        assertEquals("0987654321", c.getPhone());
    }

    @Test
    void testUpdateAddress() {
        Contact c = makeContact();
        c.setAddress("456 Oak Ave");
        assertEquals("456 Oak Ave", c.getAddress());
    }
}

package phoneBookApp;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookApp {

    private Map<String, String> contactsBase = new HashMap<>();

    public String saveNumber(String contactName, String contactNumber) {
        if (contactsBase.containsKey(contactName)) {
            String existingNumber = contactsBase.get(contactName);
            contactsBase.put(contactName, contactNumber);
            return String.format("Updated contact: Name: %s Old Phone Number: %s New Phone Number: %s", contactName, existingNumber, contactNumber);
        } else {

            contactsBase.put(contactName, contactNumber);
            return String.format("Added contact: Name: %s Phone Number: %s", contactName, contactNumber);
        }
    }


    public String searchNumber(String name) {
        for (Map.Entry<String, String> entry : contactsBase.entrySet()) {
            if (contactsBase.containsKey(name)) {
                    return String.format("Name: %s Phone Number: %s", entry.getKey(), entry.getValue());
            }
        }

        return String.format("Name: %s - %s", name, "User not found");
    }


    public String DeleteNumber(String contactToDelete) {
        contactsBase.remove(contactToDelete);
        return "Contact deleted";
    }
}
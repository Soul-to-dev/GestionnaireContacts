public class Main {

    public static void main(String[] args) {

        ContactsManager myContactsManager = new ContactsManager();

        Contact contact1 = new Contact("Alice Dupont", "0701020304");
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact("Bob Martin", "0612345678");
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact("Clara Diallo", "0798765432");
        myContactsManager.addContact(contact3);

        Contact contact4 = new Contact("David Koné", "0623456789");
        myContactsManager.addContact(contact4);

        Contact contact5 = new Contact("Eva Touré", "0754321098");
        myContactsManager.addContact(contact5);

        System.out.println("----------------------------");

        myContactsManager.searchContact("Clara Diallo");

        System.out.println("----------------------------");

        myContactsManager.searchContact("Jean Inconnu");
    }
}

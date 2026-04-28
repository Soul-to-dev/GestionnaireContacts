public class ContactsManager {

    Contact[] listeContacts = new Contact[10];

    int nombreDeContacts = 0;

    public void addContact(Contact contact) {
        listeContacts[nombreDeContacts] = contact;
        nombreDeContacts = nombreDeContacts + 1;
        System.out.println("Contact ajouté : " + contact.nom);
    }

    public void searchContact(String nom) {
        for (int i = 0; i < nombreDeContacts; i++) {
            if (listeContacts[i].nom.equals(nom)) {
                System.out.println("Contact trouvé !");
                System.out.println("Nom : " + listeContacts[i].nom);
                System.out.println("Téléphone : " + listeContacts[i].telephone);
                return; // On arrête la recherche
            }
        }
        System.out.println("Contact introuvable : " + nom);
    }
}

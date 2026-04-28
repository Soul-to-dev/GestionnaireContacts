// Cette classe gère une liste de contacts
public class ContactsManager {

    // On crée un tableau qui peut contenir jusqu'à 10 contacts
    Contact[] listeContacts = new Contact[10];

    // On compte combien de contacts ont été ajoutés
    int nombreDeContacts = 0;

    // Méthode pour ajouter un contact dans la liste
    public void addContact(Contact contact) {
        listeContacts[nombreDeContacts] = contact;
        nombreDeContacts = nombreDeContacts + 1;
        System.out.println("Contact ajouté : " + contact.nom);
    }

    // Méthode pour chercher un contact par son nom
    public void searchContact(String nom) {
        // On parcourt tous les contacts un par un
        for (int i = 0; i < nombreDeContacts; i++) {
            // Si on trouve le nom recherché
            if (listeContacts[i].nom.equals(nom)) {
                System.out.println("Contact trouvé !");
                System.out.println("Nom : " + listeContacts[i].nom);
                System.out.println("Téléphone : " + listeContacts[i].telephone);
                return; // On arrête la recherche
            }
        }
        // Si on arrive ici, le contact n'existe pas
        System.out.println("Contact introuvable : " + nom);
    }
}
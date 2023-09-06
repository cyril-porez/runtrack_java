public class EtudiantTest {

    public EtudiantTest() {

    }

    public static void main(String[] args) {
        String name = "Bob";
        int[] notes = {15, 12, 18, 10};
        Etudiant etudiant = new Etudiant(name, notes);
        etudiant.displayName();
        etudiant.displayNotes();
        etudiant.displayHighNotes();
        etudiant.displayLowNotes();
        etudiant.displayAverage();
    }
}

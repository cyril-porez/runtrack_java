public class Etudiant {
    private String name;
    private int[] notes;

    public Etudiant(String name, int[] notes) {
        this.name = name;
        this.notes = notes;

    }

    public void displayName() {
        System.out.println("Nom de l'étudiant: " +  name);
    }

    public void displayNotes() {
        System.out.print("Notes: [");
        for (int i = 0; i < notes.length; i++) {
            if (i != notes.length - 1)
                System.out.print(notes[i] + ", ");
            else
                System.out.print(notes[i]);
        }
        System.out.println("]");
    }

    public void displayHighNotes() {
        int highNote = notes[0];
        for (int note : notes) {
            if (highNote < note) {
                highNote = note;
            }
        }
        System.out.println("Note la plus haute: " + highNote);
    }

    public void displayLowNotes() {
        int lowNote = notes[0];
        for (int note : notes) {
            if (lowNote > note )
                lowNote = note;
        }
        System.out.println("Note la plus basse: " + lowNote);
    }

    public void displayAverage() {
        int size = notes.length;
        double sumNotes = 0;
        for (int note : notes) {
            sumNotes += note;
        }
        double average = sumNotes / size;
        System.out.println(average);
    }
}

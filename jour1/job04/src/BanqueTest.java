public class BanqueTest {
    public static void main(String[] args) {
        CompteBancaire myCompteBancaire = new CompteBancaire(100);
        myCompteBancaire.depose(50);
        myCompteBancaire.retire(70);
        myCompteBancaire.retire(90);
    }
}

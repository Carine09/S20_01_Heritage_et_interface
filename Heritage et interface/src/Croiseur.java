public class Croiseur extends Vaisseau{
    public Integer nombre_homme;

    public Croiseur(String nom, String type, Integer taille, Integer nombre_homme) {
        super(nom, type, taille);
        this.nombre_homme = nombre_homme;
    }

    public void charger(){
        if (nombre_homme == 0) {
            nombre_homme++;
            System.out.println(this.nombre_homme + " troupe(s) a été chargé.");
        }
    }

    public void decharger(){
        if (nombre_homme > 0) {
            nombre_homme--;
            System.out.println(this.nombre_homme + " troupe(s) a été déchargé.");
        }
    }
}

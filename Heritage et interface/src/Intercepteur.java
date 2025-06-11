public class Intercepteur extends Vaisseau{
    public Integer nombre_canon;

    public Intercepteur(String nom, String type, Integer taille, Integer nombre_canon) {
        super(nom, type, taille);
        this.nombre_canon = nombre_canon;
    }

    public void tirer(){
        if (type == "Intercepteur" && nombre_canon > 0) {
            nombre_canon--;
            System.out.println(this.nombre_canon + " canon(s) a été tiré.");
        }
    }

    public void recharger(){
        if (nombre_canon == 0) {
            nombre_canon++;
            System.out.println(this.nombre_canon + " troupe(s) a été chargé.");
        }
    }
}

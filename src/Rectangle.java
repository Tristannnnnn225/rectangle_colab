public class Rectangle {
    private int largeur ;
    private int hauteur ;
    private String couleur;


    public Rectangle(int largeur, int hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.couleur = "noir";
    }
    //Méthode pour calculer le Perimetre
    public Integer calculerPerimetre(){

        return  2* (largeur+hauteur);
    }
    //Méthode pour calculer la surface
    public Integer CalculerSurface(){

        return largeur* hauteur;
    }
// methode pour verifier si c'est carre avec boolean
    public boolean estCeUnCarre(){
        return largeur== hauteur;
    }
}


class Rectangle extends AForme {
    double longueur;
    double largeur;

    Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    double calculerAire() {
        return longueur * largeur;
    }
}
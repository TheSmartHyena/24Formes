class Triangle extends AForme {
    double base;
    double hauteur;

    Triangle(double base, double hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    double calculerAire() {
        return 0.5 * base * hauteur;
    }
}
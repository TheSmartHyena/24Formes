// Classes concrètes
class Cercle extends AForme {
    double rayon;

    Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    double calculerAire() {
        return Math.PI * rayon * rayon;
    }
}
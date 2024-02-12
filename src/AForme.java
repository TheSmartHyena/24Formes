abstract class AForme {
    abstract double calculerAire();

    void afficherInformations() {
        System.out.println("Je suis une forme géométrique de :" + this.calculerAire());
    }
}
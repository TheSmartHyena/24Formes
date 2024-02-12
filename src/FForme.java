public class FForme implements IFormeFactory {
    public static AForme creerForme(ETypeForme type, double argA, double argB) {
        return switch (type) {
            case ETypeForme.CERCLE -> new Cercle(argA);
            case ETypeForme.RECTANGLE -> new Rectangle(argA, argB);
            case ETypeForme.TRIANGLE -> new Triangle(argA, argB);
            case ETypeForme.SPECIAL -> new FormeSpecial();

            default -> null;
        };
    }
}

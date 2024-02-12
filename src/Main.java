import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<AForme> list = new ArrayList<AForme>();

        list.add(FForme.creerForme(ETypeForme.CERCLE, 7.2, 0));
        list.add(FForme.creerForme(ETypeForme.RECTANGLE, 10, 15));
        list.add(FForme.creerForme(ETypeForme.TRIANGLE, 10, 10));
        list.add(FForme.creerForme(ETypeForme.SPECIAL, 0, 0));

        for (AForme forme : list) {
            if (forme instanceof FormeSpecial) {
                FormeSpecial item = (FormeSpecial) forme;
                item.methodSpecial();
            } else {
                System.out.println(forme.calculerAire());
            }
        }
    }
}
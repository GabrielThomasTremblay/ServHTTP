
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.IOException;
import reseauBased.Serveur;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        try {
            new Serveur(6969);
        } catch (IOException var2) {
            IOException e = var2;
            System.out.println(e);
        }

    }
}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.IOException;
import reseauBased.Client;

public class MainClient {
    public MainClient() {
    }

    public static void main(String[] args) {
        try {
            Client client = new Client("localhost", 80);
        } catch (IOException var2) {
            System.out.println("io");
        }

    }
}

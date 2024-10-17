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
            new Client("127.0.0.1", 6969);
        } catch (IOException var2) {
            System.out.println("io");
        }

    }
}

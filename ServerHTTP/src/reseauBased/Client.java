//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package reseauBased;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private String address;
    private Socket server = null;
    private DataOutputStream out;
    private DataInputStream in;

    public Client(String address, int port) throws IOException {
        this.server = new Socket(address, port);
        System.out.println("Connecter");
        this.in = new DataInputStream(System.in);
        this.out = new DataOutputStream(this.server.getOutputStream());
        String line = "";
        Scanner scanner = new Scanner(this.in);

        while(!line.equals("fini")) {
            try {
                line = scanner.nextLine();
                this.out.writeUTF(line);
            } catch (IOException var6) {
                System.out.println("e");
            }
        }

        this.in.close();
        this.out.close();
    }
}

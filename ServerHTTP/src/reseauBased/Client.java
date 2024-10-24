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
    private DataInputStream servIn;

    public Client(String address, int port) throws IOException {
        this.server = new Socket(address, port);
        System.out.println("Connecter");
        this.in = new DataInputStream(System.in);
        this.out = new DataOutputStream(this.server.getOutputStream());
        this.servIn = new DataInputStream(this.server.getInputStream());
        String line = "";
        Scanner scanner = new Scanner(System.in);



        while(!line.equals("Fini")) {
            line = scanner.nextLine();
            this.out.writeUTF(line);
            line = servIn.readUTF();
            System.out.println(line);
        }

        this.servIn.close();
        this.out.close();
    }
}

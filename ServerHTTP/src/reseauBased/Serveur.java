
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package reseauBased;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
    private Socket client = null;
    private ServerSocket server = null;
    private DataInputStream in = null;
    private DataOutputStream out = null;

    private void date() {
        hello;
    }

    public Serveur(int port) throws IOException {
        this.server = new ServerSocket(port);
        this.client = this.server.accept();
        this.in = new DataInputStream(this.client.getInputStream());
        this.out = new DataOutputStream(this.client.getOutputStream());
        String line = "";



        while(!line.equals("Fini")) {
            try {
                line = this.in.readUTF();
                if (line.equals("Cat")) {
                    this.out.writeUTF("Meow :3");

                } else if (line.startsWith("GET")) {
                    this.out.writeUTF("Meow :3");

                } else if (line.startsWith("HEAD")) {

                    this.out.writeUTF("200 ok \rDate: ");

                } else {
                    this.out.writeUTF("");
                    System.out.println(line);
                }
            } catch (IOException var4) {
                IOException e = var4;
                System.out.println(e);
            }
        }

        System.out.println("Conection Closed");
        this.client.close();
        this.in.close();
    }
}

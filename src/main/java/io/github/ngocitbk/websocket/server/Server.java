package io.github.ngocitbk.websocket.server;

import java.util.Scanner;
import javax.websocket.DeploymentException;

public class Server {

    public static void main(String[] args) {

        org.glassfish.tyrus.server.Server server = new org.glassfish.tyrus.server.Server("localhost", 8887, "/ws", ServerEndpoint.class);

        try {
            server.start();
            System.out.println("Press any key to stop the server..");
            new Scanner(System.in).nextLine();
        } catch (DeploymentException e) {
            throw new RuntimeException(e);
        } finally {
            server.stop();
        }
    }

}

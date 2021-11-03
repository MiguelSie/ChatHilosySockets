/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorchat;

import java.net.*;
import java.io.*;

public class ServidorChat {

    public void crearServer() {
        InetAddress ipAddress = null;
        int Port = 3000;
        int backlog = 0;
        String mensaje;

        try {
            ipAddress = InetAddress.getByName("localhost");
        } catch (UnknownHostException u) {
            System.out.println("No se puede obtener la dirección IP");
        }

        try {
            ServerSocket servidor = new ServerSocket(Port, backlog, ipAddress);
            System.out.println("Inicia el servidor: " + servidor);
            
            while (true) {
                Socket cliente = servidor.accept();

            }

        } catch (IOException e) {
            System.out.println("ERROR: " + e.toString());
        }

    }

    public static void main(String[] args) {
        new ServidorChat().crearServer();
    }

}

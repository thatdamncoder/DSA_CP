package NetworkProgramming;

import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        try {
            // Define server address and port
            InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
            int SERVER_PORT = 12345;

            // Create a datagram socket
            DatagramSocket clientSocket = new DatagramSocket();

            byte[] sendData;
            byte[] receiveData = new byte[1024];


            // Get user input
            String message = "Hello from client";

            // Send data to the server
            sendData = message.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, SERVER_PORT);
            clientSocket.send(sendPacket);

            // Receive data from the server
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
            String serverResponse = new String(receivePacket.getData(), 0, receivePacket.getLength());

            System.out.println("Response from server: " + serverResponse);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


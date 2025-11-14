package NetworkProgramming;

import java.net.*;

public class UDPServer {
    public static void main(String[] args) {
        try {
            // Define server port
            int SERVER_PORT = 12345;

            // Create a datagram socket
            DatagramSocket serverSocket = new DatagramSocket(SERVER_PORT);

            System.out.println("Server is running...");

            byte[] receiveData = new byte[1024];
            byte[] sendData = new byte[1024];

            while (true) {
                // Receive data from client
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);
                String clientMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                System.out.println("Received from " + clientAddress + ":" + clientPort + " - " + clientMessage);

                // Echo back the received data to the client
                sendData = clientMessage.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                serverSocket.send(sendPacket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


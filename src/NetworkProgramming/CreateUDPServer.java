package NetworkProgramming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class CreateUDPServer {
    public static void main(String[] args) {
        final int PORT = 12345; // Port number for server
        final int BUFFER_SIZE = 1024; // Buffer size for receiving data

        try {
            // Create a DatagramSocket object
            DatagramSocket serverSocket = new DatagramSocket(PORT);

            System.out.println("Server is running...");

            while (true) {
                // Create buffer to receive incoming data
                byte[] receiveData = new byte[BUFFER_SIZE];

                // Create a DatagramPacket to receive data from client
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

                // Receive data from client
                serverSocket.receive(receivePacket);

                // Get the data received and client's address and port
                String clientData = new String(receivePacket.getData());
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                // Print received data and client's information
                System.out.println("Received from client " + clientAddress.toString() + ":" + clientPort + " - " + clientData);

                // Convert the received data to uppercase
                String uppercaseData = clientData.toUpperCase();

                // Send the uppercase data back to the client
                byte[] sendData = uppercaseData.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                serverSocket.send(sendPacket);

                System.out.println("Sent to client " + clientAddress + ":" + clientPort + " - " + uppercaseData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

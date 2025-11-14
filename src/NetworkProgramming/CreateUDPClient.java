package NetworkProgramming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class CreateUDPClient {
    public static void main(String[] args) {
        final String SERVER_ADDRESS = "localhost"; // Server's IP address (in this case, localhost)
        final int SERVER_PORT = 12345; // Port number on which server is listening

        try {
            // Create a DatagramSocket object
            DatagramSocket clientSocket = new DatagramSocket();

            // Get the IP address of the server
            InetAddress serverAddress = InetAddress.getByName(SERVER_ADDRESS);

            // Message to send to the server
            String message = "Hello, Server!";
            byte[] sendData = message.getBytes();

            // Create a DatagramPacket to send data to the server
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, SERVER_PORT);

            // Send the packet to the server
            clientSocket.send(sendPacket);
            System.out.println("Sent to server: " + message);

            // Create buffer to receive incoming data
            byte[] receiveData = new byte[1024];

            // Create a DatagramPacket to receive data from the server
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

            // Receive data from the server
            clientSocket.receive(receivePacket);

            // Get the data received from the server
            String modifiedMessage = new String(receivePacket.getData());

            // Print the data received from the server
            System.out.println("Received from server: " + modifiedMessage);

            // Close the socket
            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

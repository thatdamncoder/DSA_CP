package NetworkProgramming;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) {
        try {
            // Connect to the server on localhost and port 9999
            Socket socket = new Socket("localhost", 9999);
            System.out.println("Connected to server.");

            // Get input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);

            // Read input from user and send to server
            String userInput;
            long startTime, endTime;
            System.out.println("Welcome to the Java EchoServer. Type 'bye' to close.");
            while (!(userInput = scanner.nextLine()).equals("bye")) {
                startTime = System.nanoTime();
                out.println(userInput);

                // Receive echo from server and calculate round trip time
                String response = in.readLine();
                endTime = System.nanoTime();
                long roundTripTime = (endTime - startTime) / 1000000; // Convert nanoseconds to milliseconds
                System.out.println("Server echoed: " + response);
                System.out.println("Round trip time: " + roundTripTime + " ms");

                System.out.println("Welcome to the Java EchoServer. Type 'bye' to close.");
            }

            // Close streams and socket
            in.close();
            out.close();
            socket.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
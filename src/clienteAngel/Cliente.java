package clienteAngel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) {
        try {
            // 1. Conectarse al servidor (CAMBIAR LA IP POR LA DE EMILIO)
            // Ejemplo: Socket socket = new Socket("192.168.1.35", 12345);
            Socket socket = new Socket("PON_AQUI_LA_IP_DE_EMILIO", 12345);
            System.out.println("Conectado al servidor");

            // 2. Crear flujos para enviar y recibir datos
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // 3. Enviar un mensaje al servidor
            out.println("Hola, servidor. Soy el cliente Angel.");

            // 4. Leer la respuesta del servidor
            String respuestaServidor = in.readLine();
            System.out.println("Respuesta del servidor: " + respuestaServidor);

            // 5. Cerrar los recursos
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
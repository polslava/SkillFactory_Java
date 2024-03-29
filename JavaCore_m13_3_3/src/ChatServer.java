//import jdk.internal.org.objectweb.asm.ClassReader;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class ChatServer {
    ArrayList<Client> clients = new ArrayList<>();//список клиентов для чата
    ServerSocket serverSocket; //на уровень класса вынесли

    ChatServer() throws IOException { //смягчение для сокета
        // создаем серверный сокет на порту 1234
        serverSocket = new ServerSocket(1234);
    }
    void sendAll(String message){
        for(Client client: clients){
            client.receive(message); //рассылка по всему списку клиентов
        }
    }
    public void run() {
        while(true) {
            System.out.println("Waiting...");
            try { //требуется для безопасности использования сокета
                // ждем клиента из сети
                Socket socket = serverSocket.accept();
                System.out.println("Client connected!");
                // создаем клиента на своей стороне
                clients.add(new Client(socket, this)); //клиенты собираются в список самостоятельно
            }catch (IOException e){
                e.printStackTrace(); //обязательная часть для трассировки
            }
        }
    }
    public static void main(String[] args) throws IOException {
        new ChatServer().run(); //чтобы не пустой main, он должен запускать себя




    }
}

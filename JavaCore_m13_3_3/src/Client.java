import java.io.*;
import java.net.*;
import java.util.*;

class Client implements Runnable {
    Socket socket; //на уровень класса вынесли
    Scanner in;//на уровень класса вынесли
    PrintStream out;//на уровень класса вынесли
    ChatServer server;//на уровень класса вынесли
    public Client(Socket socket, ChatServer server){ //конструктор для определения объекта класса

        this.socket = socket;
        this.server = server;
        // запускаем поток
        //Thread thread = new Thread(client);
        new Thread(this::run).start(); //запуск потока
        // ::run требует IDE, без него ошибка компиляции, в видео урока этого не было
    }
    public void receive (String message){
        out.println(message); //вывод полученного сообщения клиенту-вводителю сообщения
    }

    public void run() {
        try {
            // получаем потоки ввода и вывода
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            // создаем удобные средства ввода и вывода
             in = new Scanner(is);
             out = new PrintStream(os);

             String username = System.getProperty("user.name");
            // читаем из сети и пишем в сеть
            out.println("Welcome to chat! "+username);
            String input = in.nextLine();
            while (!input.equals("bye, "+username)) {
                server.sendAll(username+": "+input ); //рассылка от сервера сообщения введённого
                input = in.nextLine(); //ожидание сервером сообщения от любого клиента
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

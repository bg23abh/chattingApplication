package chatting_application;

public class mainClass {

        public static void main(String[] args) {
            new Thread(() -> {
                Server.main(args);
            }).start();
            Client.main(args);
        }
}

package practiceTasks.Restaurant;

public class ServerObject {
    public static void main(String[] args) {


        Server server = new Server();
        server.name = "Ali";
        server.employeeID = 15;
        server.hourlyRate = 40;
        server.fullTime = true;

        System.out.println(server);

        server.takeOrder();
        server.cleanTable();


    }
}

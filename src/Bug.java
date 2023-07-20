public class Bug {

    String opisBledu;
    String email;
    int priorityPoint;
    boolean statusBledu;


    Bug(String opisBledu, String email, int priorityPoint) {

        this.opisBledu = opisBledu;
        this.email = email;
        this.priorityPoint = priorityPoint;
        this.statusBledu = false;

    }


    void getAllInfo() {
        System.out.println(opisBledu + " " + email + " " + priorityPoint + " " + statusBledu);
    }

    void getEmail() {
        System.out.println("Email: " + email);
    }

    int getPoint() {
        return priorityPoint;
    }

    void showStatus() {
        System.out.println("status błędu: " + statusBledu );
    }
    }

package Model;

public class Bug {

    private String opisBledu;
    private String email;
    private int priorityPoint;
    private boolean statusBledu;


    public Bug(String opisBledu, String email, int priorityPoint) {

        this.opisBledu = opisBledu;
        this.email = email;
        this.priorityPoint = priorityPoint;
        this.statusBledu = false;

    }


    public void getAllInfo() {
        System.out.println(opisBledu + " " + email + " " + priorityPoint + " " + statusBledu);
    }

    public void getEmail() {
        System.out.println("Email: " + email);
    }

    public int getPoint() {
        return priorityPoint;
    }

    public void showStatus() {
        System.out.println("status błędu: " + statusBledu );
    }
    }

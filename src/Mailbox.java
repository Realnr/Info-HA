public class Mailbox {
    private String address;
    private double hight;
    private double ellipse;

    public Mailbox(String a, double w, double l) {
        address = a;
        hight = w;
        ellipse = l;
    }

    public String getMailboxAddress() {
        return address;
    }

    public double getMailboxSize() {
        return hight * ellipse;
    }
}
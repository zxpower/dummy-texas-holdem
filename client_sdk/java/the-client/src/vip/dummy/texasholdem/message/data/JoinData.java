package vip.dummy.texasholdem.message.data;

public class JoinData {
    private String phoneNumber;
    private String password;
    private String ticket;

    public JoinData(String phoneNumber, String password, String ticket) {
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.ticket = ticket;
    }

    public JoinData() {

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
}

package Q_04;

public class Owner {
    private String ownerName;
    private String phoneNo;

    // Constructor for the owner class
    public Owner(String ownerName, String phoneNo) {
        this.ownerName = ownerName;
        this.phoneNo = phoneNo;
    }

    // Getter and setter for the owner name
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Getter and setter for the phone number
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}

public class BuddyInfo {

    public static final String DEFAULT_NAME = "Bob";
    public static final int DEFAULT_PHONE_NUMBER = 5554321;

    private String name = DEFAULT_NAME;
    private int phone_number = DEFAULT_PHONE_NUMBER;

    public BuddyInfo(String name_, int phone_) {
        this.name = name_;
        this.phone_number = phone_;
    }

    public BuddyInfo( String name_ ) {
        this.name = name_;
        this.phone_number = DEFAULT_PHONE_NUMBER;
    }

    public BuddyInfo( int phone_number_ ) {
        this.name = DEFAULT_NAME;
        this.phone_number = phone_number_;
    }

    public String getName() {
        return name;
    }

    public int  getPhoneNumber() {
        return phone_number;
    }

    public String toString() {
        return "BuddyInfo:"+"\nName: "+this.getName()+"\nPhone: "+this.getPhoneNumber() ;
    }

}


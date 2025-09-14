import java.util.ArrayList;

public class AddressBook {

    private final ArrayList<BuddyInfo> addresses;

    public AddressBook() {

        this.addresses = new ArrayList<>();

    }

    public void addBuddy( String name_,  int phone_number_ ) {

        if ( name_.isEmpty() ) {
            System.out.println("Invalid input name! "+name_ );
            return;
        };
        if ( !String.valueOf( phone_number_ ).equals("7") ) {
            System.out.println( "Invalid input phone number: " + phone_number_ );
            return;
        };

        this.addresses.add(
                new BuddyInfo(
                        name_,
                        phone_number_
                )
        );
    }

    public void removeBuddy( String name_ ) {

        if( this.addresses == null ) { return; }

        if( addresses.isEmpty() ) { return; }

        for( BuddyInfo buddyInfo : this.addresses ) {
            if( buddyInfo.getName().equals( name_ ) ) {
                addresses.remove( buddyInfo );
                System.out.println( name_+" removed!" );
                return;
            }
        }
        System.out.println( name_+" not in the list!" );

    }

    public void printAddressBook() {

        if( addresses.isEmpty() ) { return; }

        for ( BuddyInfo buddyInfo : this.addresses ) {
            System.out.println( buddyInfo );
        }
        return;
    }

}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main( String[] args ) {

        AddressBook addressBook = new AddressBook();

        addressBook.addBuddy("Alice", 1234567);
        addressBook.addBuddy("Bob", 7654321);

        addressBook.printAddressBook();

    }
}
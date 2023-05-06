public abstract class Account implements IRate {

    String name;
    String sSN;
    double balance;
    String accountNubmer;
    double rate;

    public Account(String name) {
        System.out.println("Name: " + name);
        System.out.print("New account: ");
    }
}

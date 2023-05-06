public abstract class Account implements IRate {

    public Account(String name) {
        System.out.println("Name: " + name);
        System.out.print("New account: ");
    }
}

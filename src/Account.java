public abstract class Account implements IRate {

    String name;
    String sSN;
    double balance;
    String accountNubmer;
    double rate;

    public Account(String name, String ssN, double initDeposit) {
        this.name = name;
        this.sSN = ssN;
        balance = initDeposit;
        System.out.println("NAME: " + name + " SSN: " + ssN + " BALANCE: $" + balance);
    }
}

public class Savings extends Account {

    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    public Savings(String name, String ssN, double initDeposit) {
        super(name, ssN, initDeposit);
        accountNubmer = "1" + accountNubmer;
        System.out.println("ACCOUNT NUMBER: " + this.accountNubmer);
        System.out.println("NEW SAVINGS ACCOUNT");
    }
}

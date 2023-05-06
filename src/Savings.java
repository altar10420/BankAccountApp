public class Savings extends Account {

    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    public Savings(String name, String ssN, double initDeposit) {
        super(name, ssN, initDeposit);
        accountNumber = "1" + accountNumber;
        System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        System.out.println("NEW SAVINGS ACCOUNT");
    }
}

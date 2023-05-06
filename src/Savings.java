public class Savings extends Account {

    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    public Savings(String name, String ssN, double initDeposit) {
        super(name, ssN, initDeposit);
        System.out.println("NEW SAVINGS ACCOUNT");
    }
}

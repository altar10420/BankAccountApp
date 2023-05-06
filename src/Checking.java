public class Checking extends Account {

    int debitCardNumber;
    int debitCardPIN;

    public Checking(String name, String ssN, double initDeposit) {
        super(name, ssN, initDeposit);
        accountNumber = "2" + accountNumber;
        System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        System.out.println("NEW CHECKING ACCOUNT");
    }
}

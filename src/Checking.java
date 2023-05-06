public class Checking extends Account {

    int debitCardNumber;
    int debitCardPIN;

    public Checking(String name, String ssN, double initDeposit) {
        super(name, ssN, initDeposit);
        accountNubmer = "2" + accountNubmer;
        System.out.println("ACCOUNT NUMBER: " + this.accountNubmer);
        System.out.println("NEW CHECKING ACCOUNT");
    }
}

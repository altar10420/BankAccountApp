public class Checking extends Account {

    int debitCardNumber;
    int debitCardPIN;

    public Checking(String name, String ssN, double initDeposit) {
        super(name, ssN, initDeposit);
        System.out.println("NEW CHECKING ACCOUNT");
    }
}

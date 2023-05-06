public abstract class Account implements IRate {

    String name;
    String sSN;
    double balance;
    static int index = 10000;
    String accountNumber;
    double rate;

    public Account(String name, String ssN, double initDeposit) {
        this.name = name;
        this.sSN = ssN;
        balance = initDeposit;
        System.out.println("NAME: " + name + " SSN: " + ssN + " BALANCE: $" + balance);

        index++;
        this.accountNumber = setAccountNumber();
    }

    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

}

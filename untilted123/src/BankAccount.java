public class BankAccount {
    private double acNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    public double getAcNumber() {
        return acNumber;
    }

    public void setAcNumber(double acNumber) {
        this.acNumber = acNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amountDeposit){
        balance=balance+amountDeposit;

    }
    public void withDrawal(double amountWithDrawal){
        if(balance<amountWithDrawal){
            // ödeme yapma
        }
        else{
            balance=balance-amountWithDrawal;
        }
    }



}

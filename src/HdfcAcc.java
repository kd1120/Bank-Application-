import java.util.UUID;

public class HdfcAcc implements BankAccInterface {

    final double rateOfInterest = 12;
    private String name;
    private String accountNo; // random no is created using UUID
    private double balance;
    private String password;

    //default constructor
    public HdfcAcc() {

    }

    //all parameter constructor
    public HdfcAcc(String name, double balance, String password) {
        this.name = name;
        this.accountNo = String.valueOf(UUID.randomUUID());
        this.balance = balance;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String fetchBalance(String password) {
        if (this.password.equals(password)) {
            return " Your balance is " + this.balance;

        }
        return "Invalid Password";
    }

    @Override
    public double addMoney(double amount) {
        this.balance += amount;
        return balance;
    }

    @Override
    public String withdrawMoney(String password, double amount) {
        if (this.password.equals(password)) {
            if (amount <= this.balance) {
                this.balance -= amount;
                return "Transaction successful";
            } else {
                return "Insuff balance";
            }

        }
        return "Incorrect Password";
    }

    @Override
    public String changePassword(String newPassword, String oldPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            return "Password changed";

        }

        return "Wrong Password";
    }

    @Override
    public double calculateInterest(int years) {

        return (this.balance * years * rateOfInterest) / 100;
    }
}

import java.util.UUID;

public class SbiAcc implements BankAccInterface {
    final double rateOfInterest = 12.3;
    private String name;
    private String password; // random no is created using UUID
    private double balance;

    public SbiAcc() {

    }

    public SbiAcc(String name, String password, double balance) {
        this.name = name;
        this.password = String.valueOf(UUID.randomUUID());
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public String fetchBalance(String password) {
        if (this.password.equals(password)) {
            return "Your balance is " + this.balance;
        }
        return "Incorrect password";
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
            }

        }
        return "Wrong Password";
    }

    @Override
    public String changePassword(String newPassword, String oldPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = password;
            return "Password changed";
        }

        return "Incorrect password";

    }

    @Override
    public double calculateInterest(int years) {
        return (this.balance * years * rateOfInterest) / 100;
    }
}

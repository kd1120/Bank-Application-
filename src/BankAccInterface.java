public interface BankAccInterface {

     String fetchBalance(String password);

     double addMoney(double amount);

     String withdrawMoney(String password, double amount);

     String changePassword(String newPassword, String oldPassword);

     double calculateInterest(int years);


}

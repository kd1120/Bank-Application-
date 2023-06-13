import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //first hdfc acc
        HdfcAcc hdfcAcc = new HdfcAcc("Kashish", 10000, "Shiv1");
        System.out.println("Congrats! " +
                hdfcAcc.getName() +
                " Your acc has been created with acc number" + hdfcAcc.getAccountNo());


        //second hdfc acc
        HdfcAcc hdfcAcc2 = new HdfcAcc("shiv", 10000, "Shiv1");
        System.out.println("Congrats! " +
                hdfcAcc2.getName() +
                " Your acc has been created with acc number " + hdfcAcc2.getAccountNo());


        SbiAcc sbiAcc = new SbiAcc("Karna ", "Shiv1", 10000);
        System.out.println("Congrats!  " +
                sbiAcc.getName() + "Account setup complete ");


        //add money in acc1
        System.out.println(hdfcAcc.addMoney(12000));


        // withdraw money with wrong pwd
        System.out.println(hdfcAcc.withdrawMoney("xyd", 5000));

        // withdraw with correct pwd
        System.out.println(hdfcAcc.withdrawMoney("Shiv1", 2000));

        // fetch balance
        System.out.println(hdfcAcc.fetchBalance("Shiv1"));

        // changepassword of acc1
        System.out.println(hdfcAcc.changePassword("Shiv1", "Shiv1"));


        System.out.println("Enter the number of years ");
        int years = s.nextInt();

        System.out.println("Interest for  " + years + " years is " + hdfcAcc.rateOfInterest);

    }
}
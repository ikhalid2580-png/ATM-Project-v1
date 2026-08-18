import java.util.Scanner;

public class  ATM_Project {
    public static void main(String[] args) {

        // 1. بيانات العميل الأساسية
        String customerName = "Khaled";
        String accountNumber = "100200300";
        double balance = 1000.0;
        int realPin = 1234;

        // 2. تجهيز الـ Scanner للاستقبال
        Scanner input = new Scanner(System.in);

        // 3. التحقق من الرقم السري (PIN Verification)
        System.out.print("Please enter your 4-digit PIN: ");
        int enteredPin = input.nextInt();

        if (enteredPin == realPin) {
            System.out.println("Welcome, " + customerName + "!");
            System.out.println("=================================");
            System.out.println("Please choose an option:");
            System.out.println("1. Check Balance (الاستعلام عن الرصيد)");
            System.out.println("2. Withdraw (سحب نقدي)");
            System.out.println("3. Deposit (إيداع)");
            System.out.print("Enter your choice (1, 2, or 3): ");

            int choice = input.nextInt();

            // 4. تفرع العمليات باستخدام if / else if
            if (choice == 1) {
                // الخيار الأول: الاستعلام
                System.out.println("Your current balance is: " + balance);

            } else if (choice == 2) {
                // الخيار الثاني: السحب النقدي
                System.out.print("Enter amount to withdraw: ");
                double withdraw = input.nextDouble();

                if (withdraw > balance || withdraw <= 0) {
                    System.out.println("Error: Insufficient balance or invalid amount!");
                } else {
                    balance -= withdraw;
                    System.out.println("Withdrawal successful!");
                    System.out.println("Your new balance: " + balance);
                }

            } else if (choice == 3) {
                // الخيار الثالث: الإيداع
                System.out.print("Enter amount to deposit: ");
                double deposit = input.nextDouble();

                if (deposit > 0) {
                    balance += deposit;
                    System.out.println("Deposit successful!");
                    System.out.println("Your new balance: " + balance);
                } else {
                    System.out.println("Error: Invalid deposit amount!");
                }

            } else {
                // لو اختار رقم غلط من القائمة
                System.out.println("Invalid choice!");
            }

        } else {
            // لو الـ PIN غلط
            System.out.println("Wrong PIN! Access denied.");
        }

        // * ملاحظة: انشاء الله هيتم تطوير المشروع لاحقا بي طريقه اخرا و يتم عمل Loops *
    }
}
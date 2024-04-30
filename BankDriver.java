import java.util.Scanner;

class Bankac {
    private String acHolderName;
    private String address;
    private long aadhaarNumber;
    private String panNumber;
    private int upiPin;
    private double balance;
    private long phoneNumber;

    // Constructor
    public Bankac(String acHolderName, String address, long aadhaarNumber, String panNumber, int upiPin, double balance, long phoneNumber) {
        this.acHolderName = acHolderName;
        this.address = address;
        this.aadhaarNumber = aadhaarNumber;
        this.panNumber = panNumber;
        this.upiPin = upiPin;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
    }

    // Getter and setter methods

    // Methods for banking operations
    public void deposit(double amount, int enteredPin) {
        if (upiPin == enteredPin) {
            balance =balance+amount;
            System.out.println(amount + " deposited successfully");
        } else {
            System.out.println("Incorrect UPI PIN. Deposit is  failed.");
        }
    }

    public void withdraw(double amount, int enteredPin) {
        if (upiPin == enteredPin) {
            if (balance >= amount) {
                balance =balance-amount;
                System.out.println(amount + " withdrawn is successfully......");
            } else {
                System.out.println("Insufficient balance.....");
            }
        } else {
            System.out.println("Incorrect UPI PIN. Withdrawal failed......");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public void updateac(String address, long phoneNumber, int enteredPin) {
        if (upiPin == enteredPin) {
            this.address = address;
            this.phoneNumber = phoneNumber;
            System.out.println("ac details updated successfully.....");
        } else {
            System.out.println("Incorrect UPI PIN. Update failed.");
        }
    }

    public void displayacDetails() {
        System.out.println("ac Holder Name: " + acHolderName);
        System.out.println("Address: " + address);
        System.out.println("Aadhaar Number: " + aadhaarNumber);
        System.out.println("PAN Number: " + panNumber);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Current Balance: " + balance);
    }
    
    // Method to create a new ac
    //method static bcoz give a lettest value
    public static Bankac newac() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creating a new ac...");
        System.out.print("Enter ac Holder Name: ");
        String acHolderName = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Aadhaar Number: ");
        long aadhaarNumber = scanner.nextLong();
        System.out.print("Enter PAN Number: ");
        String panNumber = scanner.next();
        System.out.print("Enter UPI PIN: ");
        int upiPin = scanner.nextInt();
        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Enter Phone Number: ");
        long phoneNumber = scanner.nextLong();
        
        return new Bankac(acHolderName, address, aadhaarNumber, panNumber, upiPin, balance, phoneNumber);
    }
}

public class BankDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Perform banking operations
        Bankac ac = null;
        for(; ;) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Create New ac");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Update ac");
            System.out.println("6. Existing User Record");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ac = Bankac.newac();
                    break;
                case 2:
                    if (ac != null) {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        System.out.print("Enter UPI PIN: ");
                        int depositPin = sc.nextInt();
                        ac.deposit(depositAmount, depositPin);
                    } else {
                        System.out.println("Create an ac first.");
                    }
                    break;
                case 3:
                    if (ac != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        System.out.print("Enter UPI PIN: ");
                        int withdrawPin = sc.nextInt();
                        ac.withdraw(withdrawAmount, withdrawPin);
                    } else {
                        System.out.println("Create an ac first.");
                    }
                    break;
                case 4:
                    if (ac != null) {
                        ac.checkBalance();
                    } else {
                        System.out.println("Create an ac first.");
                    }
                    break;
                case 5:
                    if (ac != null) {
                        sc.nextLine(); // consume newline
                        System.out.print("Enter new address: ");
                        String newAddress = sc.nextLine();
                        System.out.print("Enter new phone number: ");
                        long newPhoneNumber = sc.nextLong();
                        System.out.print("Enter UPI PIN: ");
                        int updatePin = sc.nextInt();
                        ac.updateac(newAddress, newPhoneNumber, updatePin);
                    } else {
                        System.out.println("Create an ac first.");
                    }
                    break;
                case 6:
                    if (ac != null) {
                        ac.displayacDetails();
                    } else {
                        System.out.println("Create an ac first.");
                    }
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }
}
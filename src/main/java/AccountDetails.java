public class AccountDetails {
    private String name;
    private String accountNumber;
    private String login;
    private long balance;

    public void showAccount(){
        System.out.println("Your account name is: "+ name);
        System.out.println("Your account number is: "+ accountNumber);
        System.out.println("Your account balance is: "+ balance);
    }
}

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AccountDetails account = new AccountDetails();
        System.out.println("Witaj w aplikacji bankowej!");
        int znak;
        do {
            System.out.println("Wybierz co chcesz zrobić: \n 1. Informacje o koncie \n 2. Wpłata gotówki \n 3. Wypłata gotówki \n 4. Wyjście");
            znak = scanner.nextInt();
            switch (znak){
                case 1:
                    account.showAccount();
                    break;
            }
        }while (znak != 4);

    }
}

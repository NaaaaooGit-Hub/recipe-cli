import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> recipes = new ArrayList<>();
        
        while (true) {
            System.out.println("\n=== Recipe Box ===");
            System.out.println("1. レシピを追加");
            System.out.println("2. レシピ一覧を表示");
            System.out.println("3. 終了");
            System.out.print("選択してください: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            if (choice == 1) {
                System.out.print("レシピ名を入力: ");
                String name = scanner.nextLine();
                recipes.add(name);
                System.out.println("追加しました！");
            } else if (choice == 2) {
                System.out.println("\n=== レシピ一覧 ===");
                for (String recipe : recipes) {
                    System.out.println("- " + recipe);
                }
            } else if (choice == 3) {
                System.out.println("終了します");
                break;
            }
        }
    }
}
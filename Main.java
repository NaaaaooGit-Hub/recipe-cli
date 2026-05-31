import java.util.ArrayList;
import java.util.Scanner;

class Recipe {
    String name;
    String ingredients;
    String videoUrl;
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();
        
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
                System.out.print("材料を入力: ");
                String ingredients = scanner.nextLine();
                System.out.print("動画URLを入力: ");
                String videoUrl = scanner.nextLine();
                Recipe recipe = new Recipe();
                recipe.name = name;
                recipe.ingredients = ingredients;
                recipe.videoUrl = videoUrl;
                recipes.add(recipe);
                System.out.println("追加しました！");
            } else if (choice == 2) {
                System.out.println("\n=== レシピ一覧 ===");
                for (Recipe recipe : recipes) {
                    System.out.println("- " + recipe.name + "：" + recipe.ingredients + "　動画：" + recipe.videoUrl);
                }
            } else if (choice == 3) {
                System.out.println("終了します");
                break;
            }
        }
    }
}
import java.util.Scanner;

/*
Замена.
Вася написал книгу рецептов для своего лучшего друга Коли, но забыл, что у него аллергия на один из продуктов.
А что, если у человека есть аллергия не на один, а на несколько продуктов? да и держать книгу как одну большую строку
не очень удобно. Помимо всего прочего, непривычно видеть текст без заглавных букв.  Помогите Васе улучшить алгоритм.
На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги.
Потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. Потом вводится
m строк - вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт,
на который следует заменить продукт1. Гарантируется что любой продукт состоит из 1 слова.
название продуктов написаны строчными буквами. Гарантируется, что продукты, на которые нужно выполнить замену,
не встречаются изначально в тексте.

Замените все продукты в поваренной книге Васи и выведите их построчно на экран.
Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!
Ввод:
2
Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измельчите его. Посыпьте измельчённый арахис на мороженое.
Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть, радоваться жизни.
3
арахис – колбаса
клубника – вишня
сгущенка – молоко
Вывод:
Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измельчите его. Посыпьте измельчённый колбаса на мороженое.
Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть, радоваться жизни.
*/

import java.util.Scanner;

public class pz_7_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int recipeCount = Integer.parseInt(scanner.nextLine());
        String[][] recipes = new String[recipeCount][];

        for (int i = 0; i < recipeCount; i++) {
            recipes[i] = scanner.nextLine().split(" ");
        }

        int substitutionCount = Integer.parseInt(scanner.nextLine());
        String[][] substitutions = new String[substitutionCount][2];

        for (int i = 0; i < substitutionCount; i++) {
            String[] substitutionPair = scanner.nextLine().split(" - ");
            substitutions[i][0] = substitutionPair[0].toLowerCase();
            substitutions[i][1] = substitutionPair[1];
        }

        for (String[] recipe : recipes) {
            for (int i = 0; i < recipe.length; i++) {
                for (String[] substitution : substitutions) {
                    if (recipe[i].toLowerCase().equals(substitution[0])) {
                        recipe[i] = substitution[1];
                    }
                    else if (recipe[i].equalsIgnoreCase(substitution[0])) {
                        recipe[i] = substitution[1].substring(0, 1).toUpperCase() + substitution[1].substring(1);
                    }
                }
            }
            StringBuilder resultRecipe = new StringBuilder();
            for (String word : recipe) {
                resultRecipe.append(word).append(" ");
            }
            System.out.println(resultRecipe.toString().trim());
        }
    }
}

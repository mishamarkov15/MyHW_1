package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    private static List<Integer> cart = new ArrayList<>();

    public static boolean authenticate() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input your login: ");
        String login = sc.next();

        System.out.print("Input your password: ");
        String pswd = sc.next();

        System.out.println("Welcome!");
        return true;
    }

    public static int execMainMenu() {
        Scanner sc = new Scanner(System.in);
        String cmd;
        while (true) {
            System.out.println("""
                    1. Показать все товары
                    2. Показать товары из определенной категории
                    3. Перейти в корзину
                    4. Выход""");

            cmd = sc.next();
            switch (cmd) {
                case "1":
                    return 1;
                case "2":
                    return 2;
                case "3":
                    return 3;
                case "4":
                    return 4;
                default:
                    System.out.println("Неправильный ввод!\n");
            }
        }
    }

    public static Thing[] createArrayOfThings() {
        Thing[] things = new Thing[4];
        things[0] = new Laptop();
        things[1] = new TShirt();
        things[2] = new Skirt();
        things[3] = new PS4Game();
        return things;
    }

    public static void showAllThings(Thing[] things) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < things.length; ++i) {
            System.out.printf("%d. %s\n", i + 1, things[i].toString());
        }
        System.out.printf("%d. Назад в главное меню\n", things.length + 1);
        System.out.print("Чтобы добавить товар в корзину нажмите его номер: ");
        String thing_type;
        while (true) {
            thing_type = sc.next();
            if (Objects.equals(thing_type, Integer.valueOf(things.length + 1).toString())) {
                break;
            }
            for (int i = 0; i < things.length; ++i) {
                if (Objects.equals(thing_type, Integer.valueOf(i + 1).toString())) {
                    cart.add(i);
                    break;
                }
            }
            System.out.print("Чтобы добавить товар в корзину нажмите его номер: ");
        }
    }

    public static void showCart(Thing[] things) {
        System.out.println("Ваша корзина\n");
        double total_sum = 0.;
        for (int i = 0; i < cart.size(); ++i) {
            System.out.printf("%d. %s\n", i + 1, things[cart.get(i)]);
            total_sum += things[cart.get(i)].price;
        }
        System.out.printf("Итого: %.2f\n", total_sum);
        System.out.println("a. Купить\nb. Назад в меню");

        Scanner sc = new Scanner(System.in);
        String cmd;
        while (true) {
            cmd = sc.next();
            switch (cmd) {
                case "a":
                    cart.clear();
                    System.out.println("Покупка успешно завершена");
                    return;
                case "b":
                    return;
                default:
                    System.out.println("Неверный ввод.");
                    break;
            }
        }
    }

    public static Thing[] showThingsByCategory(Thing[] things) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите категорию.");

        int i = 1;
        for (Category category : Category.values()) {
            System.out.printf("%d. %s\n", i++, category);
        }
        System.out.printf("%d. Назад\n", Category.values().length + 1);

        ArrayList<Thing> res = new ArrayList<>();
        String cmd;
        while (true) {
            cmd = sc.next();
            for (int j = 0; j < Category.values().length; ++j) {
                if (Objects.equals(cmd, Integer.valueOf(j + 1).toString())) {
                    for (Thing thing : things) {
                        if (thing.category == Category.values()[j]) {
                            res.add(thing);
                        }
                    }
                    if (res.size() == 0) {
                        System.out.println("Товаров выбранной категории нет.");
                    }
                    return res.toArray(new Thing[res.size()]);
                }
            }
            if (Objects.equals(cmd, Integer.valueOf(Category.values().length + 1).toString())) {
                break;
            }
            System.out.println("Неверный ввод.");
        }
        return res.toArray(new Thing[res.size()]);
    }

    public static void main(String[] Args) {
        Thing[] things = createArrayOfThings();
        authenticate();
        int cmd = execMainMenu();
        while (true) {
            switch (cmd) {
                case 1:
                    showAllThings(things);
                    break;
                case 2:
                    Thing[] tmp = showThingsByCategory(things);
                    if (tmp.length == 0) {
                        System.out.println("Возврат в меню.");
                    } else {
                        showAllThings(tmp);
                    }
                    break;
                case 3:
                    showCart(things);
                    break;
                case 4:
                    System.out.println("До свидания!");
                    return;
            }
            cmd = execMainMenu();
        }
    }
}

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {

    public static void main(final String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        show();
        Scanner s = new Scanner(System.in);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Container storage = new Container();
        int a=0;
        final int end=11;
        while(a != end)
        {
            a=s.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Введіть новий елемент:");
                    storage.add(read.readLine());
                    break;
                case 2:
                    if (storage.remove(read.readLine())) {
                        System.out.println("Елемент видалиний!");
                    }
                    else {
                        System.out.println("Такого елемента не існує!");
                    }
                    break;
                case 3:
                    storage.clear();
                    System.out.println("Контейнер був видалений!");
                    break;
                case 4:
                    System.out.println(storage.toString());
                    break;
                case 5:
                    storage.compare();
                    break;
                case 6:
                    storage.sort((String[]) storage.toArray());
                    System.out.println(storage.toString());
                    break;
                case 7:
                    System.out.println("---------");
                    Helper.PrintSymbols(storage.toString());
                    Helper.PrintSymbolNumbers(storage.toString());
                    break;
                case 8:
                    System.out.print("Exit");
                    break;
                default : break;
            }
        }
        s.close();
    }
    public static void show() {
        System.out.println("Меню");
        System.out.println("1. Додавання елемента");
        System.out.println("2. Виделення елемента");
        System.out.println("3. Очистка");
        System.out.println("4. Вивід");
        System.out.println("5. Порівняння");
        System.out.println("6. Сортування");
        System.out.println("7. Використання классу іншого студента");
        System.out.println("8. Вихід");
    }
}
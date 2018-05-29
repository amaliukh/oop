import java.util.Scanner;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab12 {

    private static int counter = 0;
    private static Scanner sc = new Scanner(System.in);
    private static Container container = new Container();
    private static Object[] objectList = new Object[10];
    private static Serializator serializator = new Serializator();

    private static boolean checkIdWithRegExp(String s) {
        Pattern p = Pattern.compile("^[0-9]{4}$");
        Matcher m = p.matcher(s);
        return m.matches();
    }
    private static boolean checkNameWithRegExp(String s) {
        Pattern p = Pattern.compile("^[A-z]{2,10}$");
        Matcher m = p.matcher(s);
        return m.matches();
    }
    private static void createUser() {

        User user = new User();

        try {

            FileWriter fw = new FileWriter("text.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter file = new PrintWriter(bw);

            file.println("Kористувач № " + ++counter + ": " );
            String s;

            //first name
            while(true) {
                System.out.println("Введіть ім'я: ");
                s = sc.next();
                if(checkNameWithRegExp(s) == true) {
                    break;
                }
            }
            user.setFirstName(s);
            file.println(s);

            //last name
            System.out.println("Введіть прізвище: ");
            s = sc.next();
            user.setLastName(s);
            file.println(s);

            // id
            int i;
            do {
                System.out.println("Введіть id працівника: ");
                s = sc.next();
                if(checkIdWithRegExp(s) == true) {
                    break;
                }
            }while(true);
            i = Integer.parseInt(s);
            file.println(i);
            user.setId(i);

            while(true) {
                System.out.println("Введіть рік народження працівника: ");
                s = sc.next();
                if(checkIdWithRegExp(s) == true) {
                    break;
                }
            }
            i = Integer.parseInt(s);
            user.setYearOfBd(i);
            file.println(i);

            /*education
            System.out.println("Введіть освіта: ");
            s = sc.next();
            user.setEducation(s);
            file.println(s);

            //salary
            System.out.println("Введіть заробітню плату працівника: ");
            i = sc.nextInt();
            user.setSalary(i);
            file.println(i);

            //position
            System.out.println("Введіть посаду");
            s = sc.next();
            user.setPosition(s);
            file.println(s);

            //department
            System.out.println("Введіть відділ працівника: ");
            s = sc.next();
            user.setDepartment(s);
            file.println(s);

            //characteristic
            System.out.println("Введіть характеристика працівника: ");
            s = sc.next();
            user.setCharacteristic(s);
            file.println(s);
            file.println("\n");*/

            file.close();

            container.add(user);

            System.out.println("Нового користувача додано успішно!");
        } catch(Throwable t) {}
    }
    public static void deleteUser() {
        System.out.println("Введіть id користувача для видалення: ");
        int id = sc.nextInt();
        container.delete(id);
    }

    public static void isUser() {
        System.out.println("Введіть id користувача: ");
        int id = sc.nextInt();
        User user = container.get(id);
        if(user == null) {
            System.out.println("Користувача з вказаним id не існує  ");
        }
        else {
            System.out.println("Користувача знайдено  ");
        }
    }

    public static void showUser() {
        System.out.println("Введіть id користувача: ");
        int id = sc.nextInt();
        User user = container.get(id);
        if(user == null) {
            System.out.println("Такого користувача не знайдено  ");
        }
        else {
            show(user, id);
        }
    }
    public static void showSize() {
        System.out.println("У контейнері знаходиться " + container.getSize() + " елементи.");
    }

    private static void show(User user, int id) {
        System.out.println("Користувач з id " + id + " :");
        System.out.println("Ім'я: " + user.getFirstName());
        System.out.println("Прізвище: " + user.getLastName());
        System.out.println("Рік народження: " + user.getYearOfBd());
        /*System.out.println("Освіта: " + user.getEducation());
        System.out.println("Заробітня плата: " + user.getSalary());
        System.out.println("Посада: " + user.getPosition());
        System.out.println("Відділ: " + user.getDepartment());
        System.out.println("Характеристика: " + user.getCharacteristic());*/
    }
    private static void show(User user) {
        System.out.println("Користувач по порядковому номеру");
        System.out.println("Ім'я: " + user.getFirstName());
        System.out.println("Прізвище: " + user.getLastName());
        System.out.println("Рік народження: " + user.getYearOfBd());
        /*System.out.println("Освіта: " + user.getEducation());
        System.out.println("Заробітня плата: " + user.getSalary());
        System.out.println("Посада: " + user.getPosition());
        System.out.println("Відділ: " + user.getDepartment());
        System.out.println("Характеристика: " + user.getCharacteristic());*/
    }

    public static void clearFile() {
        try {
            FileWriter file = new FileWriter("text.txt", false);
            file.write("");
            file.close();
            counter = 0;
            System.out.println("Файл очищено!");
        } catch (Throwable T) {}
    }

    public static void closeApp() {
        System.out.println("Goodbye!");
        System.exit(0);
    }

    public static void showUserByIndex() {
        System.out.println("Введіть порядковий номер Користувача у списку: ");
        int n = sc.nextInt();
        if(n >= container.getSize()) {
            System.out.println("Користувач під таким порядковим номером відсутній");
            return;
        }
        User u = container.getIndex(n);
        show(u);
    }

    public static void toArray() {
        for(int i = 0; i < container.getSize(); i++) {
            objectList[i] = container.getIndex(i);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Доступні команди: ");
        System.out.println("1 - створити новий об'єкт та вводити в нього дані;");
        System.out.println("2 - вивести дані користувача з вказаним id");
        System.out.println("3 - перевірити, чи існує працівник");
        System.out.println("4 - очистити файл");
        System.out.println("5 - видалити користувача по індексу;");
        System.out.println("6 - вивести дані користувача за порядковим номером;");
        /*System.out.println("'7' - записати дані з колекції в масив;");
        System.out.println("'8' - серіалізувати контейнер;");
        System.out.println("'9' - десеріалізувати контейнер;");
        System.out.println("'s' - розмір контейнера;");*/
        System.out.println("e - закрити програму;");

        while(true) {
            String s = sc.nextLine();
            try {
                switch(s) {
                    case "1": createUser();
                        break;
                    case "2": showUser();
                        break;
                    case "3": isUser();
                        break;
                    case "4": clearFile();
                        break;
                    case "5": deleteUser();
                        break;
                    case "6": showUserByIndex();
                        break;
                    /*case "7": toArray();
                        break;
                    case "8": serializator.serialize(container);
                        break;
                    case "9": container = serializator.deserialize();
                        break;*/
                    case "e": closeApp();
                        break;
                   /* case "s": showSize();
                        break;*/
                    default: System.out.println("Неправильна команда!");
                        break;
                }
            } catch(Throwable T) {}
        }
    }
}
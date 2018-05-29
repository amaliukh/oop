import java.util.Objects;

import java.util.Scanner;



public class BureauOfAcquaintances {


    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        Information information = new Information();


        boolean flag = true, secondFlag = false;

        String direction;

        int number;
        int sybol;


        System.out.println("Ласкаво просимо в Бюро знайомств.");


        while (true) {


            System.out.println("Будь ласка виберіть з ким ви хочете познайомитись: 1)хлопець або 2)дівчина \n" +

                    "   [В] щоб Вийти ");


            direction = scanner.next();


            if (direction.equals("в")) {

                System.out.println("Допобачення, будем чекати вас наступного разу!");
                break;

            }


            while (true) {


                System.out.println("Щоб переглянути інформацію про хлопців натисніть від 0 до 1\n    [0] - Тарас \n    [1] - Олег \n    " +

                        "[2] - Ігор \n    [3] - Роман \n");


                number = scanner.nextInt();


                switch (number) {


                    case 0:

                        System.out.println("\nТарас\n    Стать: Чоловіча \n  Номер реєстрації: 541   \n    " +

                                "Дата реєстрації: 31 квітня 2018 року \n    Інформація про себе: Захоплююсь музикою, люблю їсти гамбергери та гуляти вечорами. \n    " +
                                "\nВимоги до партнера: Має бути привабливою та дружелюбною. \n");

                        secondFlag = true;
                        break;


                    case 1:

                        System.out.println("\nОлег\n    Стать: Чоловіча \n  Номер реєстрації: 547   \n    " +

                                "Дата реєстрації: 24 жовтня 2017 року \n    Інформація про себе: Граю баскетбол, люблю подорожувати. \n    " +
                                "\nВимоги до партнера: Має займатись спортом та дбати за собоюів. \n");

                        secondFlag = true;
                        break;


                    case 2:

                        System.out.println("\nІгор\n    Стать: Чоловіча \n  Номер реєстрації: 432   \n    " +

                                "Дата реєстрації: 6 жовтня 2013 року \n    Інформація про себе: Люблю читати книжки. Живу з мамою і мопсом \n    " +
                                "\nВимоги до партнера: Має бути з високим інтелектом та схожа на мою маму. \n");
                        secondFlag = true;

                        break;

                    case 3:

                        System.out.println("\nРоман\n    Стать: Чоловіча \n  Номер реєстрації: 666   \n    " +

                                "Дата реєстрації: 1 травня 2018 року \n    Інформація про себе: Захоплююсь дівчатами,автомобілями та всім що дорого виглядає. \n    " +
                                "\nВимоги до партнера: Має бути дуже гарною та мати ідеальну фігуру. \n");

                        secondFlag = true;
                        break;


                    case 4:



                        break;


                    default:

                        System.out.println("Wrong input, retry:");

                        break;

                }


                while (secondFlag) {


                    System.out.println("Бажаєте познайомитись?\n"
                           + "[10]Так\n  [-10]Ні\n" +

                            "  [-1] щоб Вийти ");

                    sybol = scanner.nextInt();




                    switch (sybol) {


                        case 10:

                            System.out.println("\nДякуємо Вам за використування послуг нашого бюро." +
                                    "\nМожливо ви хочете переглянути інші анкети:" );


                            secondFlag = false;
                            break;


                        case -10:

                            secondFlag = false;


                            System.out.println("Можливо ви хочете переглянути інші анкети:");
                            break;


                        case -1:

                            System.out.println("Допобачення, будем чекати вас наступного разу!");
                            flag = true;
                            return;




                    }
                }
            }
        }
    }
}
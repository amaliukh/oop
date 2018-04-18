import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new Menu().execute();

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String sentence = "";
        while (!"4".equals(s)) {

            if ("-h".equals(s) || "help".equals(s)) {
                new Help().execute();
            }
            else if ("-d".equals(s) || "debug".equals(s)) {
                new Debug().execute();
            }
            else if("1".equals(s)){
                System.out.println("Enter your sentence: ");
                Scanner scanner = new Scanner(System.in);
                sentence = scanner.nextLine();
                get_sentence(sentence);
                System.out.println("Sentence which was gotten\n");
                new Menu().execute();
            }
            else if("2".equals(s)){
                System.out.println("All the words which were inputed ");
                print(sentence);
                new Menu().execute();
            }
            else if("3".equals(s)){
                System.out.println("Words which not begining from the consonant letter");
                consonant_words(sentence);
                new Menu().execute();
            }
            else{
                System.out.println("Please repeat");
            }
            s = scan.nextLine();

            if("4".equals(s)){//if 4 - finish and print "good bye"
                new Exit().execute();
                break;
            }
        }
    }
    private static StringBuilder[] get_sentence(String sentence){


        StringBuilder[] str_array = new StringBuilder[10];
        StringBuilder strbuilder = new StringBuilder();

        int counter = 0;

        for(int i = 0; i<sentence.length(); i++){
            if(' ' != sentence.charAt(i)) {
                strbuilder.append(sentence.charAt(i));
            }
            else{
                str_array[counter] = strbuilder;
                counter += 1;
                strbuilder = new StringBuilder();
            }
        }
        return str_array;
    }
    private static void print(String sentence){
        for(int i=0; i<5; i++){
            if(get_sentence(sentence)[i] != null) {
                System.out.print(get_sentence(sentence)[i]);
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
    private static void consonant_words(String sentence){
        for(int i=0; i<5; i++){
            if(get_sentence(sentence)[i] != null) {
                if (get_sentence(sentence)[i].charAt(0) == 'a' || get_sentence(sentence)[i].charAt(0) == 'e' || get_sentence(sentence)[i].charAt(0) == 'i' || get_sentence(sentence)[i].charAt(0) == 'o' || get_sentence(sentence)[i].charAt(0) == 'u' || get_sentence(sentence)[i].charAt(0) == 'y' ){
                    System.out.print(get_sentence(sentence)[i]);
                    System.out.print(" ");
                }
            }
        }
        System.out.println(" ");
    }
}


class Help implements Command {
    @Override
    public void execute() {
        System.out.println("1) Enter words using spaces. In the end too!");
        System.out.println("2) Show your inputed sentences spliting them into new lines");
        System.out.println("3) Run the printer (print all the words which started with vowel)");
        System.out.println("4) Finish program");
    }
}

class Debug implements Command {
    @Override
    public void execute() {
        System.out.println("1) Don`t use ,?! etc. Finish the sentence with space");
        System.out.println("2) New line = new sentence");
        System.out.println("3) show all word from sentence in one line");
        System.out.println("4) Finish program");
    }
}

class Exit implements Command{
    @Override
    public void execute() {
        System.out.println("Goodbye!");
    }
}

class Menu implements Command {
    @Override
    public void execute() {
        System.out.println("1) Enter sentences");
        System.out.println("2) Show input");
        System.out.println("3) Run the printer");
        System.out.println("4) Exit");
    }
}


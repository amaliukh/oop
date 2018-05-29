import java.util.ArrayList;

import java.util.Collection;

import java.util.Iterator;

import java.util.Scanner;



public class ExampleCollection {
    // Collection using ArrayList
    static Collection col = new ArrayList();
    static String Name;
    static String Gender;
    static String Number;
    static String Date;
    static String Bio;
    static String Requirements;
    static String Add;

    public static void main(String[] args) {
        // Creating the collection
        Collection col1 = createFirstCollection();


        System.out.println("============= Going through the collection");
        for(Object o : col1) {
            System.out.println("Item: " + o);
        }

        // Going through using Iterator
        System.out.println("============= Going through using Iterator");
        for (Iterator it = col1.iterator(); it.hasNext(); ) {
            String s = (String)it.next();
            System.out.println("Item: " + s);
        }

        // Deleting the collection's element
        col1.remove(Requirements);
        System.out.println("============= Deleting => " + Requirements);
        for(Object o : col1) {
            System.out.println("Item: " + o);
        }

        // Adding an element
        Add = "What you wish to add";
        col1.add(Add);
        System.out.println("============= Adding => " + Add);
        for(Object o : col1) {
            System.out.println("Item: " + o);
        }

        //Finding element in collection
        System.out.println("============= Finding element " + Name);
        int index = 0;
        for(Object o : col1) {
            if (o == Name)
                System.out.println("Item found on index: " + (index+1));
        }

        // Deleting all elements using Iterator
        System.out.println("============= Deleting using Iterator");
        while(!col1.isEmpty()) {
            Iterator it = col1.iterator();
            Object o = it.next();
            System.out.println("Deleting: " + o);
            // Deleting the element
            it.remove();
        }
    }


    // Collection
    public static Collection createFirstCollection() {
       /* Scanner in = new Scanner(System.in);
        System.out.print("Name: ");
        Name = in.nextLine();
        System.out.print("Gender: ");
        Gender = in.nextLine();
        System.out.print("Number: ");
        Number = in.nextLine();
        System.out.print("Date: ");
        Date = in.nextLine();
        System.out.print("Bio: ");
        Bio = in.nextLine();
        System.out.print("Requirements: ");
        Requirements = in.nextLine();*/
        Name = "Samantha";
        Gender = "Female";
        Number = "54E67";
        Date = "March 31, 2018";
        Bio = "My name is Samantha. I am 163 sm. I am blue eyed girl and I like dancing.";
        Requirements = "My future partner must be tall and fit. Also he must be kind and good looking.";
        // Adding to collection
        col.add(Name);
        col.add(Gender);
        col.add(Number);
        col.add(Date);
        col.add(Bio);
        col.add(Requirements);
        return col;
    }
}
package com.tasks5.command;

public class Application {
	public static void main(String[] args) {
		if (args != null ){
            int length = args.length;
            if  (length == 1) {
                String first = args[0];
                if ("help".equals(first))
                    new Help().execute();
                else if ("exit".equals(first))
                    new Exit().execute();
                else
                    System.out.println("Error");
            }
            else if( length ==2 ) {
                String first = args[0];
                if ("echo".equals(first))
                    new Echo(args).execute();
                else if ("date".equals(first) && "now".endsWith(args[1]))
                    new Date().execute();
                else
                    System.out.println("Error");
            }
            else
                System.out.println("Error");
        }
        else
            System.out.println("Error");
    }
}
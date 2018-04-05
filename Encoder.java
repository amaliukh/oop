package com.tasks6.rle;



public class Encoder

{

public static String encode(String phrase) {

			

			StringBuffer compressed = new StringBuffer();

			int count;

		for(int i = 0; i < phrase.length(); i++) {

			count = 1;

			if(i != phrase.length() - 1)

			{

			while( phrase.charAt(i) == phrase.charAt(i + 1) && i + 1 < phrase.length() && count < 9 ) {

				count++;

				i++;

				if(i + 1 >= phrase.length())

					break;

			}

			}

			if(count == 1) {

				

			compressed.append(phrase.charAt(i));

			

			}

			else {

				compressed.append(phrase.charAt(i));

				compressed.append(count);

			}

	  }

	

		return compressed.toString();

		 

	}

	

    

	public static void main( String[] args )

	{

    if(args[0] == null || args == null) {

		System.out.println("error");

		return;

	}

	else if(args[0] == "") {

			String k = "";

			System.out.println(k);	

		}

	else {

			

			 System.out.println(encode(args[0]));

	

	  }

	}

}
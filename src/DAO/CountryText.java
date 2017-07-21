package DAO;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class CountryText implements CountryDao{


  @Override
  public void read() {

    try {

      File countries = new File("countries.txt");
      FileReader reader = new FileReader(countries);
      BufferedReader buff = new BufferedReader(reader);

      String line = null;

      while ((line = buff.readLine()) != null) {
        System.out.println(line);

      }
      buff.close();
      System.out.println();
    } catch (Exception e) {
      e.printStackTrace();
    }


  }

  @Override
  public void addCountry() {

    try {
      Scanner scan = new Scanner(System.in);
      //FileWriter testWriter = new FileWriter( "test1.txt" );
      FileWriter writer = new FileWriter("countries.txt", true);
      System.out.println("Enter a Country: ");

      String input = scan.nextLine();
      //testWriter.write(input);
      writer.write("\n" + input );
      System.out.println("This country has been saved!\n");
      //testWriter.close();
      writer.close();

    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  @Override
  public void deleteCountry() {

  }

  @Override
  public void updateCountry() {

  }
}

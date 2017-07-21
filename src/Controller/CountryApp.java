package Controller;

import DAO.CountryDao;
import DAO.CountryText;

import java.util.Scanner;

public class CountryApp {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the Countries Maintenance Application\n");

    CountryDao countryText = new CountryText();


    countries(scan, countryText);

  }


  private static void countries(Scanner scan, CountryDao countryText) {

    int menuNum = 0;
    // loop for countries - read, wrte and exit
    do {
      System.out.println("1 - See the list of countries\n2 - Add a country\n3 - Exit\n");
      System.out.print("Enter menu number: ");
      menuNum = scan.nextInt();


      if (menuNum == 1) {
        countryText.read();
      } else if (menuNum == 2) {
        countryText.addCountry();
      } else if (menuNum == 3) {
        System.out.println("Bye-B");
      } else {
        System.out.println("Whoa!");
      }
    } while (menuNum != 3);



  }

}

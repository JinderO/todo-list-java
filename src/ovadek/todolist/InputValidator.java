package ovadek.todolist;

import java.util.Scanner;

public class InputValidator {

  private static final Scanner scanner = new Scanner(System.in);

  //Správné zadání čísel s opakováním
  public static int getValidInteger(String prompt,int min, int max){
    while(true){
      System.out.print(prompt);
      try {
        int value = Integer.parseInt(scanner.nextLine().trim());
        if (value >= min && value <= max){
          return value;
        } else {
          System.out.println("❌ Zadej číslo mezi " + min + " a " + max);
        }
      }catch (NumberFormatException e){
        System.out.println("❌ Zadej platné číslo");
      }
    }
  }

  // Bezpečné čtení Stringu, který není prázdný
  public static String getNonEmptyString(String prompt){
    while(true){
      System.out.print(prompt);
      String input = scanner.nextLine().trim();
      if (!input.isEmpty()){
        return input;
      } else {
        System.out.println("❌ Vstup nemůže být prázdný!");
      }
    }
  }

  //String, který může bát prázdný
  public static String getOptionalString(String prompt, String defaultValue){
      System.out.print(prompt);
      String input = scanner.nextLine().trim();
      return input.isEmpty() ? defaultValue : input;
    }

}

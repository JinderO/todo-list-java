package ovadek.todolist;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  //Vytvoření ArrayList pro zápis přidaných úkolů
  private static ArrayList<Task> tasks = new ArrayList<>();
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    //Uvítací text
    System.out.print("""
                    *********************************
                       Vítej v aplikaci TO-DO-LIST
                    *********************************\n""");


      while (true) {
        //VŽDY ukáže seznam úkolů
        showTasks();
        System.out.println();
        System.out.print("""       
                *************************************************************
                * 1# Přidat | 2# Upravit | 3# Smazat | 4# Hotovo | 5# Konec *
                *************************************************************
                Volba:                """);

        try {
          int input = scanner.nextInt();
          scanner.nextLine() ;
          if (input >= 1 && input <= 6) {

            switch (input) {
              case 1 -> addTask();
              case 2 -> editTask();
              case 3 -> deleteTask();
              case 4 -> markTask();
              case 5 -> {
                System.out.println("👋 Díky, že jsi použil TO-DO LIST. Na viděnou!");
                System.exit(0);
              }
            }
          } else {
            System.out.println("❌ Chyba! Zadej číslo 1-5");
          }
        } catch (InputMismatchException e) {
          System.out.println("❌ Špatný formát vstupu! Zadej platné číslo!");
          scanner.nextLine();
        }
      }
  }

  // Přidání úkolu
  private static void addTask(){
    String name = InputValidator.getNonEmptyString("Zadej název úkolu: ");
    String description = InputValidator.getOptionalString("Zadej popis úkolu: ","");
    tasks.add(new Task(name,description));
    System.out.println("✅ Úkol " + name + " byl přidán");
  }

  //Úprava úkolu
  private static void editTask() {
    if (tasks.isEmpty()){
      System.out.println("❌ Seznam je prázdný!");
      return;
    }
    int choice = InputValidator.getValidInteger("Vyber úkol (1-" +tasks.size() + "):",1,tasks.size());
    int index = choice - 1;
    Task task = tasks.get(index);

    if (index >= 0 && index < tasks.size()) {

      System.out.print("Zadej nový název úkolu: ");
      String newName = scanner.nextLine().trim();

      System.out.print("Zadej nový popis úkolu: ");
      String newDescription = scanner.nextLine().trim();

      task.setName(newName);
      task.setDescription(newDescription);
      System.out.println("✅ Úkol upraven.");
    } else {
      System.out.println("❌ Neplatné číslo úkolu.");
    }
  }

  //Smazání úkolu
  public static void deleteTask() {
    System.out.print("Vyber # úkol pro smazání: ");
    showTasks();
    int numOfTask = scanner.nextInt();
    int index = numOfTask - 1;
    scanner.nextLine();

    if (index >= 0 && index < tasks.size()) {
      Task task = tasks.remove(index);
      System.out.println("✅ Úkol byl smazán");
    } else {
      System.out.println("❌ Neplatné číslo úkolu.");
    }
  }

  //Označit jako hotovo
  public static void markTask(){
    if (tasks.isEmpty()){
      System.out.println("Seznam úkolů je prázdný!");
      return;
    }
    System.out.print("Vyber úkol, který jsi dokončil: ");
    showTasks();
    int numOfTask = scanner.nextInt();
    int index = numOfTask - 1;
    scanner.nextLine();

    if (index >= 0 && index < tasks.size()) {
      Task task = tasks.get(index);
      task.complete();
      System.out.println("✅ Úkol byl označen jako hotový");
    } else {
      System.out.println("❌ Neplatné číslo úkolu.");
    }
  }

  //Zobrazení aktuálních úkolů
  public static void showTasks(){
    System.out.println("\n=====SEZNAM ÚKOLŮ=====");
    if(tasks.isEmpty()){
      System.out.println("Seznam úkolů je prázdný");
      return;
    } else {
      for (int i = 0; i < tasks.size(); i++) {
        System.out.println((i + 1) + ". " + tasks.get(i));
      }
    }
  }

}

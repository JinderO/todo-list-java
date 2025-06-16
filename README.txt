# ✅ Java TO-DO List Application

Interactive command-line TODO list application built in Java, demonstrating fundamental programming concepts and clean code practices.

## 🚀 Features

- ✅ **Add tasks** with name and description
- ✏️ **Edit existing tasks** 
- 🗑️ **Delete tasks** from list
- ✓ **Mark tasks as completed**
- 📋 **View all tasks** with status indicators
- 🛡️ **Input validation** with error handling
- 🎨 **User-friendly interface** with emojis and clear formatting

## 📸 Demo

Vítej v aplikaci TO-DO-LIST

=====SEZNAM ÚKOLŮ=====

[○] Nakoupit potraviny – Mléko, chléb, vajíčka
[✓] Dokončit projekt – Java TO-DO aplikace
[○] Zavolat doktorovi – Objednat se na kontrolu



1# Přidat | 2# Upravit | 3# Smazat | 4# Hotovo | 5# Konec *



## 🛠️ Technologies Used

- **Java 17+** - Core programming language
- **Collections Framework** - ArrayList for task storage
- **Exception Handling** - InputMismatchException, NumberFormatException
- **Object-Oriented Programming** - Classes, encapsulation, methods
- **Input Validation** - Custom validator class with error handling

## 📁 Project Structure
src/
├── ovadek/todolist/
│   ├── Main.java           # Main application class with UI
│   ├── Task.java           # Task entity with properties
│   └── InputValidator.java # Input validation utilities

## 🎯 Key Programming Concepts Demonstrated

- **Object-Oriented Design** - Task class with encapsulation
- **Collections Management** - ArrayList operations (CRUD)
- **Exception Handling** - Try-catch blocks for user input
- **Input Validation** - Custom validator methods
- **String Formatting** - Professional output formatting
- **Method Separation** - Clean, single-responsibility methods

## 🏃‍♂️ How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/todo-list-java.git
   cd todo-list-java

Compile the Java files
bashjavac -d bin src/ovadek/todolist/*.java

Run the application
bashjava -cp bin ovadek.todolist.Main


💡 What I Learned

CRUD Operations - Create, Read, Update, Delete functionality
Input Validation - Handling edge cases and user errors
Collections Framework - Working with ArrayList and iterations
Exception Handling - Graceful error management
Code Organization - Separating concerns into different classes
User Experience - Creating intuitive command-line interfaces

🔧 Potential Improvements

 Save tasks to file for persistence
 Add due dates and priorities
 Implement task categories
 Add search functionality
 Create GUI version

📝 Code Highlights
Clean Input Validation:
javapublic static int getValidInteger(String prompt, int min, int max) {
    while(true) {
        try {
            int value = Integer.parseInt(scanner.nextLine().trim());
            if (value >= min && value <= max) {
                return value;
            }
        } catch (NumberFormatException e) {
            System.out.println("❌ Zadej platné číslo");
        }
    }
}
Professional toString() Implementation:
java@Override
public String toString() {
    return String.format("[%s] %s – %s", 
        (completed ? "✓" : "○"), name, description);
}
👨‍💻 Author

Jindřich Ovádek - Java Developer in Training

Demonstrates strong grasp of OOP principles
Clean, readable code with proper error handling
User-focused design with intuitive interface


This project showcases fundamental Java programming skills including object-oriented design, collections management, exception handling, and user input validation.

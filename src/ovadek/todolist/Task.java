package ovadek.todolist;

public class Task {

  private String name;
  private String description;
  private boolean completed;


  //Zapsání úkolu
  public Task(String name, String description) {
    this.name = name;
    this.description = description;
    this.completed = false;
  }

  //Getters a Setters

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isCompleted() {
    return completed;
  }

  @Override
  public String toString() {
    return String.format("[%s] %s – %s", (completed ? "✓" : "○"), name, description);
  }

  public void complete(){
    this.completed = true;
  }

}

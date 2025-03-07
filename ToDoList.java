import java.util.ArrayList;
import java.util.Collections;
public class ToDoListFunctions{

	public <T>  ArrayList<T> addTasks(){
	ArrayList<T> tasks = new ArrayList<>();
	return tasks;
	}
	
}



















public static void main(String...args){
	
	ArrayList<String> tasks = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	ToDoListFunctions input = new ToDoListFunctions();

	System.out.print("""
	Welcome to Olamide's ToDoList App
	
	1) Add a task
	2) View tasks
	3) Mark task as complete
	4) Delete tasks
	5) Exit App

	Choose what you want to do from the above options:
	""");
	int choice = scanner.nextInt();
	

	switch (choice){
		case 1:
			System.out.print("Enter the task you want to enter: ");
			String userTask = scanner.nextLine();
			tasks.add(userTask);

}

}


}

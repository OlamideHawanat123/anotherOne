import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ToDoListFunctions{
	
ArrayList <String> emptyArraylist = new ArrayList<>();

	public static ArrayList <String> addTasks(){
	return emptyArrayList;
		}
	
	public static void viewTasks(ArrayList<String> tasks){
	for(String elements : tasks){ 
	System.out.print("[]" + elements);
	}
		}

	
	



public static void main(String...args){
	
	ArrayList<String> tasks =  addTasks();
	Scanner scanner = new Scanner(System.in);

	System.out.print("Choose do you want to do from the above options: ");
	int choice = scanner.nextInt();

	do{
	System.out.print("""
	Welcome to Olamide's ToDoList App
	
	1) Add a task
	2) View tasks
	3) Mark task as complete
	4) Delete tasks
	5) Exit App
	""");
	}while(choice == 1);

	
	
	

	switch (choice){
		case 1:
			System.out.print("Enter the task you want to enter: ");
			String userTask = scanner.nextLine();
			tasks.add(userTask);
			
}

}


}

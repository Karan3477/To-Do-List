package com.karan.task;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ToDoList {
	
	private ArrayList<Task> task;
	
	public ToDoList() {
     
		task = new ArrayList<>();
	}
	
	public void addTask(String name)
	{
		task.add(new Task(name));
	}
	
	public void listTask()
	{
		System.out.println("\nTask :");
		for (int i = 0; i < task.size(); i++) {
			Task  t = task.get(i);
		    System.out.println((i + 1 )  + ". " + t.getName() + (t.isCompleted() ? " (Completed)" : ""));	
			
		}
	}
	
	public void markTask(int index)
	{
		if(index >= 0 && index < task.size())
		{
			Task t = task.get(index);
		    t.setCompleted(true);
		    System.out.println("\nTask marks as Completed: " + t.getName());
		}
		else
		{
			System.out.println("\ninvalid task id. ");
		}
	}
	
	public void deleteTask(int index)
	{
		if(index >= 0 && index < task.size())
		{
			Task t = task.remove(index);
			System.out.println("\nTask deleted: " + t.getName());
		}
		else
		{
			System.out.println("\nInvalid Task id. ");
		}
	}
	
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		ToDoList todo = new ToDoList();
		
		while (true) {
            System.out.println("\n============== To Do List Application ============");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice: ");
            
            try {
                int choice = sc.nextInt();
                sc.nextLine();  // Consume the newline
                
                switch (choice) {
                    case 1:
                        System.out.print("\nEnter Task Name: ");
                        String taskname = sc.nextLine();
                        todo.addTask(taskname);
                        System.out.println("\nTask Added: " + taskname);
                        break;
                        
                    case 2:
                        todo.listTask();
                        break;
                        
                    case 3:
                        System.out.print("\nEnter task index to mark as completed: ");
                        int index = sc.nextInt();
                        todo.markTask(index - 1);
                        break;
                        
                    case 4:
                        System.out.print("\nEnter task index to delete: ");
                        int id = sc.nextInt();
                        todo.deleteTask(id - 1);
                        break;
                        
                    case 5:
                        System.out.println("\nExiting...");
                        System.exit(0);
                        break;
                        
                    default:
                        System.out.println("\nInvalid choice, please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input. Please enter a number.");
                sc.next();
            }
        }
		
	}
	
	

}

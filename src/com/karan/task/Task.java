package com.karan.task;

public class Task {
	
	private String name;
	private boolean completed;
	
	
	public Task() {
		// TODO Auto-generated constructor stub
	}

	public Task(String name) {
		super();
		this.name = name;
		this.completed = false;
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


	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

}

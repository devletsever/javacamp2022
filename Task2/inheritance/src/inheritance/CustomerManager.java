package inheritance;

public class CustomerManager extends PersonManager {
	public void List() {
		System.out.println("Müşteri listelendi.");
	}
	
	public void Add() {
		System.out.println("Müşteri eklendi.");
	}
}

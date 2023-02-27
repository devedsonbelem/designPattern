package patternbridge;

import java.util.ArrayList;
import java.util.List;

public class CustomersData extends DataObject {

	private final List<String> customers = new ArrayList<String>();
	private Integer current = 0;
	private String city;

	{
		customers.add("Jim Jones");
		customers.add("Samual Jackson");
		customers.add("Allen Good");
		customers.add("Ann Stills");
		customers.add("Lisa Giolani");
	}

	public CustomersData() {

	}

	public CustomersData(String city) {
		this.city = city;
	}

	@Override
	public void nextRecord() {
		customers.get(++current);
	}

	@Override
	public void priorRecord() {
		if (current > 0) {
			current--;
		}
	}

	@Override
	public void addRecord(String customer) {
		customers.add(customer);
	}

	@Override
	public void deleteRecord(String customer) {
		customers.remove(customer);

	}

	@Override
	public String getCurrentRecord() {
		return customers.get(current);
	}

	@Override
	public void showRecord() {
		System.out.println(customers.get(current));

	}

	@Override
	public void showAllRecords() {
		System.out.println("Customer City: " + city);
		for (String customer : customers) {
			System.out.println("\n" + customer);
		}

	}
}

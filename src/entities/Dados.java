package entities;

import java.util.ArrayList;
import java.util.List;

public class Dados extends Employee {
	private List<Employee> list = new ArrayList<>();
	
	public Dados() {
		super();
	}

	public Dados(List<Employee> list) {
		super();
		this.list = list;
	}

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}
	
}

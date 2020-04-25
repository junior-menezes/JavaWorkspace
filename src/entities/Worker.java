package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	//Quando exite uma composição de um para muitos criamos uma LIST e iniciamos ela
	private List<HourContract> contracts = new ArrayList<HourContract>();
	
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	/*Esse metodo não pode acontecer porque em um sistema real os contratos poderiam ser substituidos
	por outra LIST de contratos
	Os metodos add e remov contrato fazem essa tarefa com segurança.
			public void setContracts(List<HourContract> contracts) {
				this.contracts = contracts;
			}
	*/
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		//criado variavel "soma" para iniciar com o valor do salario base inicialmente e depois será
		//incrementado com as somas dos contratos
		double soma = baseSalary;
		Calendar cal = Calendar.getInstance();
		
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());
			//int c_yaer = cal.get(Calendar.YEAR);
			//int c_month = 1 + cal.get(Calendar.MONTH);
			//if(year == c_yaer && month == c_month) {
			
			if(year == cal.get(Calendar.YEAR) && month == cal.get(Calendar.MONTH)) {
				soma += c.totalValue();
			}
		}
	return soma;
	}
	
}

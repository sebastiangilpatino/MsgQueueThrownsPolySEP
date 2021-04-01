package SEP3;

public class Admin {

	private Department[] departments = new Department[3];

	public Admin(Department[] depts) {
		this.departments = depts;
	}

	public String hourlyCompanyMessage() throws EmptyQueueException {
		String report = "";
		for (int i = 0; i < departments.length; i++) {

			report += format(departments[i].getName(), departments[i].nextMesage());

		}

		return report;
	}

	public String format(String name, String msg) throws EmptyQueueException {
		// String report = String.format(name, msg);
		return name + " : " + msg + "\n";
	}

}

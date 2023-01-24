package payATTENTIONstatic;

public class main {

	static public void main(String... args) {
		System.out.println();

		Business company = new Business();
		System.out.println(company.noEmployees);    // 5
		System.out.println(Business.noEmployees);    // 5

		company = null;
		System.out.println(company.noEmployees);    // 5

		company.noEmployees = 15;
		company.noEmployees = 20;
		Business company2 = new Business();
		company2.noEmployees = 50;
		company.noEmployees = 60;
		System.out.println(company2.noEmployees);    // guess the output

	}
}
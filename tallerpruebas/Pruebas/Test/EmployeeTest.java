package Test;

import static org.junit.Assert.*;

import org.junit.Test;
import main.Employee;
import main.EmployeeType;

public class EmployeeTest {
	
	/* Calcula el salario de un Manager cuando el salario base es de $150
	 * dolares americanos y el mes es par. Es decir 23 de Agosto = 8 PAR
	 */
	@Test
	 public void csManagerParUSDTest() {
		 Employee e = new Employee(150f, "USD", 1f, EmployeeType.Manager);
		 float salarioactual = e.cs();
		 float salarioEsperado = 150.7f;
		 assertEquals(salarioactual, salarioEsperado, 0.1);
	 }
	
	/* Calcula el salario de un Supervisor cuando el salario base es de $100
	 * dolares americanos y el mes es par. Es decir 23 de Agosto = 8 PAR
	 */
	@Test
	 public void csSupervisorParUSDTest() {
		 Employee e = new Employee(100f, "USD", 1f, EmployeeType.Supervisor);
		 float salarioactual = e.cs();
		 float salarioEsperado = 100.35f;
		 assertEquals(salarioactual, salarioEsperado, 0.1);
	 }

}

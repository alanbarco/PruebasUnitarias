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
	


	/* Calcula el salario de un Worker cuando el salario base es de $200
	 * dolares americanos y el mes es par. Es decir 23 de Agosto = 8 PAR
	 */
	@Test
	 public void csWorkerUSDParTest() {
		 Employee e = new Employee(200f, "USD", 1f, EmployeeType.Worker);
		 float salarioactual = e.cs();
		 float salarioEsperado = 200f;
		 assertEquals(salarioactual, salarioEsperado, 0.1);
	 }
	
	/*
	 * Calcula el salario de un Employee Worker cuando su salario base es de 800 EUR la moneda 
	 * y el mes es par. Se prueba con agosto Agosto = 8 PAR
	 */
	 @Test
	 public void csWorkerEURParTest() {
		 Employee e = new Employee(800f, "EUR", 1f, EmployeeType.Worker);
		 float salarioactual = e.cs();
		 float salarioEsperado = 760f;
		 assertEquals(salarioactual, salarioEsperado, 0.1); 
	 }
	 
	 /*
	 * Calcula el salario de un Employee Supervisor cuando su salario base es de 1000 EUR la moneda 
	 * y el mes es impar. Se prueba con Septiembre = 9 IMPAR
	 */
	 @Test
	 public void csSupervisorEURImparTest() {
		 Employee e = new Employee(1000f, "EUR", 1f, EmployeeType.Supervisor);
		 float salarioactual = e.cs();
		 System.out.println(salarioactual);
		 float salarioEsperado = 1014.6833f;
		 assertEquals(salarioactual, salarioEsperado, 0.1);
	 }

}

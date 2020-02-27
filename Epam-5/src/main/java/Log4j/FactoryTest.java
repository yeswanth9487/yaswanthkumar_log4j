package Log4j;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryTest {

	@Test
	public void testCost1() {
		CostGenerate standardCost= new CostGenerate();
		assertEquals(6000.0,standardCost.Cost("standard", 5),0);
	}
	@Test
	public void testCost2() {
		CostGenerate aboveStandardCost= new CostGenerate();
		assertEquals(9000.0,aboveStandardCost.Cost("Abovestandard", 6),0);
	}
	@Test
	public void testCost3() {
		CostGenerate highStandardCost= new CostGenerate();
		assertEquals(12600.0,highStandardCost.Cost("Highstandard", 7),0);
	}
	@Test
	public void testCost4() {
		CostGenerate highStandardFullAutomaticCost= new CostGenerate();
		assertEquals(20000.0,highStandardFullAutomaticCost.Cost("HighstandardFullautomatic", 8),0);
	}
	@Test
	public void testCost5() {	
		Cal empty=Factory.getPlan("");
		assertNull(empty);
	}
}

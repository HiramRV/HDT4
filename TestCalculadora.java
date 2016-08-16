import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

	
			
		Calculadora testCalc=new Calculadora();
		Factory testFac= new Factory();
		Stack testStackVec=new StackVector();
		Stack testStackAL= new StackArrayList();
		Stack testStackLi= new StackList();
		
		@Test
		public void testcalcular(){
			int resultado= testCalc.calcular("2 3 + 4 * 5 /");
			assertEquals(4, resultado);
		}
		
		@Test
		public void testIsEmptyVec(){
			boolean resultado=testStackVec.isEmpty();
			assertEquals(false, resultado);
		}
		
		@Test
		public void testSizeVec(){
			int resultado=testStackVec.size();
			assertEquals(1,resultado);
		}
		
		@Test
		public void testPopVec(){
			testStackVec.push(12);
			int resultado=(int) testStackVec.pop();
			assertEquals(12, resultado);
		}
		@Test
		public void testIsEmptyAL(){
			boolean resultado=testStackAL.isEmpty();
			assertEquals(false, resultado);
		}
		
		@Test
		public void testSizeAL(){
			int resultado=testStackAL.size();
			assertEquals(1,resultado);
		}
		
		@Test
		public void testPopAL(){
			testStackAL.push(12);
			int resultado=(int) testStackAL.pop();
			assertEquals(12, resultado);
		}
		@Test
		public void testIsEmptyL(){
			boolean resultado=testStackLi.isEmpty();
			assertEquals(false, resultado);
		}
		
		@Test
		public void testSizeL(){
			int resultado=testStackLi.size();
			assertEquals(1,resultado);
		}
		
		@Test
		public void testPopL(){
			testStackLi
			.push(12);
			int resultado=(int) testStackLi.pop();
			assertEquals(12, resultado);
		}
		
		
		

}
package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {
	@BeforeEach
	void setUp()throws Exception {}

	@Test
	void test1() {
	      assertEquals (Welcome.welcome("bob"),"Hello, Bob");
	      assertEquals (Welcome.welcome("Bob"),"Hello, Bob");
	}
	@Test
	void test2() {
	      assertEquals (Welcome.welcome(" "),"Hello, my friend");
	}
	@Test
	void test3() {
	      assertEquals (Welcome.welcome("JERRY"),"HELLO, JERRY!");
	}
	@Test 
	void test4() {
	      assertEquals (Welcome.welcome("bob  "),"Hello, Bob");
	}
//	@Test
//	void test5() {
//	      //assertEquals (Welcome.welcome("amy,bob"),"Hello, Amy, Bob");
//	      //assertEquals (Welcome.welcome("amy ,bob"),"Hello, Amy, Bob"); 
//	      assertEquals (Welcome.welcome("amy,bob "),"Hello, Amy, Bob");
//	}
//	@Test
//	void test6() {
//		  assertEquals (Welcome.welcome("amy,bob,jerry "),"Hello, Amy, Bob, Jerry");
//	}
	@Test	void test7() {
		  assertEquals (Welcome.welcome("amy,BOB,jerry "),"Hello, Amy, Jerry. AND HELLO, BOB !");
	}
	
//	@Test
//	void test8() {
//		  assertEquals (Welcome.welcome("amy,Bob,jerry "),"Hello, Amy, Bob and Jerry");
//		  assertEquals (Welcome.welcome("bob, AMY,jerry,JACK"),"Hello, Bob and Jerry. AND HELLO, AMY AND JACK !");
//	}
//	  
	
	
	
	

}

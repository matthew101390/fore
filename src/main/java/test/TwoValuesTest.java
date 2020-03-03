package test;
import operation.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/** 
* TwoValues Tester. 
* 
* @author <Authors name> 
* @since <pre>Mar 2, 2020</pre> 
* @version 1.0 
*/ 
public class TwoValuesTest {
/** 
* 
* Method: Add() 
* 
*/ 
@Test
public void testAdd() throws Exception {
     assertEquals(3, new TwoValues(1, 2).add());
} 

/** 
* 
* Method: minus() 
* 
*/ 
@Test
public void testMinus() throws Exception {
     assertEquals(0, new TwoValues(1, 2).minus());
} 


} 

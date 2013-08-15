package com.biogenidec.datasciences.codetest;

import static org.junit.Assert.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class Test2 {

	private static final Log log = LogFactory.getLog(Test2.class);

	/**
	 * Calculate all the possible permutations of the letters in the input
	 * string and sort the results to match the desired output string.
	 */
	@Test
	public void test() {

		String input = "ABC";
		String desiredoutput = "ABC ACB BAC BCA CAB CBA";

		String computedoutput = "";

		/*
		 * Your code - begin
		 */

		/*
		 * Your code - end
		 */

		log.debug("Input:           " + input);
		log.debug("Desired output:  " + desiredoutput);
		log.debug("Computed output: " + computedoutput);

		assertEquals("Computed output is not correct", desiredoutput,
				computedoutput);

	}

}

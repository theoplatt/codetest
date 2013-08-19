package com.biogenidec.datasciences.codetest;

import static org.junit.Assert.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class Test1 {

	private static final Log log = LogFactory.getLog(Test1.class);

	/**
	 * Sort the input string and put the results in the computedoutput string.
	 * The computedoutput string should match the desiredoutput string.
	 */
	@Test
	public void test() {

		String input = "MNO DEF ABC GHI JKL";
		String desiredoutput = "ABC DEF GHI JKL MNO";

		String computedoutput = "";

		/*
		 * Your code - begin **********************************************
		 */

		/*
		 * Your code - end ************************************************
		 */

		log.debug("Input:           " + input);
		log.debug("Desired output:  " + desiredoutput);
		log.debug("Computed output: " + computedoutput);

		assertEquals("Computed output is not correct", desiredoutput,
				computedoutput);

	}

}

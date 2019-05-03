package com.hatim.org.design.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

import com.hatim.org.design.patterns.singleton.DatabasConnectionSIG;

public class DatabasConnectionSIGTest {

	@Test
	public void testConnect() {
		
		DatabasConnectionSIG dbcSigSingleton_1=DatabasConnectionSIG.getInstance();
		DatabasConnectionSIG dbcSigSingleton_2=DatabasConnectionSIG.getInstance();
		
		Assert.assertNotNull(dbcSigSingleton_1);
		Assert.assertNotNull(dbcSigSingleton_2);
		
		Assert.assertEquals(dbcSigSingleton_1, dbcSigSingleton_2);
	}

}

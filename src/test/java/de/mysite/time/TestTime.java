package de.mysite.time;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTime {

	@Test
	public void test() {
		String dt=new java.text.SimpleDateFormat(("hh:mm aaa")).format(java.util.Calendar.getInstance().getTime());
        assertNotNull(dt);
	}

}

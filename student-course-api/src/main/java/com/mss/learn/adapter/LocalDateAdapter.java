package com.mss.learn.adapter;

import java.time.LocalDate;

public class LocalDateAdapter {

	public static LocalDate unMarshal(String value) {
		return LocalDate.parse(value);
	}
	
	public static String marshal(LocalDate value) {
		if(value==null)
			return null;
		return value.toString();
	}
}

package com.java.practice;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertStringToDateFormat {

	public static void main(String[] args) throws ParseException {
		String sDate1 = "20180228";

		System.out.println(formatDate(sDate1));

	}

	public static String formatDate(String sDate1) throws ParseException {
		Date date1 = new SimpleDateFormat("yyyymmdd").parse(sDate1);
		DateFormat targetFormat = new SimpleDateFormat("mm/dd/yyyy");
		String formattedDate = targetFormat.format(date1);
		
		if(formattedDate.startsWith("0")) {
			return formattedDate.replaceFirst("0","");
		}
		
		return formattedDate;
	}

}

///yyyymmdd to mm/dd/yyyy
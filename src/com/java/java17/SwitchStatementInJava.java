package com.java.java17;

public class SwitchStatementInJava {

	public static void main(String[] args) {

		String weekday = "Tuesday";
		String result1 = "";
		String result2 = "";
		String result3 = "";

		result1 = switch (weekday) {
		case "Monday" -> "6AM";
		case "Tuesday" -> "7AM";
		default -> "8AM";
		};

		result2 = switch (weekday) {
		case "Monday":
			yield "6AM";
		case "Tuesday":
			yield "7AM";
		default:
			yield "8AM";
		};

		Object obj = null;

		result3 = switch (obj) {
		case Integer i -> "It is an integer";
		case String s -> "It is a string";
		case Double d -> "It is a Double";
		case null -> "Its a null value";
		//case Employee employee && employee.getDept().equals("IT") -> "IT 
		default -> "It is none of the known data types";
		};

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}
}

package com.java.java8;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntBiFunction;

public class LE04 {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> BiF= (a,b)->a+b;
		System.out.println(BiF.apply(7, 2));
		
		ToIntBiFunction<Integer, Integer> ToIntBiF = (a,b)->a+b;
		System.out.println(ToIntBiF.applyAsInt(90, 2));
		
		IntBinaryOperator IntBo = (a,b)->a+b;
		System.out.println(IntBo.applyAsInt(80, 2));
		
		BinaryOperator<Integer> bi = (a,b)->a+b;
		System.out.println(bi.apply(80, 20));
	}

}

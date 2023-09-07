package com.java.practice;
import java.util.ArrayList;

public class FindAdjacentElementsOfAGivenElementInAMatrix {

	public static void main(String[] args) {
		
		int[][] arr = {{2,5,7,5},
				       {5,7,6,9},
				       {6,1,2,5},
				       {5,8,6,2}};
		
		int x = 3;
		int y = 2;
		
		int begX=0,endX=0,begY=0,endY=0;
		
		if(x-1>=0) {
			begX=x-1;
		}else {
			begX=0;
		}
		
		if(y-1>=0) {
			begY=y-1;
		}else {
			begY=0;
		}
		if(x+1<arr.length) {
			endX=x+1;
		}else {
			endX=arr.length-1;
		}
		if(y+1<arr[0].length) {
			endY=y+1;
		}else {
			endY=arr[0].length-1;
		}
		
		System.out.println(begX+","+begY+" and "+endX+","+endY);
		
		ArrayList<Integer> elements = new ArrayList<Integer>();
		ArrayList<Integer> diagonalElements = new ArrayList<Integer>();
		ArrayList<Integer> nonDiagonalElements = new ArrayList<Integer>();
		
		for(int i=begX;i<=endX;i++) {
			for(int j=begY;j<=endY;j++) {
				if(i==x&&j==y) {
					continue;
				}else {
					elements.add(arr[i][j]);
					if(i==x || j==y) {
						nonDiagonalElements.add(arr[i][j]);
					}else {
						diagonalElements.add(arr[i][j]);
					}
				}
			}
		}
		
		System.out.println("Adjacent Elements     :"+elements);
		System.out.println("Diagonal Elements     :"+diagonalElements);
		System.out.println("Non Diagonal Elements :"+nonDiagonalElements);

	}

}

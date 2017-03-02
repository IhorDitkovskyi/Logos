package Lesson6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int [][] array = new int[3][3];
		print(array);
		Scanner sc = new Scanner (System.in);
		while(true){
			user(array, sc);
			print(array);
			System.out.println();
			cpu(array);
			print(array);
		//	if (whoWins)
		}
		
	}
	
	static boolean whoWins(int[][]array, int n){
		if(array[0][0]==n&&array[0][1]==n&&array[0][2]==n){
			return true;
		}
		if(array[1][0]==n&&array[1][1]==n&&array[1][2]==n){
			return true;
		}
		if(array[2][0]==n&&array[2][1]==n&&array[2][2]==n){
			return true;
		}
		if(array[0][0]==n&&array[0][1]==n&&array[0][2]==n){
			return true;
		}
		if(array[0][0]==n&&array[0][1]==n&&array[0][2]==n){
			return true;
		}
		if(array[0][0]==n&&array[0][1]==n&&array[0][2]==n){
			return true;
		}
		if(array[0][0]==n&&array[0][1]==n&&array[0][2]==n){
			return true;
		}
		return false;
	}
	
	static void user(int[][] array, Scanner sc){
		System.out.println("Enter x:");
		int x = sc.nextInt()-1;
		System.out.println("Enter y:");
		int y = sc.nextInt()-1;
		array [y][x]=1;
	}
	
	static void cpu(int[][] array){
		int x= random(0, 2);
		int y= random(0, 2);
		if(array[y][x]==0){
			array[y][x]=2;
		}else{
			cpu(array);
		}
	}

	static void print(int [][] array){
		for(int i=0; i< array.length; i++){
			for(int j=0; j< array.length; j++){
				System.out.println(array[i][j]+" ");
			}
			System.out.println();	
		}
	}
	
	static int random(int min, int max) {
		return (int) Math.round(Math.random() * (max - min) + min);
	}
}

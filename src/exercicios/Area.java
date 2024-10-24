package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que leia três valores com ponto flutuante de dupla
		 * precisão: A, B e C. Em seguida, calcule e mostre: 
		 * a) a área do triângulo retângulo que tem A por base e C por altura. 
		 * b) a área do círculo de raio C.(pi = 3.14159) 
		 * c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B. 
		 * e) a área do retângulo que tem lados A e B. 
		 * Entrada O arquivo de entrada contém três valores com um dígito após o
		 * ponto decimal.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		double pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double trianguloRetangulo = A * C / 2;
		double circulo = pi * Math.pow(C, 2);
		double trapezio = ((A + B) * C) / 2;
		double quadrado = Math.pow(B, 2);
		double retangulo = A * B;
		
		System.out.println("TRIANGULO: " + String.format("%.3f", trianguloRetangulo));
		System.out.println("CIRCULO: " + String.format("%.3f", circulo));
		System.out.println("TRAPEZIO: " + String.format("%.3f", trapezio));
		System.out.println("QUADRADO: " + String.format("%.3f", quadrado));
		System.out.println("RETANGULO: " + String.format("%.3f", retangulo));
	}

}

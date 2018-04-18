package edu.ap.spring;

import java.awt.Point;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component
public class Exam {
	
	public List<Integer> numberList() {
		List<Integer> numberList = new ArrayList<Integer>();
		for(int i = 0; i<20; i++ ) {
			numberList.add(i);
		}
		return numberList;
	}
	public List<Point> pointList(){
		List<Point> pList = new ArrayList<Point>();
		pList.add(new Point(1, 2));
		pList.add(new Point(60, 50));
		pList.add(new Point(50, 3));
		return pList;
	}
	// Maak gebruik van lambdas en streams om een array met alle
	// priemgetallen terug te geven
	// 2 punten
	public int[] getPrimes(int[] numbers) {
		List<Integer> nList = numberList();
		Stream<Integer> primes = nList
			.stream()
			.filter(n -> n%2 != 0);
		int[] output = null;
		return output;
	}
	
	// Maak gebruik van lambdas en streams alle lowercase characters
	// te tellen in de gegeven string
	// 1 punt
	public int countLowercaseCharacters(String string) {
        string = "aklfajAAAklkjfB";
        char[] charArray = string.toCharArray();
        Stream<Character> charStream = new String(charArray)
        		.chars()
        		.mapToObj(i->(char)i)
        		.filter(c -> Character.isLowerCase(c));
        int amount = (int) charStream.count();	
        
        return amount;
	}
	
	// Maak gebruik van lambdas en streams om de som van alle
	// x-coordinaten uit de lijst van points te berekenen
	// 1 punt
	public int sumOfX(List<Point> points) {
		List<Point> pList = pointList();
		
		pList
			.stream();
		int amount = (int) pList.size();
		return amount;
	}
	
	// Maak gebruik van lambdas en streams om een comma-separated
	// string te maken die alle x-coordinaten bevat die groter of gelijk 
	// zijn aan twee
	// 2 punten
	public String getXOverTwo(List<Point> points) {
		List<Point> pList = pointList();
		
		pList.stream()
		.filter((x) -> x.getX() >=2);
		String output = pList.toString();
		
		return output;
	}
}

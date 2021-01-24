package _06_animals_inheritance;

import java.awt.Color;

public class Animal {
String name;
String color;
boolean isHappy;
Animal(String name, String color, boolean isHappy ){
	this.name = name;
	this.color = color;
	this.isHappy = isHappy;
	
}
void printName() {
	System.out.println(name);
	
}
void play() {
	System.out.println(name + " wants to play.");
}
void eat() {
	System.out.println(name + " is hungry.");
}
void sleep() {
	System.out.println(name + " is tired.");
}
}

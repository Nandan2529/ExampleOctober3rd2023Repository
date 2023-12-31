package com.sgtesting.classassignment;

class Fruit
{
	String FruitName;
	String FruitWeight;
	int FruitPrice;
	String FruitColor;
}

class Flower
{
	String FlowerName;
	String FlowerWeight;
	int FlowerPrice;
	String FlowerColor;
}

class Vegetable
{
	String VegetableName;
	String VegetableWeight;
	int VegetablePrice;
	String VegetableColor;
}

public class ObjectClassForFruitFlowerVegetable {

	public static void main(String[] args) {
		// Object Class For Fruit Flower Vegetable
		Fruit obj1 = new Fruit();
		System.out.println("FRUIT DETAILS:");
		System.out.println("------------------------");
		obj1.FruitName = "Apple";
		System.out.println("Fruit Name: "+obj1.FruitName);
		obj1.FruitWeight = "1 KG";
		System.out.println("Fruit Quantity: "+obj1.FruitWeight);
		obj1.FruitPrice = 80;
		System.out.println("Fruit Price: "+obj1.FruitPrice);
		obj1.FruitColor = "Red";
		System.out.println("Fruit Color: "+obj1.FruitColor);
		System.out.println("************************");


		Flower obj2 = new Flower();

		obj2.FlowerName = "SunFlower";
		System.out.println("Flower Name: "+obj2.FlowerName);
		obj2.FlowerWeight = "2 KG";
		System.out.println("Flower Weight: "+obj2.FlowerWeight);
		obj2.FlowerPrice = 180;
		System.out.println("Flower Price: "+obj2.FlowerPrice);
		obj2.FlowerColor = "Yellow";
		System.out.println("Flower Color: "+obj2.FlowerColor);
		System.out.println("************************");

		Vegetable obj3 = new Vegetable();
		obj3.VegetableName = "cerrot";
		System.out.println("Vegetable Name: "+obj3.VegetableName);
		obj3.VegetableWeight = "1 KG";
		System.out.println("Vegetable Weight: "+obj3.VegetableWeight);
		obj3.VegetablePrice = 70;
		System.out.println("Vegetable Price: "+obj3.VegetablePrice);
		obj3.VegetableColor = "Orange";
		System.out.println("Vegetable Color: "+obj3.VegetableColor);
		System.out.println("************************");
	}
}
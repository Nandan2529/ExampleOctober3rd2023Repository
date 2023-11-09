package com.sgtesting.noargsconstructor;

class Fruit
{
	String FruitName;
	String FruitWeight;
	int FruitPrice;
	String FruitColor;
	Fruit ()
	{
		System.out.println("Fruit DETAILS:");
		System.out.println("------------------------");
		FruitName = "Orange";
		System.out.println("Fruit Name: "+FruitName);
		FruitWeight = "2 KG";
		System.out.println("Fruit Quantity: "+FruitWeight);
		FruitPrice = 50;
		System.out.println("Fruit Price: "+FruitPrice);
		FruitColor = "Orange";
		System.out.println("Fruit Color: "+FruitColor);
		System.out.println("************************");
	}
}

class Flower
{
	String FlowerName;
	String FlowerWeight;
	int FlowerPrice;
	String FlowerColor;
	Flower ()
	{
		System.out.println("FLOWER DETAILS:");
		System.out.println("------------------------");
		FlowerName = "Rose";
		System.out.println("Flower Name: "+FlowerName);
		FlowerWeight = "1 KG";
		System.out.println("Flower Weight: "+FlowerWeight);
		FlowerPrice = 100;
		System.out.println("Flower Price: "+FlowerPrice);
		FlowerColor = "Red";
		System.out.println("Flower Color: "+FlowerColor);
		System.out.println("************************");	
	}
}

class Vegetable
{
	String VegetableName;
	String VegetableWeight;
	int VegetablePrice;
	String VegetableColor;
	Vegetable ()
	{
		System.out.println("VEGETABLE DETAILS:");
		System.out.println("------------------------");
		VegetableName = "Onion";
		System.out.println("Vegetable Name: "+VegetableName);
		VegetableWeight = "1 KG";
		System.out.println("Vegetable Weight: "+VegetableWeight);
		VegetablePrice = 60;
		System.out.println("Vegetable Price: "+VegetablePrice);
		VegetableColor = "Purple";
		System.out.println("Vegetable Color: "+VegetableColor);
		System.out.println("************************");	
	}
}

public class ObjectClassForFruitFlowerVegetable {

	public static void main(String[] args) {
		// Object Class For Fruit Flower Vegetable
		Fruit obj1 = new Fruit();
		
		Flower obj2 = new Flower();
		
		Vegetable obj3 = new Vegetable();
		
	}
}
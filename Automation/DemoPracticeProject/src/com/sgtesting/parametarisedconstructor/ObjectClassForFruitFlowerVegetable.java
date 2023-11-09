package com.sgtesting.parametarisedconstructor;

class Fruit
{
	String FruitName;
	String FruitWeight;
	int FruitPrice;
	String FruitColor;
	Fruit (String FruitName,String FruitWeight,int FruitPrice,String FruitColor)
	{
		System.out.println("Fruit DETAILS:");
		System.out.println("------------------------");
		FruitName = FruitName;
		System.out.println("Fruit Name: "+FruitName);
		FruitWeight = FruitWeight;
		System.out.println("Fruit Quantity: "+FruitWeight);
		FruitPrice = FruitPrice;
		System.out.println("Fruit Price: "+FruitPrice);
		FruitColor = FruitColor;
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
	Flower (String FlowerName,String FlowerWeight,int FlowerPrice,String FlowerColor)
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
	Vegetable (String VegetableName,String VegetableWeight,int VegetablePrice,String VegetableColor)
	{
		System.out.println("VEGETABLE DETAILS:");
		System.out.println("------------------------");
		VegetableName = VegetableName;
		System.out.println("Vegetable Name: "+VegetableName);
		VegetableWeight = VegetableWeight;
		System.out.println("Vegetable Weight: "+VegetableWeight);
		VegetablePrice = VegetablePrice;
		System.out.println("Vegetable Price: "+VegetablePrice);
		VegetableColor = VegetableColor;
		System.out.println("Vegetable Color: "+VegetableColor);
		System.out.println("************************");	
	}
}

public class ObjectClassForFruitFlowerVegetable {

	public static void main(String[] args) {
		// Object Class For Fruit Flower Vegetable
		Fruit obj1 = new Fruit("Orange","2 Kg",50,"Orange");
		
		Flower obj2 = new Flower( "Rose","1 Kg",100,"Red");
		
		Vegetable obj3 = new Vegetable("Onion","1 KG",60,"Purple");
		
	}
}
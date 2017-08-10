class Vehicle
{
	int wheel,capacity;
	Vehicle(int wh,int cap)
	{
		wheel=wh;
		capacity=cap;
	}
	
	void show()
	{
		System.out.println("WHEELS:"+wheel);
		System.out.println("CAPACITY:"+capacity);
	}
}

class Bike extends Vehicle
{
	int speed;
	Bike(int wh,int cap,int spe)
	{
		super(wh,cap);
		speed=spe;
	}
	void show()
	{	System.out.println("\n BIKE:");
		super.show();
		System.out.println("SPEED:"+speed);
	}
}

class Plane extends Vehicle
{
	int speed;
	Plane(int wh,int cap,int spe)
	{
		super(wh,cap);
		speed=spe;
	}
	void show()
	{	System.out.println("\n PLANE:");
		super.show();
		System.out.println("SPEED:"+speed);
	}
}

class Car extends Vehicle
{
	int speed;
	Car(int wh,int cap,int spe)
	{
		super(wh,cap);
		speed=spe;
	}
	void show()
	{	System.out.println("\n CAR:");
		super.show();
		System.out.println("SPEED:"+speed);
	}
}


public class Ass32
{
	public static void main(String[] st)
	{
		Bike b=new Bike(2,2,200);
		b.show();		
		Plane p=new Plane(16,100,900);
		p.show();		
		Car c=new Car(4,4,300);
		c.show();		
	}
}
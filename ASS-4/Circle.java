package pack1;
import pack1.*;
public class Circle implements S2D,S3D
{
	int r;
	public Circle(int rad)
	{
		r=rad;
	}
	
	public float area()
	{
		return pi*r*r; 
	}
	public float volume()
	{
		return 4*pi*r*r*r/3;
	}
}
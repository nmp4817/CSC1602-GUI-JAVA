package pack1;
public class Triangle implements S2D,S3D
{
	int h,b;
	public Triangle(int ba,int he)
	{
		b=ba;
		h=he;
	}
	public float area()
	{
		return (float)0.5*b*h;	
	}
	
	public float volume()
	{
		return (float)0.5*b*h*h/3; 
	}
}
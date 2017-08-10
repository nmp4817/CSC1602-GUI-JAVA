package pack1;
public class Square implements S2D,S3D
{
	int l;
	public Square(int le)
	{
		l=le;
	}
	public float area()
	{
		return l*l;
	}
	public float volume()
	{
		return l*l*l;
	}
}
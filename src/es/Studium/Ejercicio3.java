package es.Studium;

public class Ejercicio3
{
	public static void main(String[] args)
	{
		int tabla[] = new int[10];
		int i;
		try
		{
			for(i=0; i<11; i++)
			{
				tabla[i] = i*2;
			}
		}
		catch(ArrayIndexOutOfBoundsException err)
		{
			System.out.println("Tabla solo puede contener 10 valores");
		}
	}
}
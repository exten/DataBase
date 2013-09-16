package zero.hibernate.mongodb.create.data;

import java.util.Random;

import org.hibernate.CustomEntityDirtinessStrategy;

import zero.hibernate.entity.Customes;

public class CreateData
{
	public static void main(String[] args)
	{
		char chr = 'һ';
		System.out.println(0xf + " >>> " + (int)chr);
		System.out.println(Integer.toBinaryString(0xf) + " >>> " + Integer.toBinaryString((int)chr));
		
		System.out.println(Integer.toBinaryString(0xf) + " >>> " + Integer.toBinaryString((int)chr >> 12));
		System.out.println(0xf & chr >> 12);
		System.out.println(Integer.toBinaryString(0xf & chr >> 12));
		
		System.out.println(Integer.toBinaryString(0xf) + " >>> " + Integer.toBinaryString((int)chr >> 8));
		System.out.println(0xf & chr >> 8);
		System.out.println(Integer.toBinaryString(0xf & chr >> 8));
		
		System.out.println(Integer.toBinaryString(0xf) + " >>> " + Integer.toBinaryString((int)chr >> 4));
		System.out.println(0xf & chr >> 4);
		System.out.println(Integer.toBinaryString(0xf & chr >> 4));
		
		System.out.println(Integer.toBinaryString(0xf) + " >>> " + Integer.toBinaryString((int)chr >> 0));
		System.out.println(0xf & chr >> 0);
		System.out.println(Integer.toBinaryString(0xf & chr >> 0));
		
	}

	private void createCustome()
	{
		Customes customes = new Customes();

		Random r = new Random(10);

		customes.setAdds("");
	}

}

package zero.mor.test;

import java.util.Random;

import org.hibernate.CustomEntityDirtinessStrategy;

import zero.hibernate.entity.Customes;
//exten 2009.0.0
public class CharCode
{
	public static void main(String[] args)
	{
		CharCode charCose = new CharCode();
		
//		charCose.Mor();
//		charCose.BinaryToHex();
		charCose.BinaryToTen();
	}

	private void BinaryToHex()
	{
		System.out.println("  BinaryToHex >>> ");
		char chr = 'ä¸';
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

	
	private void BinaryToTen()
	{
		System.out.println("  BinaryToTen >>> ");
		char chr = 'ï£';
		System.out.println(10 + " >>> " + (int)chr);
		System.out.println(Integer.toBinaryString(10) + " >>> " + Integer.toBinaryString((int)chr));
		System.out.println(String.valueOf((char)(int)chr));
		System.out.println(String.valueOf((char)(int)chr >> 2));
		
	}
	
	
	private void Mor()
	{
		System.out.println("  Mor >>> ");
		char chr = 'é”';
		char chr2 = 'ä¸';
		System.out.println((int) chr);
		System.out.println((int) chr2);
		
		System.out.println((int) chr - (int) chr2);
		
		System.out.println(0x3000);
		
		System.out.println((char) 0x7ECF);
		System.out.println((char) 0x3000);
		
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toBinaryString(-10));
		
		System.out.println(Integer.toString(10, 2));
		
		System.out.println(Integer.toBinaryString((int) chr));
		
		System.out.println("0x" + Integer.toHexString('ç»'));
		System.out.println(("0x" + Integer.toHexString('ç»')).toCharArray());
		
		System.out.println((int) chr & 0xF);
		
		System.out.println(Integer.toString(0xF,2));
		System.out.println(Integer.toString((int) chr,2));
		
		System.out.println(Integer.toBinaryString(15));
		System.out.println(Integer.toBinaryString(1));


	}
	
}

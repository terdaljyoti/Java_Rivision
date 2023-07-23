package NumPattern;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Pattern_1 
{	/*

				1
				12
				123
				1234
*/

	public static void main(String[] args)
	{
		int no=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=no;j++)
			{
				System.out.print(j);
			}
			no++;
			
			System.out.println();
		}
	}
}

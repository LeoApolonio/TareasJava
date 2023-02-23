/*
Apolonio Villagómez Leonardo
ICO
2208
*/

public class Tarea1
{
	public static void main(String args[])
	{
		//1.3.1.1
		String s = "Hola";
		int xx = s.length();

		//1.3.1.2
		String s1 = "Hola";
		boolean b1 = s1.isEmpty();

		String s2 = "";
		boolean b2 = s2.isEmpty();

		//1.3.1.3
		String t = "Hola";
		for(int i=0; i<t.length(); i++)
		{
			char c = t.charAt(i);
			System.out.println(c);
		}

		//1.3.1.4
		String x = "Hola";
		String y = "Hola";
		if(x.equals(y))
		{
			System.out.println("Si pasa por aqui");
		}

		//1.3.1.5
		String a = "Hola, como estas?";
		int p1 = a.indexOf('a');
		int p2 = a.lastIndexOf('a');

		//1.3.1.6
		String aa = "Hola, como estas? estas como querias?";
		int q1 = aa.indexOf("como");
		int q2 = aa.indexOf("estas");
		int q3 = aa.lastIndexOf("como");

		//1.3.1.7
		String c = "Hola, como estas?";
		String may = c.toUpperCase();
		String min = c.toLowerCase();

		//1.3.1.8
		String e = "Hola, como estas";
		String e1 = e.substring(0,4);
		String e2 = e.substring(6,10);
		String e3 = e.substring(11);

		//1.3.1.9
		String a1 = "1234";
		int i = Integer.parseInt(s1);
		String t1 = Integer.toString(i);

		String a2 = "1234.56";
		double d = Double.parseDouble(s2);
		String t2 = Double.toString(d);

		//1.3.1.10
		String ee = "Hola, ";
		String f = "que tal?";
		String g = e+f;

		//1.3.2
		String h = "Hola";
		h = "chau";
		System.out.println(h);

		String j = "Hola";
		j += ", chau";
		System.out.println(j);

		//1.3.3
		//1.3.3.1
		StringBuilder sb = new StringBuilder();
		sb.append("Hola, ");
		sb.append("chau");
		System.out.println(sb);

		//1.3.3.2
		StringBuilder kb = new StringBuilder("Hola");
		kb.setCharAt(2,'X');
		System.out.println(kb);
	}
}

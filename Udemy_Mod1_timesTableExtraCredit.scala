// Modified times table that only prints the product if it contains a "4" or "6"

var a = 1; 
var b = 1; 
while (a < 6)
{
	b = 1;
	while ( b < 6)
	{ 
		val s = a * b;
		if (s.toString.contains("4") || s.toString.contains("6") )
		{
			println(s"$a times $b is equal to ${a*b}") 
		}
		b += 1;
	}
	a += 1
}

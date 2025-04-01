# include <stdio.h>
# include <iostream>
# include <stdlib.h>
# include <string.h>
# define MAX 10
/*
data:
consegna:
*/
using namespace std;

int main()
{
	char c = 'D';
	int i;
	char b;
	
	//printf("gne gne ");
	//scanf("%c", &c);
	
	/*if (islower(c))
	{
		printf("is low");
	}else
	{
		tolower(c);
		printf("%c",c);
	}
	
	if (isupper(c))
	{
		printf("is up");
	}else
	{
		toupper(c);
		printf("%c",c);
	}
	if (isspace(c))
	{
		printf("is space");
	}
	*/
	
	char str[MAX] = "DIOCANE";
	
	//printf("to lower %c - %c", c, tolower(c));
	
	for (i=0; i<MAX; i++)
	{
		if (isupper(str[i]))
		{
			b=tolower(str[i]);
			printf("%c \t", b);	
		}
	}
	
	
		
	 		
	


system("pause");
}


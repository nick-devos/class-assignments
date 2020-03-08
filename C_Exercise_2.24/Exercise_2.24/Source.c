//Exercise 2.24
//Programmer: Nick DeVos
//Date: 9/11/18

#include <stdio.h>

int main()
{
	int n;

	printf("Enter an integer\n");
	scanf_s("%d", &n);

	if (n % 2 == 0)
		printf("The integer you entered is even\n");
	else
		printf("The integer you entered is odd\n");

	return 0;
}
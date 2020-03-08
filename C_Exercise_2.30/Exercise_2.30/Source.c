//Exercise 2.30
//Programmer: Nick DeVos
//Date: 9/11/18

#include <stdio.h>

int main()
{
	int num1, num2, num3, num4, num5, fullNumber;

	printf("Enter a five digit integer\n");
	scanf_s("%d", &fullNumber);

	num5 = (fullNumber / 10000) % 10;
	printf("%d\t", num5);

	num4 = (fullNumber / 1000) % 10;
	printf("%d\t", num4);

	num3 = (fullNumber / 100) % 10;
	printf("%d\t", num3);

	num2 = (fullNumber / 10) % 10;
	printf("%d\t", num2);

	num1 = (fullNumber / 1) % 10;
	printf("%d\n", num1);

	return 0;
}
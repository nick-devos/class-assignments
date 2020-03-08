//Exercise 2.23
//Programmer: Nick DeVos
//Date: 9/11/18

#include <stdio.h>

int main()
{
	int num1, num2, num3, smallest, largest;

	printf("Enter 3 integers\n");
	scanf_s("%d %d %d", &num1, &num2, &num3);

	smallest = num1;
	if (smallest > num2)
		smallest = num2;
	if (smallest > num3)
		smallest = num3;

	largest = num1;
	if (largest < num2)
		largest = num2;
	if (largest < num3)
		largest = num3;

	printf("Smallest is %d\n", smallest);
	printf("Largest is %d\n", largest);

	return 0;
}
//Exercise 2.19
//Programmer: Nick DeVos
//Date: 9/11/18

#include <stdio.h>

int main()
{
	int num1, num2, num3, smallest, largest;

	printf("Enter 3 integers\n");
	scanf_s("%d", &num1);
	scanf_s("%d", &num2);
	scanf_s("%d", &num3);

	printf("\nSum is %d\n", num1 + num2 + num3);
	printf("Average is %d\n", (num1 + num2 + num3) / 3);
	printf("Product is %d\n", num1*num2*num3);

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
// Chapter 8: Programming Challenge 9
// DeVosNick_C8P9
// Name: Nick DeVos
// Date: 11/12/2016
#include<iostream>
#include<iomanip>
using namespace std;

// Prototypes
void bubbleSort(int[], int);
void selectionSort(int[], int);

int main()
{
	// Declaring variables
	const int ARRAY_SIZE = 20;
	int firstArray[ARRAY_SIZE] = { 47,189,65,360,12,25,175,8,62,103,87,62,113,146,557,168,27,180,419,20 };
	int secondArray[ARRAY_SIZE] = { 47,189,65,360,12,25,175,8,62,103,87,62,113,146,557,168,27,180,419,20 };

	cout << "Number of exchanges made: " << endl;
	cout << "-------------------------" << endl;

	// Call functions
	bubbleSort(firstArray, ARRAY_SIZE);
	selectionSort(secondArray, ARRAY_SIZE);
}

void bubbleSort(int array[], int size)
{
	// Declaring variables
	bool swap;
	int temp, iterations = 0;

	// Bubble sort function
	do
	{
		swap = false;
		for (int count = 0; count < (size - 1); count++)
		{
			if (array[count] > array[count + 1])
			{
				temp = array[count];
				array[count] = array[count + 1];
				array[count + 1] = temp;
				swap = true;
				iterations++;
			}
		}
	} while (swap);

	// Print number of times numbers were switched
	cout << "Bubble sort: " << setw(12) << iterations << endl;
}

void selectionSort(int array[], int size)
{
	// Variables
	int startScan, minIndex, minValue;
	int iterations = 0;

	// Selection sort function
	for (startScan = 0; startScan < (size - 1); startScan++)
	{
		minIndex = startScan;
		minValue = array[startScan];
		for (int index = startScan + 1; index < size; index++)
		{
			if (array[index] < minValue)
			{
				minValue = array[index];
				minIndex = index;
				iterations++;
			}
		}
		array[minIndex] = array[startScan];
		array[startScan] = minValue;
	}
	cout << "Selection sort: " << setw(9) << iterations << endl << endl;
}
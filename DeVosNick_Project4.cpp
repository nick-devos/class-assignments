// Project 4
// DeVosNick_Project4.cpp
// Name: Nick DeVos
// Date: 11/19/2016
#include<iostream>
#include<string>
#include<vector>
#include<iomanip>
#include<fstream>
using namespace std;

// Prototypes
void outputResults();
void storeInfo();

// Global variables
string courseID;
vector<double> labGrades;
vector<double> projectGrades;
vector<double> testGrades;
double finalExam;
double finalGrade;
string studentFirstName = "Nick";
string studentLastName = "DeVos";
double testAvg;
double labAvg;
double projectAvg;
char letterGrade;
bool pass = true;

int main()
{
	// Variables
	char choice;
	bool testsEntered = false, labsEntered = false, projectsEntered = false, finalExamEntered = false;
	int tempValue;

	// Ask for input
	cout << "What is the course ID? ";
	getline(cin, courseID);
	while (testsEntered == false || labsEntered == false || projectsEntered == false || finalExamEntered == false)
	{
		cout << "Grade Categories: (a)Tests (b)Labs (c)Projects (d)Final Exam\n";
		cout << "Please select a grade category. ";
		cin.get(choice);
		cin.ignore(1);
		switch (choice)
		{
		case 'a':
		case 'A':
			cout << "\nPlease enter one test score then press enter. Continue entering one score at a time until you would like\n"
				"to quit. If you would like to quit entering test grades please enter '-1'. (Maximum of 5 test grades)\n";
			for (int count = 0; count < 5; count++)
			{
				cin >> tempValue;
				if (tempValue != -1)
				{
					testGrades.push_back(tempValue);
					testsEntered = true;
				}
				else
					break;
			}
			cin.ignore(1);
			break;
		case 'b':
		case 'B':
			cout << "\nPlease enter one lab score then press enter. Continue entering one score at a time until you would like\n"
				"to quit. If you would like to quit entering lab grades please enter '-1'. (Maximum of 10 lab grades)\n";
			for (int count = 0; count < 10; count++)
			{
				cin >> tempValue;
				if (tempValue != -1)
				{
					labGrades.push_back(tempValue);
					labsEntered = true;
				}
				else
					break;
			}
			cin.ignore(1);
			break;
		case 'c':
		case 'C':
			cout << "\nPlease enter one project score then press enter. Continue entering one score at a time until you would like\n"
				"to quit. If you would like to quit entering project grades please enter '-1'. (Maximum of 5 project grades)\n";
			for (int count = 0; count < 5; count++)
			{
				cin >> tempValue;
				if (tempValue != -1)
				{
					projectGrades.push_back(tempValue);
					projectsEntered = true;
				}
				else
					break;
			}
			cin.ignore(1);
			break;
		case 'd':
		case 'D':
			cout << "Please enter one final exam grade. ";
			cin >> finalExam;
			cin.ignore(1);
			finalExamEntered = true;
		default:
			cout << "You must enter a valid choice to continue. Please choose one of the letters for grade categories. \n";
			break;
		}
	}
	// Call functions for display and file creation
	outputResults();
	storeInfo();


	return 0;
}

void outputResults()
{
	// Initialize counters
	int count = 0;
	int gradeNum = 1;
	double acc = 0;

	// Start output
	cout << "\nHello! Thank you for using Nick's improved grade calculator!\n\n";
	cout << studentFirstName << " " << studentLastName << endl;
	cout << "Course ID: " << courseID << endl;
	cout << "TESTS\n";
	cout << setprecision(1) << fixed;

	// While there are test grades in testGrades, display them
	for (count = 0; count < testGrades.size(); count++)
	{
		cout << setw(8) << "Test " << gradeNum << "- " << testGrades[count] << endl;
		acc += testGrades[count];
		gradeNum++;
	}
	// Test average
	testAvg = acc / (testGrades.size());
	cout << "Test Average: " << testAvg << endl << endl;

	// Reset counters for next output
	count = 0;
	gradeNum = 1;
	acc = 0;

	// Lab grades
	cout << "LABS\n";
	for (count = 0; count < labGrades.size(); count++)
	{
		cout << setw(7) << "Lab " << gradeNum << "- " << labGrades[count] << endl;
		acc += labGrades[count];
		gradeNum++;
	}
	labAvg = acc / (labGrades.size());
	cout << "Lab Average: " << labAvg << endl << endl;


	// Reset counters for next output
	count = 0;
	gradeNum = 1;
	acc = 0;

	// Project grades
	cout << "PROJECTS\n";
	for (count = 0; count < projectGrades.size(); count++)
	{
		cout << setw(11) << "Project " << gradeNum << "- " << projectGrades[count] << endl;
		acc += projectGrades[count];
		gradeNum++;
	}
	projectAvg = acc / (projectGrades.size());
	cout << "Project Average: " << projectAvg << endl << endl;

	// Final Exam
	cout << "FINAL EXAM: " << finalExam << endl << endl;

	// Final Average
	finalGrade = (testAvg * .3) + (labAvg * .3) + (projectAvg * .3) + (finalExam * .1);
	cout << "FINAL GRADE: " << finalGrade << endl;

	// Letter grade
	if (finalGrade >= 90)
		letterGrade = 'A';
	else if (finalGrade >= 80)
		letterGrade = 'B';
	else if (finalGrade >= 70)
		letterGrade = 'C';
	else if (finalGrade >= 60)
		letterGrade = 'D';
	else
	{
		letterGrade = 'F';
		pass = false;
	}

	// Display letter grade and pass/fail
	cout << "Letter Grade: " << letterGrade << endl;
	cout << "Pass/Fail: ";
	if (pass)
		cout << "Pass\n";
	else
		cout << "Fail\n";
}

void storeInfo()
{
		// Variables
		ofstream outFile;
		// Initialize counters
		int count = 0;
		int gradeNum = 1;
		double acc = 0;

		// Start output
		outFile.open("GradeInfo2.txt");
		outFile << "Hello! Thank you for using Nick's improved grade calculator!\n\n";
		outFile << studentFirstName << " " << studentLastName << endl;
		outFile << "Course ID: " << courseID << endl;
		outFile << "TESTS\n";

		// While there are test grades in testGrades, display them
		for (count = 0; count < testGrades.size(); count++)
		{
			outFile << "Test " << gradeNum << "- " << testGrades[count] << endl;
			acc += testGrades[count];
			gradeNum++;
		}
		// Test average
		testAvg = acc / (testGrades.size());
		outFile << "Test Average: " << testAvg << endl << endl;

		// Reset counters for next output
		count = 0;
		gradeNum = 1;
		acc = 0;

		// Lab grades
		outFile << "LABS\n";
		for (count = 0; count < labGrades.size(); count++)
		{
			outFile << "Lab " << gradeNum << "- " << labGrades[count] << endl;
			acc += labGrades[count];
			gradeNum++;
		}
		labAvg = acc / (labGrades.size());
		outFile << "Lab Average: " << labAvg << endl << endl;


		// Reset counters for next output
		count = 0;
		gradeNum = 1;
		acc = 0;

		// Project grades
		outFile << "PROJECTS\n";
		for (count = 0; count < projectGrades.size(); count++)
		{
			outFile << "Project " << gradeNum << "- " << projectGrades[count] << endl;
			acc += projectGrades[count];
			gradeNum++;
		}
		projectAvg = acc / (projectGrades.size());
		outFile << "Project Average: " << projectAvg << endl << endl;

		// Final Exam
		outFile << "FINAL EXAM: " << finalExam << endl << endl;

		// Final Average
		finalGrade = (testAvg * .3) + (labAvg * .3) + (projectAvg * .3) + (finalExam * .1);
		outFile << "FINAL GRADE: " << finalGrade;

		// Letter grade
		if (finalGrade >= 90)
			letterGrade = 'A';
		else if (finalGrade >= 80)
			letterGrade = 'B';
		else if (finalGrade >= 70)
			letterGrade = 'C';
		else if (finalGrade >= 60)
			letterGrade = 'D';
		else
		{
			letterGrade = 'F';
			pass = false;
		}

		// Display letter grade and pass/fail
		outFile << "Letter Grade: " << letterGrade << endl;
		outFile << "Pass/Fail: ";
		if (pass)
			outFile << "Pass\n";
		else
			outFile << "Fail\n";
		outFile.close();
}
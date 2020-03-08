// Project 3
// DeVosNick_Project3
// Name: Nick DeVos
// Date: 10/29/2016
#include<iostream>
#include<string>
#include<iomanip>
#include<fstream>
using namespace std;

// Prototypes
int enter_grade();
void display_results(string, string, string);
void store_info(string, string, string);

// Global variables, needed to access variables between functions
bool lab_entered = false, project_entered = false, test_entered = false, final_exam_entered = false;
double lab_grade = -1, project_grade = -1, test_grade = -1, final_exam_grade = -1;

// Main function
int main()
{
	// Declaring variables
	string first_name, last_name, courseID;
	first_name = "Nick";
	last_name = "DeVos";


	// Ask for input
	cout << "What is the course ID? ";
	getline(cin, courseID);

	// Use enter_grade function as long as there is a grade that has not been entered
	while (lab_entered == false || project_entered == false || test_entered == false || final_exam_entered == false)
		enter_grade();

	// Display results
	display_results(first_name, last_name, courseID);

	// Write to file
	store_info(first_name, last_name, courseID);
}

// Function for entering grades
int enter_grade()
{
	// Declaring variables
	char grade_choice;

	// Ask for input
	cout << "\nMenu: (a)Lab (b)Project (c)Test (d)Final Exam\n";
	cout << "Which grade category would you like to enter a grade for? ";
	cin.get(grade_choice);
	cin.ignore(2, '\n');

	// Use input in a menu
	switch (grade_choice)
	{
	case 'A':
	case 'a':
		if (lab_entered == true) // Already entered lab grade
		{
			cout << "Lab grade has already been entered! Please select a new category.\n";
			break; // Display menu again
		}
		// If lab grade has not been entered
		cout << "Please enter lab grade. ";
		cin >> lab_grade;
		cin.ignore(2, '\n');
		if (lab_grade >= 0 && lab_grade <= 100) // Change lab_entered to true to prevent re-entering lab grade
			lab_entered = true;
		else
			while (lab_grade < 0 || lab_grade > 100) // Validate input
			{
				cout << "The grade value entered must be a value from 0 to 100 only. Please enter a valid value for lab grade. ";
				cin >> lab_grade;
				cin.ignore(2, '\n');
				if (lab_grade >= 0 && lab_grade <= 100) // Prevents being able to re-enter lab grade
					lab_entered = true;
			}
		break; // Display menu again if the right conditions exist
	case 'B':
	case 'b':
		if (project_entered == true)
		{
			cout << "Project grade has already been entered! Please select a new category.\n";
			break;
		}
		cout << "Please enter project grade. ";
		cin >> project_grade;
		cin.ignore(2, '\n');
		if (project_grade >= 0 && project_grade <= 100)
			project_entered = true;
		else
			while (project_grade < 0 || project_grade > 100)
			{
				cout << "The grade value entered must be a value from 0 to 100 only. Please enter a valid value for project grade. ";
				cin >> project_grade;
				cin.ignore(2, '\n');
				if (project_grade >= 0 && project_grade <= 100)
					project_entered = true;
			}
		break;
	case 'C':
	case 'c':
		if (test_entered == true)
		{
			cout << "Test grade has already been entered! Please select a new category.\n";
			break;
		}
		cout << "Please enter test grade. ";
		cin >> test_grade;
		cin.ignore(2, '\n');
		if (test_grade >= 0 && test_grade <= 100)
			test_entered = true;
		else
			while (test_grade < 0 || test_grade > 100)
			{
				cout << "The grade value entered must be a value from 0 to 100 only. Please enter a valid value for test grade. ";
				cin >> test_grade;
				cin.ignore(2, '\n');
				if (test_grade >= 0 && test_grade <= 100)
					test_entered = true;
			}
		break;
	case 'D':
	case 'd':
		if (final_exam_entered == true)
		{
			cout << "Final exam grade has already been entered! Please select a new category.\n";
			break;
		}
		cout << "Please enter final exam grade. ";
		cin >> final_exam_grade;
		cin.ignore(2, '\n');
		if (final_exam_grade >= 0 && final_exam_grade <= 100)
			final_exam_entered = true;
		else
			while (final_exam_grade < 0 || final_exam_grade > 100)
			{
				cout << "The grade value entered must be a value from 0 to 100 only. Please enter a valid value for final exam grade. ";
				cin >> final_exam_grade;
				cin.ignore(2, '\n');
				if (final_exam_grade >= 0 && final_exam_grade <= 100)
					final_exam_entered = true;
			}
		break;
	default:
		cout << "\nYou entered an invalid choice! Please select a choice from the menu. ";
		break;
	}
	return 0;
}

void display_results(string firstName, string lastName, string course_ID) // Doesn't need to return a value
{
	// Variables
	double final_avg = 0.0;
	final_avg = (lab_grade * .3) + (project_grade * .3) + (test_grade * .3) + (final_exam_grade * .1);
	char letter_grade;
	bool fail = false;

	// Letter grade calculation
	if (final_avg >= 90 && final_avg <= 100)
		letter_grade = 'A';
	else if (final_avg >= 80 && final_avg < 90)
		letter_grade = 'B';
	else if (final_avg >= 70 && final_avg < 80)
		letter_grade = 'C';
	else if (final_avg >= 60 && final_avg < 70)
		letter_grade = 'D';
	else
	{
		letter_grade = 'F';
		fail = true; // Used to display "fail" if failing
	}

	// Display results
	cout << "\nHello and welcome to Nick's updated grade calculating program! \n\n";
	cout << "Student Name: " << firstName << " " << lastName << endl;
	cout << "Course ID: " << course_ID << endl;
	cout << setprecision(1) << fixed; // One decimal point for all numbers after this
	cout << "Lab Avg: " << setw(12) << lab_grade << endl;
	cout << "Project Avg: " << setw(8) << project_grade << endl;
	cout << "Test Avg: " << setw(11) << test_grade << endl;
	cout << "Final Exam: " << setw(9) << final_exam_grade << endl;
	cout << "Final Grade: " << setw(8) << final_avg << endl;
	cout << "Letter Grade: " << setw(7) << letter_grade << endl;
	cout << "Pass/Fail: " << setw(11);
	if (fail)
		cout << "Fail\n";
	else
		cout << "Pass\n";
}

// Same function as display_results, except store_info writes the output to a file named GradeInfo.txt
void store_info(string firstName, string lastName, string course_ID)
{
	// Variables
	double final_avg = 0.0;
	final_avg = (lab_grade * .3) + (project_grade * .3) + (test_grade * .3) + (final_exam_grade * .1);
	char letter_grade;
	bool fail = false;
	ofstream output_file;

	// Letter grade calculation
	if (final_avg >= 90 && final_avg <= 100)
		letter_grade = 'A';
	else if (final_avg >= 80 && final_avg < 90)
		letter_grade = 'B';
	else if (final_avg >= 70 && final_avg < 80)
		letter_grade = 'C';
	else if (final_avg >= 60 && final_avg < 70)
		letter_grade = 'D';
	else
	{
		letter_grade = 'F';
		fail = true;
	}

	// Open file
	output_file.open("GradeInfo.txt");

	// Record results
	output_file << "\nHello and welcome to Nick's updated grade calculating program! \n\n";
	output_file << "Student Name: " << firstName << " " << lastName << endl;
	output_file << "Course ID: " << course_ID << endl;
	output_file << setprecision(1) << fixed;
	output_file << "Lab Avg: " << setw(12) << lab_grade << endl;
	output_file << "Project Avg: " << setw(8) << project_grade << endl;
	output_file << "Test Avg: " << setw(11) << test_grade << endl;
	output_file << "Final Exam: " << setw(9) << final_exam_grade << endl;
	output_file << "Final Grade: " << setw(8) << final_avg << endl;
	output_file << "Letter Grade: " << setw(7) << letter_grade << endl;
	output_file << "Pass/Fail: " << setw(11);
	if (fail)
		output_file << "Fail\n";
	else
		output_file << "Pass\n";

	// Close file
	output_file.close();
}
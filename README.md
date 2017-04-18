# IonExercise_1
task_1

Object Oriented Programming (OOP)
Task 1:
1)	Create 3 classes called FictionBook, ScienceBook and ClassicBook.
2)	Create an abstract class called GeneralBook. The porpoise of the abstract class will be to contain data regarding how popular the book is, how many pages it has and cost.
Do make sure book name, year and author name is present.

Popularity score of the book should be from 1 to 10.
If the books score is more than 9 the price will be raised by 20 %.
If the score if less than 4 – the price will go down by 10%.

3)	Extend book classes from GeneralBook and add some additional fields describing fantasy parameter, science parameter and classic parameter. Example: ‘How to jog’ – Science book with a parameter ‘Self-Manual’. Other example: ‘Gravity waves’ – Science Book with a parameter ‘Astrophysics’. Don’t forget to use your imagination guys 

4)	Add a final class called PureBook. This class should create a new book based on an existing one ignoring popularity score on price calculation.
5)	Initialize all 3 types of books with different parameters and show their names and cost.
Initialize 3 objects of PureBook based on the previously created objects and show there name and pure cost.

Task 2:
1)	 Time for a HOTFIX! Looks like we need to apply some additional modification on cost calculations. New formula is: when cost is more than 8 – price is going up 10%, when its more than 9 – goes up another 10% from overall price ( (base price +10% from 8 score)  + 10% from base and 10% of 8 score).
If the popularity of the book is less than 1 – sometimes the price of the book should be free. 50/50 chance on this one.

2)	Fiction books require their own cost calculation. Authors are not happy that their books can go for free sometimes. Exclude the free options for FictionBook.

Task 3: 
1)	Have a look on your code. Make sure you have getters and setters. If you feel a constructor needs to be initialized – do it, if not – it’s ok too. Check if your code is readable looks pretty.


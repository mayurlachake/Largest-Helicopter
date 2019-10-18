# Largest-Helicopter
Determines the largest length of Helicopter that can land in a space.


An Army Helicopter 
  The host government has promised that in addition to the security guards in each match, there will be a platoon of elite commandos that
will be deployed for extra protection in each stadium for each match. In order to move quickly between cities and stadiums there will be
a dedicated army helicopter on permanent stand by.
  The army helicopter has to land in city (rectangular area) which contains several towers (mobile communication towers). For the safe
landing of the helicopter, the landing space must not contain any tower in the landing space. A helicopter needs a square shaped landing
area which has the side length greater than or equal to the helicopter length. Given a description of the tower positions of the city,
you have to find the largest helicopter that can land in the city.

Input Format
You will be given a function which contains a string array of length N, each string contains symbols (either 'x' or 'o'). x represents
a tower and 'o' represents empty space.

Constraints
1 <= N <= 500

Output Format
Your function will return the length of the largest helicopter that can land in the city, else -1 if input is invalid.

Sample TestCase
Input
5
x#o#o#o#x#o
x#o#o#o#x#x
x#o#o#o#x#x
x#o#x#o#o#x
x#o#x#o#o#x

Output
3

# MasterCard

Master Card Code Test.

By Nabeel Shamsi.

In this project I have designed a code to check the connection between two cities.

The user in puts 2 cities in the URL which are picked up by the controller and checked in the database.

The database used is H2 in memory database and is updated by an sql file every time the project is run.

We have used a model class and curd repository to connect to the database and perform the curd operations.

The first check is to check is the city1 entered by the user is present in the database or not and is the city2 entered by the user is in the database or not. 
If they they are not present then return "No!".

The second check is to check if the cities are directly connected. We check this by checking the connection ID.
If both have the same connection ID then they are directly connected and should return "Yes!".

The third check is to check if the cities are indirectly connected or not. We check the second city.
If both cities have a common second city then they are connected through the common city and return "Yes!"

Any thing else just return "No!"


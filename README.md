# Purrfect Catisine

## Objective
The objective of this project is to address a specific issue by implementing a terminal simulation through the use of the design patterns learned in class. This will help to avoid common software design problems such as rigidity, fragility, immobility, and viscosity.

## Requirements
The developers at Michitas Corp have requested the creation of a simulation game for a restaurant named Gatocina Purrfecta. The requested features are:
1. Selection of personal Cat Chef: When customers enter the restaurant, they are provided with the opportunity to choose their own personal Cat Chef. Once a Cat Chef has been selected, customers can explore a menu offering options from Italian, Mexican, and Japanese cuisines, depending on the chosen cat chef. This will be implemented using the Strategy design pattern.
2. Creation of Customized Dish: When assembling their dish, customers will encounter a variety of ingredients and options, each accompanied by witty messages and combination suggestions. This customization process is achieved using the Builder design pattern.
3. Payment Process: Once the customer has completed the creation of their customized dish, it's time to settle the bill. If the customer has enough money to cover the cost, the transaction will be successful, and they can enjoy their delicious meal. To handle this payment process securely, the Proxy design pattern will be applied.
4. Payment Conflict Resolution: However, if the customer does not have enough money to pay the bill, they will find themselves in a peculiar situation. At this point, the customer and their Cat Chef can begin a dispute. If the customer manages to win the argument, they can leave without paying. However, if the customer is unsuccessful in the discussion, they will be trapped watching cat images for all eternity. This conflict resolution process will be managed using the State design pattern.
5. Sense of Freedom of Choice: The user can choose from various options of what they want to do, and each option will show something different to the user based on the process they are currently undertaking. This is also achieved through the State design pattern.
6. Code Cleanliness and Clarity: In order to maintain the cleanest possible structure, we implement the MVC pattern.

## Project Structure
- src/: This folder contains the Java source files.
-  src/assets/: This folder contains extra material that the code uses (images and sound).
-  UML.png contains the UML diagram representing the project.
- DiagramaCasosDeUso.png contains the use case diagram representing the project.
- DiagramaEstados.png contains the state diagram representing the project.

## Execution
To compile and run this project, make sure you have Java installed on your system. Then, follow these steps:
1. Open a terminal and navigate to the root folder of the project: \Proyecto02_Michitas\src\ Note: We highly recommend running from the terminal, as some editors may not correctly handle the program due to the arrangement of files and how these editors execute the code.
2. Compile the project by executing the following command: javac *.java
3. Run the program with the following command: java GatocinaPurrfecta

## Bank Accounts
To be able to shop at our Gatocina Purrfecta, the following bank accounts are available:

- **Mantecado**
  - Card Number: 123456
  - Available Money: $100

- **LaBigotes**
  - Card Number: 654321
  - Available Money: $5,000

- **Biscuit**
  - Card Number: 987654
  - Available Money: $10,000

## Additional Notes
If the user has lost the fight, the program is designed to not let them exit, as their punishment is to remain in a loop of cat images for eternity. To force the program to exit: ctrl + c.

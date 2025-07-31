📌 Description
This Java console application simulates a simple store interaction. The user is first prompted to enter a password. Upon successful authentication, they are given the option to purchase fruits (either apples or oranges). The program calculates the total cost based on the quantity entered.

🚀 How to Run
Ensure you have Java installed on your system.

Save the file as example.java.

Open your terminal or command prompt.

Compile the program:

bash
Copy
Edit
javac example.java
Run the program:

bash
Copy
Edit
java example
🔐 Features
Password authentication (123 is the correct password).

Displays available items (currently only fruits).

Lets the user choose between apple or orange.

Prompts for quantity and calculates total price:

Apple: ₹20 per kg

Orange: ₹15 per kg

✅ Example Usage
vbnet
Copy
Edit
Enter your password: 123
Welcome Chethan
What do you want to purchase?
Options: fruits
fruits
Select fruits:
Options: apple or orange
apple
Apple is 20rs/kg
How many kgs? 2
Total price: 40 rs
⚠️ Notes
If the wrong password is entered, the program terminates.

Only “fruits” is currently supported as a category.

The program is case-insensitive for user input.

📦 Future Improvements (Optional Ideas)
Add more product categories (e.g., vegetables, snacks).

Loop back for multiple purchases.

Store data in files or a database.

Use GUI with Java Swing or JavaFX.


# ExpenseSplit

ExpenseSplit is a Spring Boot application that helps users manage and split expenses among multiple people. The application calculates balances and shows who owes money to whom.

## Features

* User Management
* Add Expenses
* Split Expenses Among Users
* Calculate Balances
* Show Owed Amounts
* REST API Implementation
* MySQL Database Integration

## Technologies Used

* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* Git & GitHub

## Project Structure

* Controller Layer
* Service Layer
* Repository Layer
* Entity Layer

## Database Configuration

Update the following properties in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/expensesplit
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Running the Application

1. Clone the repository:

   ```
   git clone https://github.com/Aff11/ExpenseSplit.git
   ```

2. Import the project into Spring Tool Suite (STS).

3. Configure MySQL database.

4. Run the Spring Boot application.

5. Access the APIs using Postman.

## Example Output

* Afiya owes John Rs 300
* John owes Afiya Rs 300

## Future Enhancements

* User Authentication
* Expense Categories
* Group Expense Management
* Frontend Integration
* Email Notifications

## Author

Afiya Banu

# readingList Example Application 

readingList is a simple Spring Boot application that covers the basic flow of most web applications.
The application contains a form where a user can enter a book, and then submit the form. The request is
then handled by a Spring controller which stores the book in an H2 database, and then the user sees their book
appear in their list.

## Run
To run the example type
	
	mvn spring-boot:run

Visit 'localhost:8080/<name>' to view and add items to your reading list.

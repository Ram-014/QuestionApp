
# 📝 Java Quiz Application

A simple **Console-Based Quiz Application** developed using **Core Java**. This project demonstrates Object-Oriented Programming (OOP) concepts such as classes, objects, constructors, encapsulation, arrays of objects, and user input using `Scanner`.

## 🚀 Features

* Display multiple-choice questions (MCQs)
* Accept user answers through the console
* Compare user answers with correct answers
* Calculate and display the final score
* Clean and simple object-oriented design

## 🛠️ Technologies Used

* Java
* IntelliJ IDEA (or any Java IDE)
* JDK 17+ (Compatible with most Java versions)

## 📂 Project Structure

```text
QuizApplication/
│
├── Main.java
├── QuestionService.java
└── Questions.java
```

### Main.java

* Entry point of the application.
* Creates a `QuestionService` object.
* Starts the quiz and displays the final score.

### Questions.java

* Model class representing a quiz question.
* Stores:

  * Question ID
  * Question
  * Option 1
  * Option 2
  * Option 3
  * Correct Answer
* Implements encapsulation using private variables, constructors, getters, and setters.

### QuestionService.java

* Initializes quiz questions.
* Displays questions to the user.
* Stores user answers.
* Calculates and displays the final score.

## 📸 Sample Output

```text
----------------------------------
Question 1
What happens if an abstract class does not have any abstract methods?

A. It will not compile.
B. The class can still be abstract.
C. Java will automatically provide an abstract method.

Enter your answer (A/B/C): B

----------------------------------
Question 2
What is the default value of an uninitialized int variable declared at the class level?

A. Null
B. 0
C. 1

Enter your answer (A/B/C): B

==========================
Your Score : 2/2
==========================
```

## 🎯 Core Java Concepts Practiced

* Classes and Objects
* Constructors
* Encapsulation
* Arrays of Objects
* Getters and Setters
* Method Overriding (`toString()`)
* Methods
* Loops (`for` and enhanced `for`)
* Conditional Statements (`if`)
* Scanner Class
* Object-Oriented Programming (OOP)

## ▶️ How to Run

1. Clone this repository.

```bash
git clone https://github.com/your-username/java-quiz-application.git
```

2. Open the project in IntelliJ IDEA or Eclipse.

3. Compile the project.

```bash
javac *.java
```

4. Run the application.

```bash
java Main
```

## 🔮 Future Improvements

* Add Option D
* Randomize question order
* Store questions in a file or database
* Add timer for each question
* Display correct answers after completion
* Show percentage and grade
* Use `ArrayList` instead of arrays
* Build a GUI using Java Swing or JavaFX

## 👨‍💻 Author

**Ramakrishnan Aadhali**

* Aspiring Java Backend Developer
* Passionate about Core Java, Spring Boot, and Backend Development

---

⭐ If you found this project useful, consider giving it a **Star** on GitHub!

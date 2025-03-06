Bonify QA Automation Framework

Project Overview

This project is an automation framework for testing the Bonify website using Selenium WebDriver, Appium, and TestNG. The framework is designed to automate the registration and login process while generating reports and capturing screenshots of test failures.

📂 Project Structure

Bonify-QA-Automation/
│── src/
│   ├── main/
│   │   ├── base/           # Base classes for setup and teardown
│   │   ├── pages/          # Page Object Model (POM) classes
│   │   ├── utils/          # Utility classes (e.g., Screenshot, Reporting)
│   ├── test/
│   │   ├── testcases/      # Test scripts
│── reports/                # Extent Reports output
│── screenshots/            # Screenshots for failed tests
│── pom.xml                 # Maven dependencies
│── README.md               # Project documentation

🛠️ Tools & Technologies Used
	•	Programming Language: Java
	•	Test Framework: TestNG
	•	Automation Tools: Selenium WebDriver
	•	Design Pattern: Page Object Model (POM)
	•	Reporting: Extent Reports
	•	Logging: Log4j
	•	Build Tool: Maven

 Features

Automates registration & login flow on Bonify
Implements Page Object Model (POM) for better maintainability
Captures screenshots on test failures
Denerates detailed Extent Reports
Uses Log4j for logging and debugging
Supports cross-browser execution

Setup & Execution

Prerequisites
	•	Install Java JDK 11+
	•	Install Eclipse IDE
	•	Install Maven
	•	Install WebDriver binaries (ChromeDriver, GeckoDriver)

 Run the TestNG test suite:
 mvn test

 Test Execution Report
	•	After execution, Extent Reports will be generated in the reports/ folder.
	•	Screenshots of failed test cases will be available in the screenshots/ folder.


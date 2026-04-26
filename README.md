# CS-320-Software-Testing
CS 320 Software Test, Automation QA 2026 - SNHU

## Portfolio Artifacts

- **Contact Service** (Project One): Contact.java, ContactService.java, ContactTest.java, ContactServiceTest.java
- **Summary and Reflections Report** (Project Two): Summary_and_Reflections_Report.docx

## Reflection

**How can I ensure that my code, program, or software is functional and secure?**

The most reliable way to ensure code is functional is to write unit tests that verify every requirement directly. In this project, each field constraint from the requirements document had at least one test written for it, covering valid inputs, null inputs, and boundary values. For security, the key practice is validating all input before it reaches any logic or storage. The Contact class, for example, rejects null values and enforces strict length and format rules on every field before an object is allowed to be created. These habits, applied consistently, prevent a wide range of bugs and vulnerabilities.

**How do I interpret user needs and incorporate them into a program?**

User needs have to be translated into concrete, testable rules. In this project, the customer requirements described what each field must and must not accept. Reading those requirements carefully and turning each rule into a specific validation or test was the main way of making sure the code reflected what the user actually needed. A requirement like "the phone field must be exactly 10 digits" became a regex check in the class and multiple tests in the test file. Keeping that direct connection between the requirement and the code makes it easier to verify that nothing was missed.

**How do I approach designing software?**

My approach starts with understanding what the software needs to do before writing any code. For these services, that meant reading the requirements and identifying the objects, their fields, their rules, and the operations the service needed to support. From there, I kept each class focused on one responsibility: the object class handles validation and stores data, and the service class handles storage and retrieval. This separation makes the code easier to test, easier to read, and easier to update when requirements change.

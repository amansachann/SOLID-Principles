# 🚀 Single Responsibility Principle (SRP)

### ✅ **Definition**

> A class should have only one reason to change, meaning it should have only one job or responsibility.
>

---

## 🧠 **Why It Matters**

- Improves **maintainability** 🛠️
- Makes code **easier to understand** 👀
- Simplifies **testing and debugging** 🧪
- Supports **clean architecture** 🧼

---

## 🔥 Real-World Analogy

🧍 Imagine a **chef** 🍳 who:

- Cooks food ✅
- Takes orders ❌
- Manages the restaurant ❌
- Washes dishes ❌

👉 That’s too many responsibilities! In a well-structured restaurant, these tasks are divided across roles. The same goes for classes in your code!

---

## 💻 Java Code Example

### ❌ **Bad Design: One class does too much**

```java
public class User {
    public void createUser() {
        // logic to create user
    }

    public void generateReport() {
        // logic to generate report
    }
}

```

- **Problems**:
    - Changes in user logic affect report generation.
    - Difficult to test and maintain.

---

### ✅ **Good Design: Each class has one responsibility**

```java
public class UserService {
    public void createUser() {
        // logic to create user
    }
}

public class ReportService {
    public void generateReport() {
        // logic to generate report
    }
}

```

✔️ Now:

- `UserService` handles user-related logic.
- `ReportService` handles reporting logic.
- Each has **one reason to change**.

---

## 💡 Best Practices

- 📦 Group related functionality into separate classes.
- 🧪 Make each class easy to unit test.
- 🔁 Refactor large classes into smaller, focused ones.

---

## ✅ SRP Checklist

| Check | Question |
| --- | --- |
| 🔍 | Does the class do **more than one thing**? |
| 🔧 | Will changes in one feature **affect others**? |
| 🧱 | Can I break this into **smaller focused units**? |

---

Awesome! Let's go through a **real-world example** and refactor it using the **Single Responsibility Principle (SRP)**, with a **UML diagram** and Java code 🧑‍💻📐

---

## 🎯 Scenario: User Registration System

### 🧨 **Problem: One Class, Too Many Responsibilities**

```java
public class UserManager {
    public void registerUser(String username, String email) {
        // 1. Validate user data
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }

        // 2. Save user to DB
        System.out.println("User saved: " + username);

        // 3. Send welcome email
        System.out.println("Email sent to: " + email);
    }
}

```

### ❌ Violates SRP:

- ✅ Validates user
- ✅ Persists user
- ✅ Sends email

  **3 different responsibilities = 3 reasons to change** ⚠️


---

## ✅ **Refactored Using SRP**

### 🧩 Step-by-step Responsibilities:

1. **UserValidator** – Validates data
2. **UserRepository** – Handles persistence
3. **EmailService** – Sends email
4. **UserManager** – Coordinates the workflow

---

### 📦 Refactored Classes

```java
public class UserValidator {
    public void validate(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
    }
}

```

```java
public class UserRepository {
    public void save(String username) {
        System.out.println("User saved: " + username);
    }
}

```

```java
public class EmailService {
    public void sendWelcomeEmail(String email) {
        System.out.println("Email sent to: " + email);
    }
}

```

```java
public class UserManager {
    private UserValidator validator = new UserValidator();
    private UserRepository repository = new UserRepository();
    private EmailService emailService = new EmailService();

    public void registerUser(String username, String email) {
        validator.validate(email);
        repository.save(username);
        emailService.sendWelcomeEmail(email);
    }
}

```

---

## 🔧 Now, each class has **one responsibility**:

| Class | Responsibility |
| --- | --- |
| `UserValidator` | Validates email |
| `UserRepository` | Saves user |
| `EmailService` | Sends emails |
| `UserManager` | Coordinates the workflow |

---

## 📈 UML Diagram

```
+------------------+
|  UserManager     |
|------------------|
| - validator      |
| - repository     |
| - emailService   |
|------------------|
| +registerUser()  |
+------------------+
        |
        | uses
        v
+------------------+     +------------------+     +---------------------+
| UserValidator    |     | UserRepository   |     | EmailService        |
|------------------|     |------------------|     |---------------------|
| +validate()      |     | +save()          |     | +sendWelcomeEmail() |
+------------------+     +------------------+     +---------------------+

```

---
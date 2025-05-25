# 🚀 SOLID Principles

>The SOLID principles are five key design principles in Object-Oriented Programming (OOP) that help you write clean, maintainable, and scalable software. 💻🧠
>

| Principle | Description | Real-World Analogy |
| --- | --- | --- |
| **S** – Single Responsibility Principle | 📌 A class should have only one reason to change, i.e., one job or responsibility. | 🧍 Like a chef who only cooks—not cleaning, not serving. |
| **O** – Open/Closed Principle | 📦 Software entities should be open for extension but closed for modification. | 🔌 Like a plug-and-play device—you can extend it without changing the original code. |
| **L** – Liskov Substitution Principle | 🔄 Subtypes should be substitutable for their base types without altering behavior. | 🧱 Like LEGO blocks—if one fits, another of the same type should fit too. |
| **I** – Interface Segregation Principle | 🔌 Clients shouldn’t be forced to depend on interfaces they don’t use. | 📺 Like a remote with only the buttons you need—not 50 unused ones. |
| **D** – Dependency Inversion Principle | ⬇️ High-level modules should not depend on low-level modules. Both should depend on abstractions. | 🎛️ Like using a universal power adapter—you depend on the **interface**, not the internal wiring. |


## 🎯 Why Use SOLID?

* ✅ Improves **code readability**
* ✅ Makes your system **flexible and extendable**
* ✅ Encourages **decoupling and testability**
* ✅ Supports **clean architecture and good system design**

---

## 🧩 Visual Summary

```plaintext
S — Single Responsibility     → One class, one job
O — Open/Closed               → Extend, don’t modify
L — Liskov Substitution       → Subclasses must behave properly
I — Interface Segregation     → Prefer small, specific interfaces
D — Dependency Inversion      → Depend on abstractions, not concretes
```

---


## 📚 Detailed Explanations of each SOLID Principle

| Principle | Detailed Explanation                                                          |
| --------- |-------------------------------------------------------------------------------|
| **S**     | [Single Responsibility Principle (SRP)](./src/main/java/com/codewithaman/SRP) |
| **O**     | [Open-Closed Principle (OCP)](./src/main/java/com/codewithaman/OCP)           |
| **L**     | [Liskov Substitution Principle (LSP)](./src/main/java/com/codewithaman/LSP)   |
| **I**     | Split `Exporter` interface into `TextExporter`, `ImageExporter`               |
| **D**     | `Editor` depends on an `Exporter` interface, not `PdfExporter` directly       |

---
## 📘 Example Overview

Imagine you're building a **document editor**:

| Principle | Applied Example                                                        |
| --------- |------------------------------------------------------------------------|
| **S**     | Split `DocumentManager` into `TextFormatter`, `Printer`, and `Saver`   |
| **O**     | Add new file exporters (PDF, DOCX) without changing existing exporter logic |
| **L**     | Subclass `PDFExporter` should not break base `Exporter`                |
| **I**     | Split `Exporter` interface into `TextExporter`, `ImageExporter`        |
| **D**     | `Editor` depends on an `Exporter` interface, not `PdfExporter` directly |

---

### ✅ **Definition**

> Software entities (classes, modules, functions) should be open for extension but closed for modification.
> 

📦 This means:

You should be able to **extend** a class’s behavior **without changing its existing source code**.

---

## 💡 **Why It Matters**

- Prevents breaking existing code 🔧
- Encourages reusable, flexible systems 🔁
- Supports plugin-style architectures 🔌

---

## 🔌 Real-World Analogy

Imagine a **TV** with **HDMI ports** 🎮🎥.

You can **add devices** like a PlayStation or Chromecast **without modifying** the TV.

That’s **Open for Extension** ✅ but **Closed for Modification** ❌

---

## ❌ **Bad Example (Violation of OCP)**

```java
class Invoice {
    public double calculateDiscount(String type) {
        if (type.equals("GOLD")) {
            return 0.2;
        } else if (type.equals("SILVER")) {
            return 0.1;
        } else {
            return 0.0;
        }
    }
}

```

- 🚨 Every time a new discount type is added, the method must be **modified**.

---

## ✅ **Good Example (Using OCP)**

### 🧩 Step-by-step:

- Create a `DiscountStrategy` interface.
- Implement strategies for each type.
- Let the main class **use abstractions**, not concrete logic.

```java
interface DiscountStrategy {
    double getDiscount();
}

class GoldDiscount implements DiscountStrategy {
    public double getDiscount() {
        return 0.2;
    }
}

class SilverDiscount implements DiscountStrategy {
    public double getDiscount() {
        return 0.1;
    }
}

class NoDiscount implements DiscountStrategy {
    public double getDiscount() {
        return 0.0;
    }
}

class Invoice {
    private DiscountStrategy discountStrategy;

    public Invoice(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double getFinalDiscount() {
        return discountStrategy.getDiscount();
    }
}

```

---

### 🔁 Now, to add a new discount type (e.g., `PlatinumDiscount`), just add a new class:

```java
class PlatinumDiscount implements DiscountStrategy {
    public double getDiscount() {
        return 0.3;
    }
}

```

**No changes** to existing `Invoice` or `DiscountStrategy` classes 💯

---

## 📈 UML Diagram

```
        +-----------------------+
        |   DiscountStrategy   |<<interface>>
        +-----------------------+
        | +getDiscount(): double|
        +-----------------------+
            ^       ^       ^
            |       |       |
+----------------+ +----------------+ +--------------------+
| GoldDiscount   | | SilverDiscount | | NoDiscount         |
+----------------+ +----------------+ +--------------------+
| +getDiscount() | | +getDiscount() | | +getDiscount()     |
+----------------+ +----------------+ +--------------------+

                 +-------------+
                 |  Invoice    |
                 +-------------+
                 | - strategy  |
                 | +getFinalDiscount()|
                 +-------------+

```

---

## ✅ OCP Checklist

| Check | Question |
| --- | --- |
| 🔍 | Can I **add new behavior** without modifying old classes? |
| 📦 | Am I using **abstraction** or **inheritance** to extend functionality? |
| 🚫 | Is business logic hardcoded in a way that forces modification for every new type? |

---
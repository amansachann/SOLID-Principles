
# 🔤 **L – Liskov Substitution Principle (LSP)**

### 📘 Definition:

> **Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program.**

It’s about making sure that a subclass **behaves like** its parent class — **without surprises**. 🚫💥

---

## 🧠 Why Use LSP?

* ✅ Ensures **polymorphism works safely**
* ✅ Prevents **unexpected behaviors** from subclasses
* ✅ Supports **robust inheritance**

---

## 🏦 Real-World Analogy

If **"Car"** is a base class, and **"ElectricCar"** is a subclass, then wherever a `Car` is expected, using an `ElectricCar` should **work seamlessly** — no `fuelTank()` errors! 🚗⚡

---

## 🚫 **Violation Example (Bad Code)**

```java
class Bird {
    void fly() {
        System.out.println("Flying...");
    }
}

class Ostrich extends Bird {
    @Override
    void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly!");
    }
}
```

Here, `Ostrich` breaks LSP — it **inherits** `Bird`, but **doesn't follow the expected behavior** of flying 🪶❌

---

## ✅ **Correct Design (Follows LSP)**

### 🔄 Solution: Use proper abstraction

```java
interface Bird {
    void eat();
}

interface FlyingBird extends Bird {
    void fly();
}

class Sparrow implements FlyingBird {
    public void eat() {
        System.out.println("Sparrow eating");
    }

    public void fly() {
        System.out.println("Sparrow flying");
    }
}

class Ostrich implements Bird {
    public void eat() {
        System.out.println("Ostrich eating");
    }
}
```

Now, `Ostrich` and `Sparrow` are both **Birds**, but only `Sparrow` can fly — so **LSP is preserved** ✅💯

---

## 🔑 Key Takeaways

| ✅ Do                                        | 🚫 Avoid                                                    |
| ------------------------------------------- | ----------------------------------------------------------- |
| Subclass should honor parent class behavior | Overriding methods to throw exceptions                      |
| Use correct abstractions                    | Forcing child classes to implement irrelevant functionality |
| Think in terms of behavior contracts        | Violating user expectations of base types                   |

---


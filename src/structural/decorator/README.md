# Pizza Customization System - Decorator Design Pattern

## Overview  
This guide demonstrates the **Decorator Design Pattern** by implementing a flexible pizza customization system. The design allows dynamically adding toppings like **Extra Cheese**, **Extra Onion**, and **Extra Mushroom** to base pizzas such as **VegDelight** and **Chicken**, while keeping the core pizza and toppings loosely coupled.

---

## 1. ✅ Understand Requirements & Goals  
- Allow dynamic addition of toppings to any base pizza  
- Avoid creating a large number of subclasses for every pizza-topping combination  
- Enable **open/closed principle**: extend behavior (new toppings) without modifying base pizza code  
- Maintain a consistent interface for computing pizza cost  

---

## 2. 🏗️ Design Structure  

- Define a `BasePizza` abstract class with a `cost()` method  
- Implement concrete base pizza classes: `VegDelight`, `Chicken`  
- Create an abstract class `ToppingDecorator` extending `BasePizza`  
- Implement individual toppings (`ExtraCheese`, `ExtraOnion`, `ExtraMushroom`) as decorators  
- Enable chaining of toppings over a base pizza object  

---

## 3. 🧩 Define Common Interface  

- `BasePizza` provides a consistent method signature (`cost()`)  
- Both base pizzas and toppings adhere to this interface  
- Supports polymorphic behavior when composing pizzas  

---

## 4. 🎨 Create Base Pizzas  

### BasePizza Implementations  
- `VegDelight` returns a fixed base cost  
- `Chicken` returns a different base cost  
- Each class focuses only on the base pizza logic, without worrying about toppings  

---

## 5. 🛠️ Implement Topping Decorators  

### Decorators  
- Extend `ToppingDecorator` (which extends `BasePizza`)  
- Store a reference to the wrapped `BasePizza`  
- Implement the `cost()` method by calling the wrapped pizza's `cost()` and adding topping-specific cost  
- This design allows nesting toppings to compose complex pizzas  

---

## 6. 🧪 Demonstrate Usage via Client Code  

- Instantiate a base pizza like `new VegDelight()`  
- Dynamically add toppings by wrapping with decorators  
  - e.g., `new ExtraCheese(new ExtraOnion(new VegDelight()))`  
- Print the final cost via a call to `cost()`, which resolves through the decorator chain  

---

## 🧱 Key Design Principles  

### ✅ **SOLID Principles**
- **S**ingle Responsibility: Each topping and base class has one job  
- **O**pen/Closed: Add new toppings without modifying existing code  
- **L**iskov Substitution: All decorators and base pizzas can be used interchangeably  
- **D**ependency Inversion: Client depends on the `BasePizza` abstraction, not concrete toppings or pizzas  

---

## ⚠️ Common Pitfalls to Avoid  
- ❌ Hardcoding topping combinations inside base pizza classes  
- ❌ Making decorators unaware of the `BasePizza` abstraction  
- ❌ Violating open/closed principle by using conditionals instead of composition  

---

## 🚀 Possible Enhancements  
- Add **topping descriptions** in addition to cost  
- Allow **removal of toppings** using a reverse chain or strategy  
- Add a **GUI layer** for drag-and-drop pizza customization  
- Integrate **discount decorators** for special deals  
- Track **topping count** or generate full itemized bill  

---

## 📌 Key Interview Takeaways  

### ✅ Focus on:
- Dynamically extending object behavior through composition  
- Using a common interface to treat base and decorated objects uniformly  
- Enabling fine-grained control over extensions  
- Keeping classes focused, loosely coupled, and easily testable  

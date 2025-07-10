# Phone Builder - Builder Design Pattern

## 📖 Overview  
This project demonstrates the **Builder Design Pattern** by constructing a `Phone` object with optional parameters using a fluent interface, without needing to overload constructors or enforce parameter ordering.

---

## 1. ✅ Problem Statement  
- Constructors with many parameters can be error-prone and hard to manage  
- Especially when some parameters are optional or when order matters  
- The goal is to build complex objects **step-by-step**, clearly and flexibly  

---

## 2. 🧱 Key Components  

### `Phone`  
- Represents the final product to be built  
- Includes fields like `os`, `ram`, `processor`, `screenSize`, and `battery`  
- Has a constructor and a `toString()` method to display configuration

### `PhoneBuilder`  
- Acts as the builder class  
- Provides `setX()` methods for each configurable property  
- Supports **method chaining** via `return this`  
- Has a `getPhone()` method to construct and return a `Phone` instance

### `Main`  
- Demonstrates building a `Phone` object using `PhoneBuilder`  
- Allows setting only the desired fields in any order

---

## 3. 🧪 Sample Usage  

- Create a phone by setting only selected fields (e.g., `os` and `ram`)  
- No need to worry about constructor overloads or parameter order  
- Example:  
  - `Phone p1 = new PhoneBuilder().setOs("iOS").setRam(2).getPhone();`

---

## 4. 🌟 Benefits of Builder Pattern  

- Clear and readable object construction  
- Avoids telescoping constructors  
- Supports optional parameters  
- Enhances code maintainability and readability  
- Useful in scenarios where an object has **many optional fields**

---

## 5. 🔍 Key Design Principles  

### ✅ **Design Pattern**
- **Builder Pattern** is a **creational pattern** used to construct complex objects step-by-step

### ✅ **SOLID Principles**
- **Single Responsibility**: Separation of construction logic (`PhoneBuilder`) from the product (`Phone`)  
- **Open/Closed**: Easy to extend new attributes without modifying client code  
- **Encapsulation**: Object creation logic is encapsulated in the builder

---

## 🚀 Possible Enhancements  

- Make `Phone` immutable by marking fields as `final`  
- Add validation logic inside the builder (e.g., minimum screen size or RAM)  
- Include more optional components like camera specs, storage, etc.  
- Refactor to support **Director** class if building multiple pre-defined phone variants

---

## 📌 Interview Takeaways  

- Builder Pattern is ideal when an object:
  - Has many optional parameters  
  - Requires a step-by-step construction process  
- Great for creating **immutable** objects  
- Improves code **clarity** and **flexibility** over overloaded constructors


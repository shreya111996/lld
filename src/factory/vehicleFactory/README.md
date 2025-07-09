# Vehicle Factory - Factory Design Pattern

## Overview  
This guide demonstrates a clear, extensible implementation of the **Factory Design Pattern** using a `VehicleFactory` that produces different types of vehicles based on input.

---

## 1. ✅ Understand Requirements & Goals  
- Provide a **common interface** (`Vehicle`) for all vehicle types  
- Enable **object creation** without exposing instantiation logic  
- Ensure **open/closed principle**: open to extension, closed to modification  
- Allow creation of vehicles by specifying type as a string  

---

## 2. 🏗️ Design Factory Structure  

- Define a **`Vehicle` interface** with `start()`, `stop()`, and `getType()` methods  
- Create **concrete classes** (`Car`, `Bike`, `Truck`) that implement `Vehicle`  
- Implement a **`VehicleFactory`** class with a static `getVehicle(String type)` method  
- Add a **`Main` class** to demonstrate the usage of the factory  

---

## 3. 🔧 Implement Vehicle Interface  

```java
interface Vehicle {
    void start();
    void stop();
    String getType();
}
```

- Ensures all vehicle types follow a **uniform contract**
- Enables polymorphic behavior for method invocation

---

## 4. 🚘 Implement Concrete Vehicle Classes  

### Car  
```java
class Car implements Vehicle {
    public void start() { ... }
    public void stop() { ... }
    public String getType() { return "Car"; }
}
```

### Bike  
```java
class Bike implements Vehicle {
    public void start() { ... }
    public void stop() { ... }
    public String getType() { return "Bike"; }
}
```

### Truck  
```java
class Truck implements Vehicle {
    public void start() { ... }
    public void stop() { ... }
    public String getType() { return "Truck"; }
}
```

- Each class implements the `Vehicle` interface
- Custom `start()`, `stop()` messages for clarity

---

## 5. 🏭 Implement the Factory Class  

```java
class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if (type == null) return null;
        switch (type.toLowerCase()) {
            case "car": return new Car();
            case "bike": return new Bike();
            case "truck": return new Truck();
            default: throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
}
```

- Encapsulates object creation logic  
- Returns appropriate `Vehicle` object based on input type  
- Uses `switch-case` for clarity and maintainability  

---

## 6. 🧪 Demonstrate Usage in Main Class  

```java
public class Main {
    public static void main(String[] args) {
        Vehicle v1 = VehicleFactory.getVehicle("car");
        v1.start();
        System.out.println("Type: " + v1.getType());
        v1.stop();

        Vehicle v2 = VehicleFactory.getVehicle("bike");
        v2.start();
        System.out.println("Type: " + v2.getType());
        v2.stop();
    }
}
```

- Shows how client code **uses the factory** without knowing the underlying classes  
- Demonstrates **runtime polymorphism**

---

## 🧱 Key Design Principles  

### ✅ **SOLID Principles**
- **S**ingle Responsibility: Each class has one responsibility  
- **O**pen/Closed: Add new vehicles without modifying existing factory logic  
- **L**iskov Substitution: Any `Vehicle` subtype can replace its parent  
- **D**ependency Inversion: Client depends on abstraction (`Vehicle`) not concretion

---

## ⚠️ Common Pitfalls to Avoid  
- ❌ Hardcoding logic in `Main` (violates abstraction)  
- ❌ Violating open/closed principle by modifying factory for every new type  
- ❌ Instantiating concrete classes directly (tight coupling)

---

## 🚀 Possible Enhancements  
- Read vehicle types from a **config file** or **database** (reflection-based factory)  
- Use **enum** or **registry pattern** for cleaner factory logic  
- Add **unit tests** to validate factory behavior  
- Support **lazy loading** or **object pooling** if applicable

---

## 📌 Key Interview Takeaways  

### ✅ Focus on:
- Decoupling object creation from usage  
- Applying polymorphism with interfaces  
- Clear, maintainable factory logic  
- Extensibility and modularity

# Configuration Manager Singleton

## Overview  
This guide outlines a step-by-step approach to designing a thread-safe Singleton Configuration Manager class, suitable for an LLD interview at Amazon or similar companies.

---

## 1. ✅ Understand Requirements & Constraints  
- Ensure only **one instance** of the Configuration Manager exists (Singleton pattern)  
- Support **retrieving configuration values** by key  
- Maintain **thread safety** for concurrent access  

---

## 2. 🔧 Design Singleton Structure  
- Declare **private static volatile instance variable** (`configObj`)  
- Make **constructor private** to prevent external instantiation  
- Provide **public static `getInstance()` method** to access the singleton instance  

---

## 3. 🛡️ Implement Thread-Safe Singleton  
- Use **double-checked locking** with a `synchronized` block  
- Ensure **lazy initialization** (create instance only when needed)  
- Apply `volatile` keyword to prevent **instruction reordering**  

---

## 4. 📊 Add Configuration Storage  
- Use **ConcurrentHashMap** for thread-safe key-value storage  
- Store configurations as **instance field** (not static)  
- Initialize with **default configurations** in constructor  

---

## 5. 🔍 Implement Configuration Retrieval  
- Create `retrieveValue(String key)` method  
- Return configuration value if key exists  
- Throw **IllegalArgumentException** for missing keys (better than magic numbers)  

---

## 6. ✔️ Verify Singleton Property  
- Create multiple Configuration Manager references using `getInstance()`  
- Confirm all references point to the **same instance** (`==` check)  
- Verify **single constructor execution** (one creation message)  

---

## 7. 🔒 Ensure Thread Safety in Operations  
- Use **ConcurrentHashMap** instead of regular HashMap  
- All read operations are **thread-safe** by default  
- Avoid exposing internal map directly  

---

## 8. 🚫 Prevent Runtime Modification
- **No public setter methods** for configurations  
- Add private `loadFromFile()` method for controlled configuration loading  
- Configurations should be **immutable** after initialization  

---

## 9. 🎯 Address Common Singleton Issues  
- **Double-checked locking:** ✅ Implemented correctly  
- **Volatile keyword:** ✅ Prevents visibility issues  
- **Lazy initialization:** ✅ Instance created only when needed  
- **Thread safety:** ✅ ConcurrentHashMap handles concurrent access  

---

## 10. 🧪 Testing & Validation  
- Write unit tests for singleton behavior (ensure same instance)  
- Validate configuration retrieval correctness  
- Test **exception handling** for missing keys  
- Verify **thread safety** under concurrent access  

---

## 🔑 Key Interview Points  

### ✅ **Correct Implementation Details:**
- **Instance field** (not static) for configuration storage  
- **ConcurrentHashMap** for thread-safe operations  
- **Double-checked locking** with volatile keyword  
- **Proper exception handling** instead of magic numbers  

### ⚠️ **Common Pitfalls to Avoid:**
- Making configuration map static (defeats singleton purpose)  
- Using regular HashMap (not thread-safe)  
- Returning magic numbers (-1) instead of exceptions  
- Providing public setter methods (breaks immutability)  

---

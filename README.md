Online Pharmacy Management System using Spring Boot that allows users to manage medicine details. The application will utilize collections (e.g., List, Map) to store and manage medicine information, such as medicine ID, medicine name, price, quantity,and description.

**The Medicine class have the following variables:**
medicineId - int
medicineName - String
price - float
quantity - int
description - String

Created appropriate getters, setters, and constructors for the Medicine class.

**API Endpoints:**
POST  - "/medicines" -> Accepts a Medicine object in the request body and adds the
medicine to the pharmacy system. Returns "true" if the medicine is successfully added,otherwise "false".

PUT - "/medicines/{medicineId}" -> Accepts a Medicine object in the request body with updated details and updates the medicine with the given medicine ID. Returns the
updated Medicine object.

**Rules:**
Created a folder named "controller" inside the "src" folder.Inside the "controller" folder, create a Java file named "MedicineController.java" to handle the REST endpoints for managing medicine data.Create a folder named "model" inside the "src" folder.Inside the "model" folder, create a Java file named "Medicine.java" to define the Medicine entity

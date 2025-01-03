### **Technical Assignment: Smart Home Management System**

#### **Project Name**

**Smart Home Management System**

#### **Project Description**

The \"Smart Home Management System\" project involves developing a smart
home management system to apply students\' knowledge of Java programming
and object-oriented programming (OOP). The project will include various
classes, methods, enums, and other OOP concepts. This system will enable
users to manage different devices (such as lights, thermostats, cameras,
and doorbells) within a smart home and perform related operations.

#### **Project Phases and Tasks**

##### **1. Planning and Design** {#planning-and-design}

- Prepare UML diagrams and technical documentation for the project.

- Design the classes and methods precisely.

##### **2. Creating Classes** {#creating-classes}

###### **a. User Class:** {#a.-user-class}

- **Fields:**

  - private String firstName; - User\'s first name.

  - private String lastName; - User\'s last name.

  - private String email; - User\'s email address.

  - private String password; - User\'s password.

- **Methods:**

  - public User(String firstName, String lastName, String email, String
    > password); - Creates a user object.

  - public void register(); - Registers the user.

  - public void login(); - Logs the user into the system.

  - public void logout(); - Logs the user out of the system.

  - public String getFirstName(); - Returns the user\'s first name.

  - public void setFirstName(String firstName); - Sets the user\'s first
    > name.

###### **b. Device Class:** {#b.-device-class}

- **Enum:**

  - public enum DeviceType { LIGHT, THERMOSTAT, CAMERA, DOORBELL } -
    > Defines the device type.

- **Fields:**

  - private int id; - Unique identifier for the device.

  - private String name; - Name of the device.

  - private boolean status; - Indicates whether the device is on or off.

  - private DeviceType deviceType; - Stores the device type.

- **Methods:**

  - public Device(int id, String name, DeviceType deviceType); - Creates
    > a device object.

  - public void turnOn(); - Turns the device on.

  - public void turnOff(); - Turns the device off.

  - public boolean getStatus(); - Returns the device\'s status.

  - public String getName(); - Returns the device\'s name.

  - public void setName(String name); - Sets the device\'s name.

###### **c. SmartHome Class:** {#c.-smarthome-class}

- **Fields:**

  - private List\<User\> users; - List of users.

  - private List\<Device\> devices; - List of devices.

- **Methods:**

  - public SmartHome(); - Creates a smart home object.

  - public void addUser(User user); - Adds a new user to the system.

  - public void removeUser(User user); - Removes a user from the system.

  - public void addDevice(Device device); - Adds a new device to the
    > system.

  - public void removeDevice(Device device); - Removes a device from the
    > system.

  - public Device getDeviceStatus(int id); - Returns the status of a
    > specified device.

##### **3. Implementing OOP Concepts** {#implementing-oop-concepts}

###### **Inheritance:**

- Create subclasses inheriting from the Device class:

  - **Light Class:**

    - public void turnOn(); - Turns the light on.

    - public void turnOff(); - Turns the light off.

  - **Thermostat Class:**

    - public void turnOn(); - Turns the thermostat on.

    - public void turnOff(); - Turns the thermostat off.

    - public void setTemperature(int temperature); - Sets the
      > temperature.

  - **Camera Class:**

    - public void turnOn(); - Turns the camera on.

    - public void turnOff(); - Turns the camera off.

    - public void startRecording(); - Starts video recording.

    - public void stopRecording(); - Stops video recording.

  - **Doorbell Class:**

    - public void turnOn(); - Turns the doorbell on.

    - public void turnOff(); - Turns the doorbell off.

    - public void ring(); - Rings the doorbell.

###### **Polymorphism:**

- Override methods (turnOn(), turnOff()) for various devices and manage
  > them using polymorphism.

###### **Encapsulation:**

- Declare all fields as private and manage them through getter and
  > setter methods.

###### **Abstraction:**

- Create abstract classes (e.g., Device abstract class) and implement
  > them in concrete subclasses.

###### **Interfaces:**

- Create interfaces and implement them in classes:

  - public interface Manageable { void addDevice(Device device); void
    > removeDevice(Device device); }

  - public class SmartHome implements Manageable { \... }

###### **Static Methods and Fields:**

- Use static methods and fields in classes (e.g., device counters).

### **Basic Level**

1.  **Task 1: Sum and Difference of Two Numbers**

    - **Description:** Take two numbers from the user and write a
      > program that calculates both the sum and the difference of these
      > numbers.

    - **Input:** Two integers (e.g., 5 and 3).

    - **Output:** The sum and the difference of the numbers (e.g.,
      > \"Sum: 8, Difference: 2\").

2.  **Task 2: Length of a String and Character Count**

    - **Description:** Take a string from the user and write a program
      > that returns the length of the string and the count of each
      > character.

    - **Input:** A string (e.g., \"hello\").

    - **Output:** The length of the string and the count of each
      > character (e.g., \"Length: 5, h: 1, e: 1, l: 2, o: 1\").

3.  **Task 3: Sum of Odd and Even Numbers**

    - **Description:** Take several numbers from the user and write a
      > program that calculates the sum of odd and even numbers among
      > them.

    - **Input:** A list of integers (e.g., \[4, 7, 2, 9\]).

    - **Output:** The sum of odd and even numbers (e.g., \"Sum of odd
      > numbers: 16, Sum of even numbers: 6\").

4.  **Task 4: Factorial Calculation and Sum of Numbers**

    - **Description:** Take a number from the user and write a program
      > that calculates the factorial (n!) of the number and the sum of
      > the number and all numbers less than it.

    - **Input:** An integer (e.g., 5).

    - **Output:** The factorial and the sum of the numbers (e.g.,
      > \"Factorial: 120, Sum: 15\").

5.  **Task 5: Arithmetic Mean and Count of Numbers**

    - **Description:** Take several numbers from the user and write a
      > program that calculates the arithmetic mean and the count of the
      > numbers.

    - **Input:** A list of integers (e.g., \[4, 8, 6\]).

    - **Output:** The arithmetic mean and the count of the numbers
      > (e.g., \"Average: 6.0, Count: 3\").

6.  **Task 6: Power Calculation and Division**

    - **Description:** Take two numbers from the user: base and
      > exponent. Write a program that calculates the power of the base
      > raised to the exponent and divides the base by the exponent.

    - **Input:** Two integers, base and exponent (e.g., 2 and 3).

    - **Output:** The result of the power and the division (e.g.,
      > \"Power: 8, Division: 0.67\").

7.  **Task 7: Fibonacci Sequence and Sum of Elements**

    - **Description:** Take a number from the user and write a program
      > that generates the Fibonacci sequence up to that number and
      > calculates the sum of the elements in the sequence.

    - **Input:** An integer (e.g., 7).

    - **Output:** The Fibonacci sequence and the sum of the elements
      > (e.g., \"Fibonacci: \[0, 1, 1, 2, 3, 5, 8, 13\], Sum: 33\").

8.  **Task 8: Finding Repeated Characters and Their Count**

    - **Description:** Take a string from the user and write a program
      > that finds the repeated characters in the string and their
      > count.

    - **Input:** A string (e.g., \"hello\").

    - **Output:** The repeated characters and their count (e.g., \"l:
      > 2\").

9.  **Task 9: Finding the Largest, Smallest, and Middle Number**

    - **Description:** Take several numbers from the user and write a
      > program that finds the largest, smallest, and middle number
      > among them.

    - **Input:** A list of integers (e.g., \[4, 9, 2\]).

    - **Output:** The largest, smallest, and middle number (e.g.,
      > \"Largest: 9, Smallest: 2, Middle: 4\").

10. **Task 10: Reverse of a Number and Sum of its Digits**

    - **Description:** Take a number from the user and write a program
      > that calculates the reverse of the number and the sum of its
      > digits.

    - **Input:** An integer (e.g., 1234).

    - **Output:** The reverse of the number and the sum of its digits
      > (e.g., \"Reversed: 4321, Sum of digits: 10\").

**Intermediate Level**

11. **Task 11: Palindrome**

    - **Description:** Take a string from the user and write a program
      > to check if the characters in the string read the same forward
      > and backward.

    - **Input:** A string (e.g., \"racecar\").

    - **Output:** Whether the string is a palindrome or not (e.g.,
      > \"racecar is a palindrome\").

12. **Task 12: Prime Number**

    - **Description:** Take a number from the user and write a program
      > to check if the number is a prime number.

    - **Input:** An integer (e.g., 7).

    - **Output:** Whether the number is prime or not (e.g., \"7 is a
      > prime number\").

13. **Task 13: Search Number in Array**

    - **Description:** Given an array, write a program to check if a
      > specific number exists in the array.

    - **Input:** An array and a number to search (e.g., \[4, 7, 9\] and
      > 7).

    - **Output:** Whether the number is in the array (e.g., \"7 is in
      > the array\").

14. **Task 14: Product of Numbers**

    - **Description:** Take several numbers from the user and write a
      > program to calculate the product of these numbers.

    - **Input:** A list of integers (e.g., \[2, 3, 4\]).

    - **Output:** The product of the numbers (e.g., 24).

15. **Task 15: Matrix Addition**

    - **Description:** Given two matrices, write a program to calculate
      > their sum.

    - **Input:** Two matrices (e.g., \[\[1,2\],\[3,4\]\] and
      > \[\[5,6\],\[7,8\]\]).

    - **Output:** The sum of the matrices (e.g., \[\[6,8\],\[10,12\]\]).

16. **Task 16: Binary Search**

    - **Description:** Given a sorted array, write a program to perform
      > binary search to find a specific number.

    - **Input:** A sorted array and a number to search (e.g., \[1, 3, 5,
      > 7, 9\] and 5).

    - **Output:** Whether the number is in the array (e.g., \"5 is in
      > the array\").

17. **Task 17: Selection Sort**

    - **Description:** Write a program to sort an array using the
      > selection sort algorithm.

    - **Input:** An array (e.g., \[29, 10, 14, 37, 13\]).

    - **Output:** The sorted array (e.g., \[10, 13, 14, 29, 37\]).

18. **Task 18: Merge Sort**

    - **Description:** Write a program to sort an array using the merge
      > sort algorithm.

    - **Input:** An array (e.g., \[38, 27, 43, 3, 9, 82, 10\]).

    - **Output:** The sorted array (e.g., \[3, 9, 10, 27, 38, 43, 82\]).

19. **Task 19: Quick Sort**

    - **Description:** Write a program to sort an array using the quick
      > sort algorithm.

    - **Input:** An array (e.g., \[34, 7, 23, 32, 5, 62\]).

    - **Output:** The sorted array (e.g., \[5, 7, 23, 32, 34, 62\]).

20. **Task 20: GCD (Greatest Common Divisor)**

    - **Description:** Write a program to calculate the greatest common
      > divisor (GCD) of two numbers.

    - **Input:** Two integers (e.g., 56 and 98).

    - **Output:** The greatest common divisor (e.g., 14).

**Advanced Level**

21. **Task 21: Dijkstra Algorithm**

    - **Description:** Write a program to implement Dijkstra\'s
      > algorithm for finding the shortest paths from a starting node to
      > all other nodes in a graph.

    - **Input:** A graph represented as an adjacency list and a starting
      > node (e.g., {0: {1: 4, 2: 1}, 1: {3: 1}, 2: {1: 2, 3: 5}, 3: {}}
      > and starting node 0).

    - **Output:** The shortest paths to all nodes (e.g., {0: 0, 2: 1, 1:
      > 3, 3: 4}).

22. **Task 22: Minimum Spanning Tree (Prim\'s Algorithm)**

    - **Description:** Write a program to implement Prim\'s algorithm
      > for finding the minimum spanning tree of a graph.

    - **Input:** A graph represented as an adjacency list (e.g., {0: {1:
      > 2, 3: 6}, 1: {0: 2, 2: 3, 3: 8}, 2: {1: 3, 3: 7}, 3: {0: 6, 1:
      > 8, 2: 7}}).

    - **Output:** The edges of the minimum spanning tree and the total
      > weight (e.g., edges: {(0, 1), (1, 2), (2, 3)}, weight: 12).

23. **Task 23: Longest Common Subsequence**

    - **Description:** Write a program to find the longest common
      > subsequence (LCS) between two strings.

    - **Input:** Two strings (e.g., \"AGGTAB\" and \"GXTXAYB\").

    - **Output:** The longest common subsequence (e.g., \"GTAB\").

24. **Task 24: Backtracking Algorithm**

    - **Description:** Write a program to implement a backtracking
      > algorithm to solve a given problem (e.g., the 8-queens problem).

    - **Input:** Constraints and a starting point (e.g., an empty
      > chessboard for the 8-queens problem).

    - **Output:** All possible solutions that satisfy the constraints
      > (e.g., all valid configurations for the 8-queens problem).

25. **Task 25: Subset Sum Problem (Dynamic Programming)**

    - **Description:** Write a program to solve the subset sum problem
      > using dynamic programming.

    - **Input:** A list of integers and a target sum (e.g., \[3, 34, 4,
      > 12, 5, 2\] and target sum 9).

    - **Output:** A subset of numbers that add up to the target sum
      > (e.g., \[4, 5\]).

26. **Task 26: Huffman Coding**

    - **Description:** Write a program to implement Huffman coding for
      > text compression.

    - **Input:** A string (e.g., \"this is an example for huffman
      > encoding\").

    - **Output:** The encoded string and the Huffman tree.

27. **Task 27: Bellman-Ford Algorithm**

    - **Description:** Write a program to implement the Bellman-Ford
      > algorithm for finding the shortest paths in a graph with
      > negative edge weights.

    - **Input:** A graph represented as an adjacency list and a starting
      > node (e.g., {0: {1: 4, 2: -3}, 1: {3: 5}, 2: {1: 2, 3: 3}, 3:
      > {}} and starting node 0).

    - **Output:** The shortest paths to all nodes (e.g., {0: 0, 2: -3,
      > 1: -1, 3: 2}).

28. **Task 28: Tarjan\'s Algorithm**

    - **Description:** Write a program to implement Tarjan\'s algorithm
      > for finding strongly connected components in a graph.

    - **Input:** A graph represented as an adjacency list (e.g., {0:
      > \[1\], 1: \[2\], 2: \[0, 3\], 3: \[4\], 4: \[5\], 5: \[3\]}).

    - **Output:** Strongly connected components (e.g., \[\[0, 1, 2\],
      > \[3, 4, 5\]\]).

29. **Task 29: Floyd-Warshall Algorithm**

    - **Description:** Write a program to implement the Floyd-Warshall
      > algorithm for finding the shortest paths between all pairs of
      > nodes in a graph.

    - **Input:** A graph represented as an adjacency matrix (e.g., {0:
      > {1: 3, 2: 5}, 1: {2: 1}, 2: {0: 2}}).

    - **Output:** The shortest path matrix (e.g., \[\[0, 3, 4\], \[∞, 0,
      > 1\], \[2, 5, 0\]\]).

30. **Task 30: Travelling Salesman Problem (TSP)**

    - **Description:** Write a program to solve the Travelling Salesman
      > Problem (TSP) for a given graph.

    - **Input:** A graph represented as an adjacency matrix (e.g., {0:
      > {1: 10, 2: 15, 3: 20}, 1: {0: 10, 2: 35, 3: 25}, 2: {0: 15, 1:
      > 35, 3: 30}, 3: {0: 20, 1: 25, 2: 30}}).

    - **Output:** The minimum distance and the route (e.g., \"Minimum
      > distance: 80, Route: 0 -\> 1 -\> 3 -\> 2 -\> 0\").

## Hotel ReentrantLock System

Java multithreading project using ReentrantLock.

### About Project
This project simulates guests booking rooms in a hotel.
Each guest runs in a separate thread, and only one guest can book a room at a time.
ReentrantLock ensures that threads acquire the lock before entering the room, providing mutual exclusion.

### Concepts Used
- Thread
- ReentrantLock
- Multithreading
- Thread coordination

### How It Works
- Multiple guest threads are created
- Each guest calls the `bookRoom()` method
- ReentrantLock ensures **only one guest** books a room at a time
- Other guests wait until the lock is released

### How to Run
javac HotelReentrantLock.java
java HotelReentrantLock

###  Sample Output
Guest-1 entered the hotel
Guest-1 checked out
Guest-2 entered the hotel
Guest-2 checked out
Guest-3 entered the hotel
Guest-3 checked out

### 👩‍💻 Author
Sakshi

package mult;

import java.util.concurrent.locks.ReentrantLock;

class Guest extends Thread {
    private Hotel hotel;

    Guest(Hotel hotel, String name) {
        super(name);
        this.hotel = hotel;
    }

    public void run() {
        hotel.bookRoom(getName());
    }
}

class Hotel {
    private ReentrantLock lock = new ReentrantLock();

    public void bookRoom(String guestName) {
        lock.lock();  // acquire the lock
        try {
            System.out.println(guestName + " entered the hotel");
            Thread.sleep(2000);  // simulate stay
            System.out.println(guestName + " checked out");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // release the lock
        }
    }
}

public class HotelReentrantLock {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        Guest g1 = new Guest(hotel, "Guest-1");
        Guest g2 = new Guest(hotel, "Guest-2");
        Guest g3 = new Guest(hotel, "Guest-3");

        g1.start();
        g2.start();
        g3.start();
    }
}

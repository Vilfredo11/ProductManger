package ProductManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    @Test
    public void testWhenFewProductsFound() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(321, "It", 500, "Stephen King");
        Book book2 = new Book(322, "The Shining", 550, "Stephen King");
        Book book3 = new Book(323, "Green Mile", 475, "Stephen King");
        Smartphone phone1 = new Smartphone(3, "Iphone 13", 65000, "Apple");
        Smartphone phone2 = new Smartphone(4, "Iphone 12 mini", 58000, "Apple");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(phone1);
        manager.add(phone2);
        Product[] actual = manager.searchBy("phone");
        Product[] expected = {phone1, phone2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testWhenOneProductFound() {
        Repository repo = new Repository();
        Manager manager1 = new Manager(repo);
        Book book1 = new Book(321, "It", 500, "Stephen King");
        Book book2 = new Book(322, "The Shining", 550, "Stephen King");
        Book book3 = new Book(323, "Green Mile", 475, "Stephen King");
        Smartphone phone1 = new Smartphone(4, "Iphone 12 mini", 58000, "Apple");
        Smartphone phone2 = new Smartphone(4, "Iphone 12 mini", 58000, "Apple");

        manager1.add(book1);
        manager1.add(book2);
        manager1.add(book3);
        manager1.add(phone1);
        manager1.add(phone2);
        Product[] actual = manager1.searchBy("It");
        Product[] expected = {book1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testWhenProductNotFound() {
        Repository repo = new Repository();
        Manager manager1 = new Manager(repo);
        Book book1 = new Book(321, "It", 500, "Stephen King");
        Book book2 = new Book(322, "The Shining", 550, "Stephen King");
        Book book3 = new Book(323, "Green Mile", 475, "Stephen King");
        Smartphone phone1 = new Smartphone(4, "Iphone 12 mini", 58000, "Apple");
        Smartphone phone2 = new Smartphone(4, "Iphone 12 mini", 58000, "Apple");

        manager1.add(book1);
        manager1.add(book2);
        manager1.add(book3);
        manager1.add(phone1);
        manager1.add(phone2);
        Product[] actual = manager1.searchBy("The Running Man");
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

}
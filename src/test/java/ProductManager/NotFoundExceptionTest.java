package ProductManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NotFoundExceptionTest {
    @Test
    public void testRemoveWhenProductNotExist() {
        Repository repo = new Repository();
        Book book1 = new Book(321, "It", 500, "Stephen King");
        Book book2 = new Book(322, "The Shining", 550, "Stephen King");
        Book book3 = new Book(323, "Green Mile", 475, "Stephen King");
        Smartphone phone1 = new Smartphone(4, "Iphone 12 mini", 58000, "Apple");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(phone1);

        Assertions.assertThrows(NotFoundException.class, () -> repo.removeById(10));
    }
}

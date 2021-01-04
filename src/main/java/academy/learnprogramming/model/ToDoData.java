package academy.learnprogramming.model;

import lombok.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ToDoData {

    // == fields ==
    private static int idValue = 1;

    private final List<TodoItem> items = new ArrayList<>();

    // == constructors ==
    public ToDoData() {

        // add some dummy data, using the addItem method so it sets the id field
        addItem(new TodoItem(1, "first details", "first details", LocalDate.now()));
        addItem(new TodoItem(2, "second details", "second details", LocalDate.now()));
        addItem(new TodoItem(3, "third details", "third details", LocalDate.now()));
    }

    // == public methods ==
    public List<TodoItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(@NonNull TodoItem toAdd) {
        toAdd.setId(idValue);
        items.add(toAdd);
        idValue++;
//        if (toAdd == null) {
//            throw new NullPointerException("toAdd is a required parameter.");
//        }

    }
    public void removeItem(int id) {
        ListIterator<TodoItem> itemIterator = items.listIterator();

        while (itemIterator.hasNext()) {
            TodoItem item = itemIterator.next();

            if (item.getId() == id) {
                itemIterator.remove();
                break;
            }
        }
    }

    public TodoItem getItem(int id) {
        for (TodoItem item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void updateItem(@NonNull TodoItem toUpdate) {
        ListIterator<TodoItem> itemIterator = items.listIterator();

        while (itemIterator.hasNext()) {
            TodoItem item = itemIterator.next();

            if (item.equals(toUpdate)) {
                itemIterator.set(toUpdate);
                break;
            }
        }

    }
}

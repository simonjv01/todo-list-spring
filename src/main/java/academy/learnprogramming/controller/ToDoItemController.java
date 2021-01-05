package academy.learnprogramming.controller;

import academy.learnprogramming.model.TodoData;
import academy.learnprogramming.util.Mappings;
import academy.learnprogramming.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ToDoItemController {

    // == model attributes ==
    @ModelAttribute
    public TodoData toDoData() {
        return new TodoData();
    }

    // http://localhost:8080/todo-list-spring/items
    @GetMapping(Mappings.ITEMS)
    public String items() {
        return ViewNames.ITEMS_LIST;
    }
}

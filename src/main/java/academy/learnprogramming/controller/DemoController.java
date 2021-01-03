package academy.learnprogramming.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {

    // http://localhost:8080/todo-list-spring/hello
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    // http://localhost:8080/todo-list-spring/welcome

    @GetMapping("welcome")
    public String welcome(Model model) {
        model.addAttribute("user", "Simon");
        log.info("model = {}", model);
        // prefix + name + suffix
        // /WEB-INF/view/welcome.jsp
        return "welcome";
    }
}

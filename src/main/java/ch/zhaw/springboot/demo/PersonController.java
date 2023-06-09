package ch.zhaw.springboot.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    
    private Map<Integer, Person> persons = new HashMap<>();

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        this.persons.put(1,new Person(1, "Barack Obama"));
        this.persons.put(2,new Person(2, "Donald Trump"));
        this.persons.put(3,new Person(3, "Joe Biden"));
        System.out.println("Init Data");
    }
    
    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable Integer id) {
        return this.persons.get(id);
    }

    @GetMapping("/test")
    public String test() {
        return "Das ist ein Test, funktionierst?";
    }

}
package com.scotiainterview.springbootBackend.Controller;

import com.scotiainterview.springbootBackend.Entity.TODO;
import com.scotiainterview.springbootBackend.Service.TODOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/note")
public class TODOController {
    @Autowired
    private TODOService todoService;
    @PostMapping(value = "/save")
    public String saveTODO(@RequestBody TODO todos)
    {
        todoService.saveorUpdate(todos);
        System.out.println(todos.toString());
        String response = "{_id=" + todos.get_id() + "}";
        return response;
    }
    @GetMapping(value = "/getAll")
    public Iterable<TODO>getTODOS()
    {
        return todoService.listAll();
    }
    @PutMapping(value= "/edit/{id}")
    public TODO update(@RequestBody TODO todo, @PathVariable(name="id")String _id)
    {
        todo.set_id(_id);
        todoService.saveorUpdate(todo);
        return todo;
    }
    @DeleteMapping(value="/delete/{id}")
    public void deleteTODO(@PathVariable("id") String _id)
    {
        todoService.deleteTODO(_id);
        System.out.println("Deleted item with id:" +_id);
    }
    @RequestMapping("/search/{id}")
    private TODO getTODO(@PathVariable(name="id") String _id)
    {
        return todoService.getTODOById(_id);
    }

}

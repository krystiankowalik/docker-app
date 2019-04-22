package com.example.me.postgresapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor(onConstructor = @__({@Autowired}))
@NoArgsConstructor
@Data
public class SampleController {

    private SampleService sampleService;

    @GetMapping("hello")
    public String hello(){
        return "hello2";
    }

    @GetMapping("all")
    public List<MyTable> getAllTables(){
        return sampleService.getMyTables();
    }
}

package com.example.me.postgresapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Data
@AllArgsConstructor(onConstructor = @__({@Autowired}))
@NoArgsConstructor
public class SampleService {

    private MyTableRepo myTableRepo;

    @Transactional
    public List<MyTable> getMyTables(){
        return myTableRepo.findAll();
    }

}

package com.carledwinj.endpoint;

import com.carledwinj.model.Student;
import com.carledwinj.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("student")
public class StudentEndpoint {

    @Autowired
    private DateUtil dateDefault;

    @RequestMapping(path="list", method = RequestMethod.GET)
    public List<Student> listAll(){

        System.out.println(dateDefault.formatLocalDateTimeToDatebaseStyle(LocalDateTime.now()));
        return asList(new Student("Carl"), new Student("Nataly"));
    }

}

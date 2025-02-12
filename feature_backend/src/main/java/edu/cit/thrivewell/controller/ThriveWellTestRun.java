package edu.cit.thrivewell.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThriveWellTestRun {
    @GetMapping("/")
    public String printName(){
        return "Hello Ashley Josh V. Vequiso";
    }
}

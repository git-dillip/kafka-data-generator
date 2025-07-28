package com.dillip.project.kafka_data_generator.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publish")
public class DataGeneratorController {

@PostMapping("/orderdata")
public ResponseEntity publishOrderData(){

    return new ResponseEntity<>("Sucess",HttpStatus.OK);
}
}

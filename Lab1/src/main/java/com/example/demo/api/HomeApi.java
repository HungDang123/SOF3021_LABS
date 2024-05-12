package com.example.demo.api;

import com.example.demo.entity.Name;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@RestController
public class HomeApi {
    @GetMapping("/getInformation")
    public ResponseEntity<?> doGetInformation(@RequestParam("ten")String name,@RequestParam("tuoi")String age){
        Map<String,String> result= new HashMap<String,String>();
        result.put("ten",name);
        result.put("tuoi",age);
        result.put("Lớp", "java5");
        return ResponseEntity.ok(result);

    }
    @GetMapping("/getInformationWithPathVariable/{name}")
    public ResponseEntity<?> doGetInformationWithPathVariable(@PathVariable String name){

        return ResponseEntity.ok(name);

    }
    @PostMapping("/getName")
    public ResponseEntity<Name> doName(@RequestBody Name namee){

        return ResponseEntity.ok(namee);
    }
}

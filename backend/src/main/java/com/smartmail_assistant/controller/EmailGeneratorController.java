package com.smartmail_assistant.controller;

import com.smartmail_assistant.dto.EmailRequest;
import com.smartmail_assistant.service.EmailGeneratorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class EmailGeneratorController {

    private final EmailGeneratorService emailGeneratorService;

//    public EmailGeneratorController(EmailGeneratorService emailGeneratorService) {
//        this.emailGeneratorService = emailGeneratorService;
//    }

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest) {
        String response = emailGeneratorService.generateEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }
}

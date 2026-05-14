package com.smartmail_assistant.service;

import com.smartmail_assistant.dto.EmailRequest;
import org.springframework.stereotype.Service;

@Service
public class EmailGeneratorService {
    public String generateEmailReply(EmailRequest emailRequest) {
        //Build the prompt
        String prompt = buildPrompt(emailRequest);
        //Craft the request
        //do request and get response
        //return response
        return "TODO";
    }

    private String buildPrompt(EmailRequest emailRequest) {
        StringBuilder prompt = new StringBuilder();
        prompt.append("Write a professional email reply. No subject line");
        if (emailRequest.getTone() != null && !emailRequest.getTone().isBlank()) {
            prompt.append("Tone: ").append(emailRequest.getTone()).append(".");
        }
        prompt.append("\nOriginal email: \n").append(emailRequest.getEmailContent());
        return prompt.toString();
    }
}

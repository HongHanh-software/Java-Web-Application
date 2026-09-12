package com.hotel.controller;

import com.hotel.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestEmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping(value = "/admin/test-email", produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public ResponseEntity<String> testEmail(
            @RequestParam(name = "to", defaultValue = "nganpln23@uef.edu.vn") String to) {
        String result = emailService.sendTestEmail(to);
        return ResponseEntity.ok(result);
    }
}

package com.rinku.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.rinku.entity.User;
import com.rinku.service.UserService;

import jakarta.mail.internet.MimeMessage;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    
    @Autowired
	private JavaMailSender javaMailSender;
    
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(User user) {
        userService.registerUser(user);
        return "redirect:/registrationSuccess"; // Redirect to a success page
    }

    @GetMapping("/registrationSuccess")
    public String showRegistrationSuccessPage() {
        return "registrationSuccess";
    }
    
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/generate-otp")
    public ResponseEntity<String> generateOTP(@RequestParam("email") String email) {
        // Check if the email is registered
        User user = userService.findByEmail(email);
        if (user != null) {
            // Generate OTP
            String otp = generateOTP();
            // Send OTP to the email
            sendOTPByEmail(email, otp);
            return ResponseEntity.ok(otp); // Return OTP value in the response body
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Email not found. Please register first.");
        }
    }
    
    @PostMapping("/verify-email") // Handle email verification
    public ResponseEntity<String> verifyEmail(@RequestParam("email") String email) {
        User user = userService.findByEmail(email);
        if (user != null) {
            return ResponseEntity.ok("true"); // Email exists
        } else {
            return ResponseEntity.ok("false"); // Email does not exist
        }
    }

    // Method to generate a random 6-digit OTP
    private String generateOTP() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);
        return String.valueOf(otp);
    }

    // Method to send OTP to the registered email
    public void sendOTPByEmail(String email, String otp) {
     
    	try {
        	MimeMessage message = javaMailSender.createMimeMessage();
        	MimeMessageHelper helper = new MimeMessageHelper(message);
        	
        	helper.setFrom("biswalrinkun46@gmail.com");
        	helper.setTo("mr.imbiswal@gmail.com");
        	helper.setSubject("Your OTP for registration");
        	helper.setText("Your OTP is: " + otp);
        	
        	javaMailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @PostMapping("/verify-otp")
    public String verifyOTP(@RequestParam("otp") String otp, @RequestParam("email") String email, RedirectAttributes redirectAttributes) {
        // Add logic to verify OTP here
        if (otpIsValid(otp)) {
            redirectAttributes.addFlashAttribute("success", "OTP verified successfully!");
        } else {
            redirectAttributes.addFlashAttribute("error", "Invalid OTP. Please try again.");
        }
        return "redirect:/login";
    }

    // Method to validate OTP (dummy implementation, replace with your actual logic)
    private boolean otpIsValid(String otp) {
        // Dummy implementation: OTP is valid if it's a 6-digit number
        return otp != null && otp.matches("\\d{6}");
    }
    
    @PostMapping("/login")
    public String login(@RequestParam("email") String email, Model model) {
        // Assuming you have a UserService that retrieves user information
        User user = userService.findByEmail(email);
        if (user != null) {
            model.addAttribute("username", user.getUserName());
            return "welcome"; // Redirect to the welcome page
        } else {
            // Handle invalid login, such as displaying an error message
            return "login"; // Redirect back to the login page
        }
    }

    
} //Class closing

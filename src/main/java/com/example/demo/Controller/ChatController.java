package com.example.demo.Controller;
import com.example.demo.DTO.ChatRequest;
import com.example.demo.Service.OpenAIService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ChatController {

    private final OpenAIService openAiService;

    public ChatController(OpenAIService openAiService) {
        this.openAiService = openAiService;
    }

    @PostMapping("/chat")
    public String chat(@RequestBody ChatRequest request) throws Exception {
        return openAiService.callGPT(request.getMessage());
    }
}
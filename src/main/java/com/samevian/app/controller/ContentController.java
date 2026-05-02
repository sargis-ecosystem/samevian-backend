package com.samevian.app.controller;

import com.samevian.app.service.ContentService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ContentController {

    private final ContentService service;

    public ContentController(ContentService service) {
        this.service = service;
    }

    @GetMapping("/docs")
    public List<String> listDocs() {
        return service.listMarkdownFiles();
    }

    @GetMapping(value = "/docs/{name}", produces = MediaType.TEXT_MARKDOWN_VALUE)
    public String getDoc(@PathVariable String name) {
        return service.readMarkdown(name);
    }

    @GetMapping("/organs")
    public Object getOrgans() {
        return service.readOrgans();
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP", "app", "samevian-backend");
    }
}

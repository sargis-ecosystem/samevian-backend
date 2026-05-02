package com.samevian.app.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContentService {

    private final PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
    private final ObjectMapper mapper = new ObjectMapper();

    public List<String> listMarkdownFiles() {
        try {
            Resource[] resources = resolver.getResources("classpath:/content/*.md");
            return Arrays.stream(resources)
                    .map(r -> r.getFilename())
                    .sorted()
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readMarkdown(String name) {
        try {
            if (!name.endsWith(".md")) name = name + ".md";
            Resource resource = resolver.getResource("classpath:/content/" + name);
            return StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("File not found: " + name, e);
        }
    }

    public Object readOrgans() {
        try {
            Resource resource = resolver.getResource("classpath:/content/organs.json");
            return mapper.readValue(resource.getInputStream(), Object.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

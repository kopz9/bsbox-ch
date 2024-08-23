package org.example.bbox.controller.dto;

import java.util.List;

public record ToolsDTO(String id, String title, String links, String description, List<String> tags) {
}

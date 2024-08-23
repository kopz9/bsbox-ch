package org.example.bbox.controller;

import org.apache.coyote.Response;
import org.example.bbox.controller.dto.ToolsDTO;
import org.example.bbox.entities.Tools;
import org.example.bbox.service.ToolsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tools")
public class ToolsController {


  private final ToolsService toolsService;

  public ToolsController (ToolsService toolsService) {
    this.toolsService = toolsService;
  }

  @GetMapping
  public ResponseEntity<List<Tools>> getTools(){
    List<Tools> tools = this.toolsService.getAllTools();
    return new ResponseEntity<>(tools, HttpStatus.OK);
  }

  @GetMapping("/tool")
  public ResponseEntity<String> getToolsByTag(@RequestParam String tags) {
    String toolsByTag = toolsService.findByTags(tags);
    return ResponseEntity.ok(toolsByTag);
  }

  @PostMapping
  public ResponseEntity<Tools> createTool(@RequestBody ToolsDTO tools){
    Tools newTool = toolsService.createTool(tools);
    return new ResponseEntity<>(newTool, HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Tools> deleteTool(@PathVariable("id") String id){
    toolsService.deleteTool(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }

}

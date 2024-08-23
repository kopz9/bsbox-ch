package org.example.bbox.service;

import org.example.bbox.controller.dto.ToolsDTO;
import org.example.bbox.entities.Tools;
import org.example.bbox.repository.ToolsRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ToolsService {

  private final ToolsRepository toolsRepository;

  public ToolsService (ToolsRepository toolsRepository) {
    this.toolsRepository = toolsRepository;
  }

  public List<Tools> getAllTools(){
    return toolsRepository.findAll();
  }

  public Tools createTool(ToolsDTO toolsDTO){
    Tools newTool = new Tools(toolsDTO);
    this.saveTool(newTool);
    return newTool;
  }

  public void saveTool(Tools tools){
    toolsRepository.save(tools);
  }

  public void deleteTool(String id){
    toolsRepository.deleteById(id);
  }

  public String findByTags(String title) {
    return toolsRepository.findByTags(Collections.singletonList(title)).toString();
  }


}


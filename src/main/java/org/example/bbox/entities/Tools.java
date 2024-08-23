package org.example.bbox.entities;

import org.example.bbox.controller.dto.ToolsDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "tb_tools")
public class Tools {

  @Id
  private String id;

  private String title;
  private String links;
  private String description;
  private List<String> tags;

  public Tools () {
  }

  public Tools(ToolsDTO toolsDTO) {
    this.title = toolsDTO.title();
    this.links = toolsDTO.links();
    this.description = toolsDTO.description();
    this.tags = toolsDTO.tags();
  }

  public String getId () {
    return id;
  }

  public void setId (String id) {
    this.id = id;
  }

  public String getTitle () {
    return title;
  }

  public void setTitle (String title) {
    this.title = title;
  }

  public String getLinks () {
    return links;
  }

  public void setLink (String links) {
    this.links = links;
  }

  public String getDescription () {
    return description;
  }

  public void setDescription (String description) {
    this.description = description;
  }

  public List<String> getTags () {
    return tags;
  }

  public void setTags (List<String> tags) {
    this.tags = tags;
  }

  public Tools (String id , String title , String links , String description , List<String> tags) {
    this.id = id;
    this.title = title;
    this.links = links;
    this.description = description;
    this.tags = tags;
  }
}

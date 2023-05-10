package com.study.springboot;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ContentDto {
    private int id;
    @NotNull(message="writer is null.")
    @NotEmpty(message="writer is empty.")
    @Size(min=3, max=10, message="writer min 3, max 10.")
    private String writer;
    @NotNull(message="content is null.")
    @NotEmpty(message="content is empty.")
    private String content;
	public ContentDto(int id,
			@NotNull(message = "writer is null.") @NotEmpty(message = "writer is empty.") @Size(min = 3, max = 10, message = "writer min 3, max 10.") String writer,
			@NotNull(message = "content is null.") @NotEmpty(message = "content is empty.") String content) {
		super();
		this.id = id;
		this.writer = writer;
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
    
    
}

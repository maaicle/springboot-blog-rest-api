package com.springboot.blog.payload;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@ApiModel(description = "Comment model information")
@Data
public class CommentDto {
    private long id;

    @ApiModelProperty(value = "Comment ID")
    @NotEmpty(message = "name should not be null or empty")
    private String name;

    @ApiModelProperty(value = "Comment email")
    @NotEmpty(message = "Email should not be null or empty")
    @Email
    private String email;

    @ApiModelProperty(value = "Comment body")
    @NotEmpty
    @Size(min = 10, message = "Body must be 10 or more characters")
    private String body;
}

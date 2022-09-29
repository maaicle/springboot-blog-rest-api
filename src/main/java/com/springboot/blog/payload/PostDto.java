package com.springboot.blog.payload;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@ApiModel(description = "Post Model information")
@Data
public class PostDto {

    @ApiModelProperty(value = "Blog post ID")
    private long id;

    @ApiModelProperty(value = "Blog post title")
    @NotEmpty
    @Size(min = 2, message = "Post title must be at least 2 characters")
    private String title;

    @ApiModelProperty(value = "Blog post description")
    @NotEmpty
    @Size(min = 5, message = "Post description must be at least 5 characters")
    private String description;

    @ApiModelProperty(value = "Blog post contet")
    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
}

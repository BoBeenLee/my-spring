package io.bobinlee.domain.post;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostForm {
    private String title;
    private String content;
    private String code;
    private PostStatus status;
}

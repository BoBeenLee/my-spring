package io.bobinlee.domain.post;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostView {
    private Long id;
    private String title;
    private String content;
    private String code;
    private PostStatus status;
    private LocalDateTime regDate;

    public static PostView of(Post post) {
        return PostView.builder()
                .id(post.getId())
                .title(post.getTitle())
                .content(post.getContent())
                .code(post.getCode())
                .status(post.getStatus())
                .regDate(post.getRegDate())
                .build();
    }
}

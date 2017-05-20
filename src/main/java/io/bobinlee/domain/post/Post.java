package io.bobinlee.domain.post;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String title;
    @Lob
    @Column
    private String content;
    @Column
    private String code;

    @Enumerated(EnumType.STRING)
    private PostStatus status;

    @Column
    private LocalDateTime regDate;

    public static Post of(PostForm postForm) {
        return Post.builder()
                .title(postForm.getTitle())
                .content(postForm.getContent())
                .code(postForm.getCode())
                .status(postForm.getStatus())
                .regDate(LocalDateTime.now())
                .build();
    }
}

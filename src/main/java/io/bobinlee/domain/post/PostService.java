package io.bobinlee.domain.post;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
@Transactional
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    @Transactional(readOnly = false)
    public void savePost(PostForm postForm) {
        postRepository.save(Post.of(postForm));
    }

    public List<PostView> findAll(Sort sort) {
        return postRepository.findAll(sort).stream()
                .map(PostView::of)
                .collect(Collectors.toList());
    }
}

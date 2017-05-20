package io.bobinlee.web;

import io.bobinlee.domain.post.Post;
import io.bobinlee.domain.post.PostForm;
import io.bobinlee.domain.post.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping
    public String listPost(Model model) {
        model.addAttribute("list", postService.findAll(new Sort(Sort.Direction.DESC, "id")));
        return "/post/index";
    }

    @GetMapping("/{id}")
    public String findByPost(@PathVariable Long id, Model model) {
        return "/post/post";
    }

    @GetMapping("/new")
    public String newPost() {
        return "/post/new";
    }

    @PostMapping
    public String createPost(@ModelAttribute PostForm postForm) {
        postService.savePost(postForm);
        return "redirect:/posts";
    }
}

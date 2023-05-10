package com.scaler.blogapi.comments;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/blogs/{blogId}/comments")
public class CommentsController {
}

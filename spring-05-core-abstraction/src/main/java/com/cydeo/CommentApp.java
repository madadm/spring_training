package com.cydeo;

import com.cydeo.config.CommentConfig;
import com.cydeo.model.Comment;
import com.cydeo.proxy.PushCommentNotificationProxy;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CommentConfig.class);

        Comment comment = new Comment();
        comment.setText("This is the best author ever");
        comment.setAuthor("Ernest Hemming");
        CommentService commentService = context.getBean(CommentService.class);
        //PushCommentNotificationProxy pushCommentNotificationProxy = context.getBean(PushCommentNotificationProxy.class);

        commentService.publishComment(comment);//Publishing comment through default proxy

        //commentService.publishComment(comment, pushCommentNotificationProxy);

    }
}

package com.music4real.MusicCatalog.album;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlbumController {

    @GetMapping("/album/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}

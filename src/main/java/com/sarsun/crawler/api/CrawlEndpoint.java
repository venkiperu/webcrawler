package com.sarsun.crawler.api;

import com.sarsun.crawler.Application;
import com.sarsun.crawler.service.CrawlerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CrawlEndpoint {
    private static final Logger LOG = LoggerFactory.getLogger(CrawlEndpoint.class);

    private static final String URL = "http://wiprodigital.com//";

    @Autowired
    private CrawlerService crawlerService;

    @GetMapping("/api/crawl")
    public String getCrawlInfo(){

        crawlerService.getPageLinks(URL, 0);

        return "ok";
    }

}

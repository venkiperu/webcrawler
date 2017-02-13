package com.sarsun.crawler.service;

import com.sarsun.crawler.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;


@Service
public class CrawlerService {

    private static final Logger LOG = LoggerFactory.getLogger(CrawlerService.class);

    private HashSet<String> links;

    private static final int MAX_DEPTH = 2;


    public void getPageLinks(String URL, int depth) {

        links = new HashSet<String>();

        if ((!links.contains(URL) && (depth < MAX_DEPTH))) {

            LOG.info(">> Depth: " + depth + " [" + URL + "]");
            try {

                Document document = Jsoup.connect(URL).get();
                Elements linksOnPage = document.select("a[href]");

                depth++;

                for (Element page : linksOnPage) {

                    if(!page.toString().contains("twitter") )  {
                        LOG.info("Page :" + page.toString());
                        getPageLinks(page.attr("abs:href"), depth);
                    }


                }
            } catch (IOException e) {
                LOG.error("For '" + URL + "': " + e.getMessage());
            }
        }
    }


}

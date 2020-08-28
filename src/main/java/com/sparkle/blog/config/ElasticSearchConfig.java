package com.sparkle.blog.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticSearchConfig {

    @Value("${elasticsearch.host}")
    private String host;

    @Value("${elasticsearch.port}")
    private Integer port;

    @Value("${elasticsearch.schemeName}")
    private String schemeName;

    @Bean
    public RestHighLevelClient restHighLevelClient () {
        HttpHost httpHost = new HttpHost(host, port, schemeName);
        RestHighLevelClient restHighLevelClient = new RestHighLevelClient(
                RestClient.builder(httpHost)
        );
        return restHighLevelClient;
    }
}

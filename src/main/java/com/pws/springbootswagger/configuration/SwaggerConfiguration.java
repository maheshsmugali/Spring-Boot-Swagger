package com.pws.springbootswagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration

public class SwaggerConfiguration {
    @Bean
    public Docket postsApi() {

        return new Docket(DocumentationType.SWAGGER_2).groupName("xadmin").apiInfo(apiInfo()).select()

                .paths(regex("/course.*")).build();

    }
    private ApiInfo apiInfo() {

        return new ApiInfoBuilder().title("Course API")

                .description("xadmin Course API Documentation Generateed Using SWAGGER2 for our Course Rest API")

                .termsOfServiceUrl("https://www.youtube.com/channel/UC-85Tmx8lhNZQmBNbxZiqkw")

                .license("Xadmin Rest API License")

                .version("1.0").build();

    }

    }


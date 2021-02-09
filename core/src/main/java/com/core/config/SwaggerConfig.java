package halla.holdings.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
class SwaggerConfig {

    @Bean
    Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("halla.holdings.*.*.controller"))
                .build()
                .apiInfo(this.metaInfo());
    }

    private ApiInfo metaInfo() {
        return new ApiInfoBuilder()
                .title("API 문서")
                .description("테스트 API 문서입니다.")
                .version("1.0")
                .termsOfServiceUrl("http://terms.com")
                .license("Apache")
                .licenseUrl("http://license.com")
//                .contact(
//                        Contact(
//                                "Baegoony",
//                                "http://baegoon.kr",
//                                "baegoony@gmail.com"
//                        )
//                )
                .build();
    }
}


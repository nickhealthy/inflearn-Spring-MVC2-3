package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class ItemServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemServiceApplication.class, args);
    }

    /**
     * 메시지란? - 다양한 메시지를 한 곳에서 관리하도록 하는 기능
     * <p>
     * 수동으로 MessageSource 등록하는 방법
     * <p>
     * basenames: 설정 파일 이름을 지정한다.
     * - messages 로 지정하면 messages.properties 파일을 읽어서 사용
     * defualtEncoding: 인코딩 정보를 지정한다.
     * <p>
     * MessageSource를 스프링 빈으로 등록하지 않고, 스프링 부트와 관련된 별도의 설정을 하지 않으면 messages 라는 이름으로 기본 등록된다.
     */
    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasenames("messages", "errors");
        messageSource.setDefaultEncoding("utf-8");
        return messageSource;
    }

}

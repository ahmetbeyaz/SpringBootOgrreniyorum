package bean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfTestBean {

    @Bean(value = "testbean123")
    public TestBean testBean(){

        return  new TestBean();
    }

    // Bean Yapısı
    //1-Geliştiricinin kendisi oluşturur
    //2-Spring Framework uygulamasının omurgasını oluşturur
    //Spring IOC tarafından yönetilen neslere Bean denir
    //Bean anotasyonunu kendimiz yazmadığımız durumlarda kullanabiliriz
    //Bean anotasyonunun kullanıldığı durumlarda bir tane nesne oluşturulur ve return edilir
    //Return edilen bu nesne SpringIOC içine gönderilir.

}

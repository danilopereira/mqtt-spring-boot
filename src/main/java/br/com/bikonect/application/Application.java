package br.com.bikonect.application;

import br.com.bikonect.mqtt.MqttConsumer;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * Created by danilopereira on 26/08/17.
 */

@SpringBootApplication
@ComponentScan(value = {"br.com.bikonect.command"})
public class Application{
    public static void main(String [] args){
        //disabled banner, don't want to see the spring logo
        SpringApplication app = new SpringApplication(Application.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}

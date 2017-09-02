package br.com.bikonect.command;

import br.com.bikonect.mqtt.MqttConsumer;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by danilopereira on 02/09/17.
 */
@Component
public class MqttCommand implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        MqttConsumer mqttConsumer = new MqttConsumer();
        try {
            MqttClient client = mqttConsumer.consume();
            System.out.println(client.isConnected());

            client.subscribe("iot_data");
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
}

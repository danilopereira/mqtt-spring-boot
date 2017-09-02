package br.com.bikonect.task;

import br.com.bikonect.mqtt.MqttConsumer;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;

/**
 * Created by danilopereira on 26/08/17.
 */
public class MQTTTask implements Runnable {
    @Override
    public void run() {
        MqttConsumer mqttConsumer = new MqttConsumer();
        try {
            MqttClient client = mqttConsumer.consume();

            client.subscribe("iot_data");
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }
}
